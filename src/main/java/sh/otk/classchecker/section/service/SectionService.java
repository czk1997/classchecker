package sh.otk.classchecker.section.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import sh.otk.classchecker.section.dao.SectionsMapper;
import sh.otk.classchecker.section.model.Sections;
import sh.otk.classchecker.section.model.SectionsExample;

import java.util.List;

@Service
@Component
public class SectionService {
    private final SectionsMapper sectionsMapper;

    @Autowired
    public SectionService(SectionsMapper sectionsMapper) {
        this.sectionsMapper = sectionsMapper;
    }

    public void insert(Sections sections){
        sectionsMapper.insert(sections);
    }
    public List<Sections> getByExample(SectionsExample sectionsExample){
        return sectionsMapper.selectByExample(sectionsExample);
    }
    public List<Sections> getSubjectInTerm(String subject, int term){
        SectionsExample sectionsExample= new SectionsExample();
        sectionsExample.createCriteria().andTermEqualTo(term).andSubjectEqualTo(subject);
        return sectionsMapper.selectByExample(sectionsExample);
    }

}
