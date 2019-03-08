package sh.otk.classchecker.section.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import sh.otk.classchecker.section.model.Sections;
import sh.otk.classchecker.section.model.SectionsExample;
@Mapper
@Repository
public interface SectionsMapper extends BaseMapper<Sections> {
    long countByExample(SectionsExample example);

    int deleteByExample(SectionsExample example);

    List<Sections> selectByExample(SectionsExample example);

    int updateByExampleSelective(@Param("record") Sections record, @Param("example") SectionsExample example);

    int updateByExample(@Param("record") Sections record, @Param("example") SectionsExample example);
}