package com.hp.dao;

import com.hp.util.School;
import com.hp.util.SchoolExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface SchoolDAO {
    long countByExample(SchoolExample example);

    int deleteByExample(SchoolExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(School record);

    int insertSelective(School record);

    List<School> selectByExample(SchoolExample example);

    School selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") School record, @Param("example") SchoolExample example);

    int updateByExample(@Param("record") School record, @Param("example") SchoolExample example);

    int updateByPrimaryKeySelective(School record);

    int updateByPrimaryKey(School record);

    List<School> selectAllBySchool(Integer sid);//1对多对多
    List<Map> selectAllByParam(Map map);//N表联查查询多条数据
}