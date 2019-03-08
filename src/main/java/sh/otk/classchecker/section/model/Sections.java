package sh.otk.classchecker.section.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

@TableName(value = "sections")
public class Sections implements Serializable {
     @TableId(value = "SECTION_ID", type = IdType.AUTO)
    private Integer sectionId;

    @TableField(value = "SEESSION")
    private String seession;

    @TableField(value = "CLASS_NUM")
    private Integer classNum;

    @TableField(value = "UNIT")
    private Integer unit;

    @TableField(value = "GRADING")
    private String grading;

    @TableField(value = "DESCRIPTION")
    private String description;

    @TableField(value = "PREQ")
    private String preq;

    @TableField(value = "REQUIRE_LEC")
    private Byte requireLec;

    @TableField(value = "REQUIRE_REC")
    private Byte requireRec;

    @TableField(value = "REQIRE_LAB")
    private Byte reqireLab;

    @TableField(value = "IS_REC")
    private Byte isRec;

    @TableField(value = "MEET_MON")
    private Byte meetMon;

    @TableField(value = "MEET_TUE")
    private Byte meetTue;

    @TableField(value = "MEET_WED")
    private Byte meetWed;

    @TableField(value = "MEET_THU")
    private Byte meetThu;

    @TableField(value = "MEET_FRI")
    private Byte meetFri;

    @TableField(value = "START_TIME")
    private Date startTime;

    @TableField(value = "END_TIME")
    private Date endTime;

    @TableField(value = "START_DATE")
    private Date startDate;

    @TableField(value = "END_DATE")
    private Date endDate;

    @TableField(value = "ROOM")
    private String room;

    @TableField(value = "CAMPUS")
    private String campus;

    @TableField(value = "LOCATION")
    private String location;

    @TableField(value = "TEXTBOOK")
    private String textbook;

    @TableField(value = "CURRENT_STATUS")
    private Integer currentStatus;

    @TableField(value = "CLASS_CAP")
    private Integer classCap;

    @TableField(value = "WAITLIST_CAP")
    private Integer waitlistCap;

    @TableField(value = "SUBJECT")
    private String subject;

    @TableField(value = "SUBJECT_NUM")
    private Integer subjectNum;

    @TableField(value = "SECTION_NUM")
    private Integer sectionNum;

    @TableField(value = "COURSE_NUM")
    private Integer courseNum;

    @TableField(value = "TERM")
    private Integer term;

    @TableField(value = "TITTLE")
    private String tittle;

    @TableField(value = "CLASS_ATTRIBUTE")
    private String classAttribute;

    @TableField(value = "INSTRUCTOR")
    private String instructor;

    @TableField(value = "CAREER")
    private String career;

    private static final long serialVersionUID = 1L;

    public static final String COL_SEESSION = "SEESSION";

    public static final String COL_CLASS_NUM = "CLASS_NUM";

    public static final String COL_UNIT = "UNIT";

    public static final String COL_GRADING = "GRADING";

    public static final String COL_DESCRIPTION = "DESCRIPTION";

    public static final String COL_PREQ = "PREQ";

    public static final String COL_REQUIRE_LEC = "REQUIRE_LEC";

    public static final String COL_REQUIRE_REC = "REQUIRE_REC";

    public static final String COL_REQIRE_LAB = "REQIRE_LAB";

    public static final String COL_IS_REC = "IS_REC";

    public static final String COL_MEET_MON = "MEET_MON";

    public static final String COL_MEET_TUE = "MEET_TUE";

    public static final String COL_MEET_WED = "MEET_WED";

    public static final String COL_MEET_THU = "MEET_THU";

    public static final String COL_MEET_FRI = "MEET_FRI";

    public static final String COL_START_TIME = "START_TIME";

    public static final String COL_END_TIME = "END_TIME";

    public static final String COL_START_DATE = "START_DATE";

    public static final String COL_END_DATE = "END_DATE";

    public static final String COL_ROOM = "ROOM";

    public static final String COL_CAMPUS = "CAMPUS";

    public static final String COL_LOCATION = "LOCATION";

    public static final String COL_TEXTBOOK = "TEXTBOOK";

    public static final String COL_CURRENT_STATUS = "CURRENT_STATUS";

    public static final String COL_CLASS_CAP = "CLASS_CAP";

    public static final String COL_WAITLIST_CAP = "WAITLIST_CAP";

    public static final String COL_SUBJECT = "SUBJECT";

    public static final String COL_SUBJECT_NUM = "SUBJECT_NUM";

    public static final String COL_SECTION_NUM = "SECTION_NUM";

    public static final String COL_COURSE_NUM = "COURSE_NUM";

