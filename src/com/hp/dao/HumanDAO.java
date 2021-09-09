package com.hp.dao;

import com.hp.util.Human;
import com.hp.util.HumanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HumanDAO {
    long countByExample(HumanExample example);

    int deleteByExample(HumanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Human record);

    int insertSelective(Human record);

    List<Human> selectByExample(HumanExample example);

    Human selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Human record, @Param("example") HumanExample example);

    int updateByExample(@Param("record") Human record, @Param("example") HumanExample example);

    int updateByPrimaryKeySelective(Human record);

    int updateByPrimaryKey(Human record);
}