package com.hp.dao;

import com.hp.util.City;
import com.hp.util.CityExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface CityDAO {
    long countByExample(CityExample example);

    int deleteByExample(CityExample example);

    int deleteByPrimaryKey(Integer cId);

    int insert(City record);

    int insertSelective(City record);

    List<City> selectByExample(CityExample example);

    City selectByPrimaryKey(Integer cId);

    int updateByExampleSelective(@Param("record") City record, @Param("example") CityExample example);

    int updateByExample(@Param("record") City record, @Param("example") CityExample example);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);

    List<Map> selectCityAndArea(Map map);
}