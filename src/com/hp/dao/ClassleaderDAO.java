package com.hp.dao;

import com.hp.util.Classleader;
import com.hp.util.ClassleaderExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ClassleaderDAO {
    long countByExample(ClassleaderExample example);

    int deleteByExample(ClassleaderExample example);

    int deleteByPrimaryKey(Integer bid);

    int insert(Classleader record);

    int insertSelective(Classleader record);

    List<Classleader> selectByExample(ClassleaderExample example);

    Classleader selectByPrimaryKey(Integer bid);

    int updateByExampleSelective(@Param("record") Classleader record, @Param("example") ClassleaderExample example);

    int updateByExample(@Param("record") Classleader record, @Param("example") ClassleaderExample example);

    int updateByPrimaryKeySelective(Classleader record);

    int updateByPrimaryKey(Classleader record);

    List<Map>  selectAllByStudent(String bname);
}