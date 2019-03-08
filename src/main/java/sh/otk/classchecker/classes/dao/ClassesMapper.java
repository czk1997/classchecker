package sh.otk.classchecker.classes.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import sh.otk.classchecker.classes.model.Classes;
import sh.otk.classchecker.classes.model.ClassesExample;

@Mapper
@Repository
@Component
public interface ClassesMapper extends BaseMapper<Classes> {
    long countByExample(ClassesExample example);

    int deleteByExample(ClassesExample example);

    List<Classes> selectByExample(ClassesExample example);

    int updateByExampleSelective(@Param("record") Classes record, @Param("example") ClassesExample example);

    int updateByExample(@Param("record") Classes record, @Param("example") ClassesExample example);
}