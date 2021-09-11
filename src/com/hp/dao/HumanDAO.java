package com.hp.dao;

import com.hp.util.Human;
import com.hp.util.HumanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HumanDAO {
    long countByExample(HumanExample example);

    int deleteByExample(HumanExample example);//按条件删除

    int deleteByPrimaryKey(Integer id);//按主键id删除

    int insert(Human record);//当human对象 所有属性都在可以用

    int insertSelective(Human record);//尽量用它

    List<Human> selectByExample(HumanExample example);//动态查询

    Human selectByPrimaryKey(Integer id);//按主键id查询

    int updateByExampleSelective(@Param("record") Human record, @Param("example") HumanExample example);//动态的批量修改 用它

    int updateByExample(@Param("record") Human record, @Param("example") HumanExample example);//动态的批量修改 不用

    int updateByPrimaryKeySelective(Human record);//按主键id修改一个对象 1条数据

    int updateByPrimaryKey(Human record);//不用
}