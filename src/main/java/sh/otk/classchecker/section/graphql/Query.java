package sh.otk.classchecker.section.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sh.otk.classchecker.section.model.Sections;
import sh.otk.classchecker.section.service.SectionService;

import java.util.List;

@Component
public class Query implements GraphQLQueryResolver {
    @Autowired
    private SectionService sectionService;

    public List<Sections> getSubjectInTerm(String subject, int term) {
        return sectionService.getSubjectInTerm(subject, term);
    }
}
