package sh.otk.classchecker;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

public class ClasscheckerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClasscheckerApplication.class, args);

    }

}
