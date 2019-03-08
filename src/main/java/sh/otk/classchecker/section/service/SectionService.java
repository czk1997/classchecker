package sh.otk.classchecker.section.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import sh.otk.classchecker.section.dao.SectionsMapper;
import sh.otk.classchecker.section.model.Sections;

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
}