    public static final String COL_TERM = "TERM";

    public static final String COL_TITTLE = "TITTLE";

    public static final String COL_CLASS_ATTRIBUTE = "CLASS_ATTRIBUTE";

    public static final String COL_INSTRUCTOR = "INSTRUCTOR";

    public static final String COL_CAREER = "CAREER";

    /**
     * @return SECTION_ID
     */
    public Integer getSectionId() {
        return sectionId;
    }

    /**
     * @param sectionId
     */
    public void setSectionId(Integer sectionId) {
        this.sectionId = sectionId;
    }

    /**
     * @return SEESSION
     */
    public String getSeession() {
        return seession;
    }

    /**
     * @param seession
     */
    public void setSeession(String seession) {
        this.seession = seession == null ? null : seession.trim();
    }

    /**
     * @return CLASS_NUM
     */
    public Integer getClassNum() {
        return classNum;
    }

    /**
     * @param classNum
     */
    public void setClassNum(Integer classNum) {
        this.classNum = classNum;
    }

    /**
     * @return UNIT
     */
    public Integer getUnit() {
        return unit;
    }

    /**
     * @param unit
     */
    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    /**
     * @return GRADING
     */
    public String getGrading() {
        return grading;
    }

    /**
     * @param grading
     */
    public void setGrading(String grading) {
        this.grading = grading == null ? null : grading.trim();
    }

    /**
     * @return DESCRIPTION
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * @return PREQ
     */
    public String getPreq() {
        return preq;
    }

    /**
     * @param preq
     */
    public void setPreq(String preq) {
        this.preq = preq == null ? null : preq.trim();
    }

    /**
     * @return REQUIRE_LEC
     */
    public Byte getRequireLec() {
        return requireLec;
    }

    /**
     * @param requireLec
     */
    public void setRequireLec(Byte requireLec) {
        this.requireLec = requireLec;
    }

    /**
     * @return REQUIRE_REC
     */
    public Byte getRequireRec() {
        return requireRec;
    }

    /**
     * @param requireRec
     */
    public void setRequireRec(Byte requireRec) {
        this.requireRec = requireRec;
    }

    /**
     * @return REQIRE_LAB
     */
    public Byte getReqireLab() {
        return reqireLab;
    }

    /**
     * @param reqireLab
     */
    public void setReqireLab(Byte reqireLab) {
        this.reqireLab = reqireLab;
    }

    /**
     * @return IS_REC
     */
    public Byte getIsRec() {
        return isRec;
    }

    /**
     * @param isRec
     */
    public void setIsRec(Byte isRec) {
        this.isRec = isRec;
    }

    /**
     * @return MEET_MON
     */
    public Byte getMeetMon() {
        return meetMon;
    }

    /**
     * @param meetMon
     */
    public void setMeetMon(Byte meetMon) {
        this.meetMon = meetMon;
    }

    /**
     * @return MEET_TUE
     */
    public Byte getMeetTue() {
        return meetTue;
    }

    /**
     * @param meetTue
     */
    public void setMeetTue(Byte meetTue) {
        this.meetTue = meetTue;
    }

    /**
     * @return MEET_WED
     */
    public Byte getMeetWed() {
        return meetWed;
    }

    /**
     * @param meetWed
     */
    public void setMeetWed(Byte meetWed) {
        this.meetWed = meetWed;
    }

    /**
     * @return MEET_THU
     */
    public Byte getMeetThu() {
        return meetThu;
    }

    /**
     * @param meetThu
     */
    public void setMeetThu(Byte meetThu) {
        this.meetThu = meetThu;
    }

    /**
     * @return MEET_FRI
     */
    public Byte getMeetFri() {
        return meetFri;
    }

    /**
     * @param meetFri
     */
    public void setMeetFri(Byte meetFri) {
        this.meetFri = meetFri;
    }

    /**
     * @return START_TIME
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * @param startTime
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * @return END_TIME
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * @param endTime
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * @return START_DATE
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * @param startDate
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * @return END_DATE
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * @param endDate
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * @return ROOM
     */
    public String getRoom() {
        return room;
    }

    /**
     * @param room
     */
    public void setRoom(String room) {
        this.room = room == null ? null : room.trim();
    }

    /**
     * @return CAMPUS
     */
    public String getCampus() {
        return campus;
    }

    /**
     * @param campus
     */
    public void setCampus(String campus) {
        this.campus = campus == null ? null : campus.trim();
    }

    /**
     * @return LOCATION
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location
     */
    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    /**
     * @return TEXTBOOK
     */
    public String getTextbook() {
        return textbook;
    }

