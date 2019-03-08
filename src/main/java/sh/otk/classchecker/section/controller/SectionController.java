package sh.otk.classchecker.section.controller;

import com.alibaba.fastjson.JSONObject;
import org.apache.ibatis.annotations.Param;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import sh.otk.classchecker.classes.model.Classes;
import sh.otk.classchecker.classes.model.ClassesExample;
import sh.otk.classchecker.classes.service.ClassesService;

import sh.otk.classchecker.section.model.Sections;
import sh.otk.classchecker.section.model.SectionsExample;
import sh.otk.classchecker.section.service.SectionService;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RestController
public class SectionController {
    private final SectionService sectionService;
    private final ClassesService classessService;
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    public SectionController(ClassesService classessService, SectionService sectionService) {
        this.classessService = classessService;
        this.sectionService = sectionService;
    }

    @GetMapping("/sections/updateSubject")
    public JSONObject updateForSubject(@Param("subject") String subject, @Param("term") int term) {
        JSONObject jsonObject = new JSONObject();
        updateSubject(subject, term);
        jsonObject.put("subject", subject);
        jsonObject.put("term", term);
        jsonObject.put("status", 0);
        return jsonObject;
    }

    @GetMapping("/sections/updateAllSubject")
    public JSONObject updateAllSubject(@Param("term") int term) {
        JSONObject jsonObject = new JSONObject();
        String[] SUBJECTS = {"ADMJ", "ADMPS", "AFRCNA", "AFROTC", "ANTH", "ARABIC", "ARTSC", "ASL", "ASTRON", "ATHLTR", "BACC", "BCHS",
                "BECN", "BFAE", "BFIN", "BHRM", "BIND", "BIOENG", "BIOETH", "BIOINF", "BIOSC", "BIOST", "BMIS", "BMKT",
                "BOAH", "BORG", "BQOM", "BSEO", "BSPP", "BUS", "BUSACC", "BUSADM", "BUSBIS", "BUSECN", "BUSENV", "BUSERV",
                "BUSFIN", "BUSHRM", "BUSMKT", "BUSORG", "BUSQOM", "BUSSCM", "BUSSPP", "CDACCT", "CDENT", "CEE", "CGS",
                "CHE", "CHEM", "CHIN", "CLASS", "CLRES", "CLST", "CMME", "CMMUSIC", "CMPBIO", "CMPINF", "COE", "COEA",
                "COEE", "COMMRC", "CS", "CSD", "DENHYG", "DENT", "DIASCI", "DMED", "DSANE", "DUPOSC", "EAS", "ECE", "ECON",
                "EDUC", "EM", "ENDOD", "ENGCMP", "ENGFLM", "ENGLIT", "ENGR", "ENGSCI", "ENGWRT", "ENRES", "EOH", "EPIDEM",
                "FACDEV", "FILMG", "FILMST", "FP", "FR", "FTADMA", "FTDA", "FTDB", "FTDC", "FTDJ", "FTDR", "GEOL", "GER",
                "GERON", "GREEK", "GREEKM", "GSWS", "HAA", "HEBREW", "HIM", "HINDI", "HIST", "HONORS", "HPA", "HPM", "HPS",
                "HRS", "HUGEN", "IDM", "IE", "IL", "IMB", "INFSCI", "INTBP", "IRISH", "ISB", "ISSP", "ITAL", "JPNSE", "JS",
                "KOREAN", "LATIN", "LAW", "LCTL", "LDRSHP", "LEGLST", "LING", "LIS", "LSAP", "MATH", "ME", "MED", "MEDEDU",
                "MEMS", "MILS", "MOLBPH", "MSBMS", "MSCBIO", "MSCBMP", "MSCMP", "MSE", "MSMBPH", "MSMGDB", "MSMI", "MSMPHL",
                "MSMVM", "MSNBIO", "MUSIC", "NEURO", "NPHS", "NROSCI", "NUR", "NURCNS", "NURNM", "NURNP", "NURSAN", "NURSP",
                "NUTR", "ODO", "ORBIOL", "ORSUR", "OT", "PAS", "PEDC", "PEDENT", "PEDS", "PERIO", "PERS", "PETE", "PHARM",
                "PHIL", "PHYS", "PIA", "POLISH", "PORT", "PROSTH", "PS", "PSY", "PSYC", "PSYED", "PT", "PUBHLT", "PUBSRV",
                "PWEA", "QUECH", "REHSCI", "REL", "RELGST", "RESTD", "RUSS", "SA", "SERCRO", "SLAV", "SLOVAK", "SOC",
                "SOCWRK", "SPAN", "STAT", "SWAHIL", "SWBEH", "SWCED", "SWCOSA", "SWE", "SWGEN", "SWINT", "SWRES", "SWWEL",
                "TELCOM", "THEA", "TURKSH", "UKRAIN", "URBNST", "VIET"};
        for (String subject : SUBJECTS) {
            Thread t = new Thread(() -> {
                logger.info("Updating Subject Sections for " + subject + "in term:" + term);
                updateSubject(subject, term);
                logger.info("Finished Subject Update For " + subject + "for term: " + term);
            });
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                logger.error(e.getMessage());
            }
            t.start();

        }
        return jsonObject;
    }

    @GetMapping("/sections/updateSections")
    public JSONObject updateSection(@Param("subject") String subject, @Param("term") int term) {
        JSONObject jsonObject = new JSONObject();
        ClassesExample classesExample = new ClassesExample();
        classesExample.createCriteria().andSubjectEqualTo(subject).andTermEqualTo(term);
        List<Classes> classesArrayList = classessService.selectbyExample(classesExample);
        updateSections(classesArrayList);
        jsonObject.put("subject", subject);
        jsonObject.put("term", term);
        jsonObject.put("status", 0);
        return jsonObject;
    }

    private void updateSubject(String subject, int term) {
        try {
            Document document = Jsoup.connect("https://psmobile.pitt.edu/app/catalog/listclasses/" + term + "/" + subject.toUpperCase()).get();
            Element element = document.body().getElementsByClass("main").get(0).getElementsByTag("section").get(0).getElementsByTag("section").get(1);
            for (Element e : element.getElementsByTag("a")) {
                Classes classes = new Classes();
                try {
                    e = e.select("a[href]").get(0);
                    classes.setClassUrl(e.attr("href"));
                    classes.setSubject(subject.toUpperCase());
                    String tittleBar[] = e.getAllElements().get(1).text().split(" - ");
                    classes.setClassTittle(tittleBar[1]);
                    classes.setClassNum(Integer.parseInt(tittleBar[0].replace("C", "").replace("D", "").replace("L", "")));
                    classes.setTerm(term);
                    classessService.insert(classes);
                } catch (Exception e2) {
                    logger.error(e2.getMessage());
                }
            }
        } catch (IOException e) {
            logger.error(e.getMessage());
        }
    }

    private void updateSections(List<Classes> classesList) {
        try {
            for (Classes c : classesList) {
                Document document = Jsoup.connect(c.getClassUrl()).get();
                Elements elements = document.body().getElementsByTag("section").get(0).children().get(3).getElementById("course-sections").getElementsByClass("section-content");
                for (Element element : elements) {
                    Sections section = new Sections();
                    section.setSubject(c.getSubject());
                    section.setSubjectNum(c.getClassNum());
                    section.setTerm(c.getTerm());
                    for (Element attribute : element.getElementsByClass("section-body")) {
                        if (attribute.hasClass("strong")) {
                            Pattern pattern = Pattern.compile("(?<=\\()[^\\)]+");
                            Matcher matcher = pattern.matcher(attribute.ownText());
                            while (matcher.find()) {
                                section.setCourseNum(Integer.parseInt(matcher.group()));
                            }
                            pattern = Pattern.compile("-\\d\\d\\d\\d");
                            matcher = pattern.matcher(attribute.ownText());
                            while (matcher.find()) {
                                section.setSectionNum(Integer.parseInt(matcher.group().replace("-", "")));
                            }
                        } else {
                            String[] attributes = attribute.ownText().split(": ");
                            if (attributes[0].contains("Session")) {
                                section.setSeession(attributes[1]);
                            } else if (attributes[0].contains("Days/Times") && !attributes[1].contains("TBA") && !attributes[1].contains("TBR")) {
                                if (attributes[1].contains("Mo")) {
                                    section.setMeetMon((byte) 1);
                                }
                                if (attributes[1].contains("Tu")) {
                                    section.setMeetTue((byte) 1);
                                }
                                if (attributes[1].contains("We")) {
                                    section.setMeetWed((byte) 1);
                                }
                                if (attributes[1].contains("Th")) {
                                    section.setMeetThu((byte) 1);
                                }
                                if (attributes[1].contains("Fr")) {
                                    section.setMeetFri((byte) 1);
                                }
                                String time[] = attributes[1].split(" ");
                                DateFormat df = new SimpleDateFormat("hh:mma");
                                section.setStartTime(df.parse(time[1]));
                                section.setEndTime(df.parse(time[3]));
                            } else if (attributes[0].contains("Room")) {
                                section.setRoom(attributes[1]);
                            } else if (attributes[0].contains("Instructor")) {
                                section.setInstructor(attributes[1]);
                            } else if (attributes[0].contains("Type")) {
                                if (attributes[1].contains("REC")) {
                                    section.setIsRec((byte) 1);
                                }
                            }
                        }
                    }
                    if (element.parent().hasClass("list-item__link")) {
                        section = analyzeLectureSection(section, element.parent().attr("href"));
                    }
                    sectionService.insert(section);
                }

            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    private Sections analyzeLectureSection(Sections sections, String url) {
        try {
            Document document = Jsoup.connect(url).get();
            Element element = document.body().getElementsByTag("section").get(0).children().get(4);
            sections.setTittle(element.getElementsByClass("primary-head").get(0).text());
            Elements elements = element.getElementsByClass("clearfix");
            for (Element attribute : elements) {
                String key;
                String value;
                if (attribute.children().size() == 2) {
                    key = attribute.children().get(0).children().get(0).ownText();
                    value = attribute.children().get(1).children().get(0).ownText();
                } else {
                    key = attribute.children().get(1).children().get(0).ownText();
                    value = attribute.children().get(2).children().get(0).ownText();
                }

                if (key.contains("Career")) {
                    sections.setCareer(value);
                } else if (key.contains("Class Number")) {
                    sections.setClassNum(Integer.parseInt(value));
                } else if (key.contains("Units")) {

                    if (value.contains("-")) {
                        sections.setUnit(0);
                    } else {
                        sections.setUnit(Integer.parseInt(value.replace(" units", "")));
                    }
                } else if (key.contains("Grading")) {
                    sections.setGrading(value);
                } else if (key.contains("Description")) {
                    sections.setDescription(value);
                } else if (key.contains("Class Attributes")) {
                    sections.setClassAttribute(value.replace("\n", ";"));
                } else if (key.contains("Dates")) {
                    String dates[] = value.split(" - ");
                    SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
                    sections.setStartDate(df.parse(dates[0]));
                    sections.setEndDate(df.parse(dates[1]));
                } else if (key.contains("Components")) {
                    if (attribute.children().size() == 2) {

                        value = attribute.children().get(1).children().get(0).children().get(0).children().get(0).children().get(0).children().get(0).ownText();
                    } else {

                        value = attribute.children().get(2).children().get(0).children().get(0).children().get(0).children().get(0).children().get(0).ownText();
                    }
                    if (value.contains("Recitation")) {
                        sections.setRequireRec((byte) 1);
                    }
                    if (value.contains("Lecture")) {
                        sections.setRequireLec((byte) 1);
                    }
                    if (value.contains("Lab")) {
                        sections.setReqireLab((byte) 1);
                    }
                } else if (key.contains("Status")) {
                    if (value.contains("Open")) {
                        sections.setCurrentStatus(0);
                    }
                } else if (key.contains("Class Capacity")) {
                    sections.setClassCap(Integer.parseInt(value));
                } else if (key.contains("Wait List Capacity")) {
                    sections.setClassCap(Integer.parseInt(value));
                } else if (key.contains("Campus")) {
                    sections.setCampus(value);
                } else if (key.contains("Location")) {
                    sections.setLocation(value);
                } else if (key.contains("Enrollment Requirements")) {
                    sections.setPreq(value);
                }
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return sections;
    }

    @GetMapping("/sections/{subject}/{term:[\\d]+}")
    public List<Sections> getSections(@PathVariable String subject, @PathVariable int term) {
        SectionsExample sectionsExample = new SectionsExample();
        sectionsExample.createCriteria().andSubjectEqualTo(subject).andTermEqualTo(term);
        return sectionService.getByExample(sectionsExample);

    }
}
