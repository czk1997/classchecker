package sh.otk.classchecker.classes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import sh.otk.classchecker.classes.dao.ClassesMapper;
import sh.otk.classchecker.classes.model.Classes;
import sh.otk.classchecker.classes.model.ClassesExample;

import java.util.ArrayList;
import java.util.List;

@Service

public class ClassesService {
    private final ClassesMapper classesMapper;

    @Autowired
    public ClassesService(ClassesMapper classesMapper) {
        this.classesMapper = classesMapper;
    }

    public void insert(Classes classes) {
        classesMapper.insert(classes);
    }
    public List<Classes> selectbyExample(ClassesExample classesExample){
        return classesMapper.selectByExample(classesExample);
    }
}