    /**
     * @param textbook
     */
    public void setTextbook(String textbook) {
        this.textbook = textbook == null ? null : textbook.trim();
    }

    /**
     * @return CURRENT_STATUS
     */
    public Integer getCurrentStatus() {
        return currentStatus;
    }

    /**
     * @param currentStatus
     */
    public void setCurrentStatus(Integer currentStatus) {
        this.currentStatus = currentStatus;
    }

    /**
     * @return CLASS_CAP
     */
    public Integer getClassCap() {
        return classCap;
    }

    /**
     * @param classCap
     */
    public void setClassCap(Integer classCap) {
        this.classCap = classCap;
    }

    /**
     * @return WAITLIST_CAP
     */
    public Integer getWaitlistCap() {
        return waitlistCap;
    }

    /**
     * @param waitlistCap
     */
    public void setWaitlistCap(Integer waitlistCap) {
        this.waitlistCap = waitlistCap;
    }

    /**
     * @return SUBJECT
     */
    public String getSubject() {
        return subject;
    }

    /**
     * @param subject
     */
    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    /**
     * @return SUBJECT_NUM
     */
    public Integer getSubjectNum() {
        return subjectNum;
    }

    /**
     * @param subjectNum
     */
    public void setSubjectNum(Integer subjectNum) {
        this.subjectNum = subjectNum;
    }

    /**
     * @return SECTION_NUM
     */
    public Integer getSectionNum() {
        return sectionNum;
    }

    /**
     * @param sectionNum
     */
    public void setSectionNum(Integer sectionNum) {
        this.sectionNum = sectionNum;
    }

    /**
     * @return COURSE_NUM
     */
    public Integer getCourseNum() {
        return courseNum;
    }

    /**
     * @param courseNum
     */
    public void setCourseNum(Integer courseNum) {
        this.courseNum = courseNum;
    }

    /**
     * @return TERM
     */
    public Integer getTerm() {
        return term;
    }

    /**
     * @param term
     */
    public void setTerm(Integer term) {
        this.term = term;
    }

    /**
     * @return TITTLE
     */
    public String getTittle() {
        return tittle;
    }

    /**
     * @param tittle
     */
    public void setTittle(String tittle) {
        this.tittle = tittle == null ? null : tittle.trim();
    }

    /**
     * @return CLASS_ATTRIBUTE
     */
    public String getClassAttribute() {
        return classAttribute;
    }

    /**
     * @param classAttribute
     */
    public void setClassAttribute(String classAttribute) {
        this.classAttribute = classAttribute == null ? null : classAttribute.trim();
    }

    /**
     * @return INSTRUCTOR
     */
    public String getInstructor() {
        return instructor;
    }

    /**
     * @param instructor
     */
    public void setInstructor(String instructor) {
        this.instructor = instructor == null ? null : instructor.trim();
    }

    /**
     * @return CAREER
     */
    public String getCareer() {
        return career;
    }

    /**
     * @param career
     */
    public void setCareer(String career) {
        this.career = career == null ? null : career.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sectionId=").append(sectionId);
        sb.append(", seession=").append(seession);
        sb.append(", classNum=").append(classNum);
        sb.append(", unit=").append(unit);
        sb.append(", grading=").append(grading);
        sb.append(", description=").append(description);
        sb.append(", preq=").append(preq);
        sb.append(", requireLec=").append(requireLec);
        sb.append(", requireRec=").append(requireRec);
        sb.append(", reqireLab=").append(reqireLab);
        sb.append(", isRec=").append(isRec);
        sb.append(", meetMon=").append(meetMon);
        sb.append(", meetTue=").append(meetTue);
        sb.append(", meetWed=").append(meetWed);
        sb.append(", meetThu=").append(meetThu);
        sb.append(", meetFri=").append(meetFri);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", startDate=").append(startDate);
        sb.append(", endDate=").append(endDate);
        sb.append(", room=").append(room);
        sb.append(", campus=").append(campus);
        sb.append(", location=").append(location);
        sb.append(", textbook=").append(textbook);
        sb.append(", currentStatus=").append(currentStatus);
        sb.append(", classCap=").append(classCap);
        sb.append(", waitlistCap=").append(waitlistCap);
        sb.append(", subject=").append(subject);
        sb.append(", subjectNum=").append(subjectNum);
        sb.append(", sectionNum=").append(sectionNum);
        sb.append(", courseNum=").append(courseNum);
        sb.append(", term=").append(term);
        sb.append(", tittle=").append(tittle);
        sb.append(", classAttribute=").append(classAttribute);
        sb.append(", instructor=").append(instructor);
        sb.append(", career=").append(career);
        sb.append("]");
        return sb.toString();
    }
}