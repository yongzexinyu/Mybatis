package com.hp.dao;

import com.hp.util.Customer;
import com.hp.util.CustomerExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface CustomerDAO {
    long countByExample(CustomerExample example);

    int deleteByExample(CustomerExample example);

    int deleteByPrimaryKey(Integer cno);

    int insert(Customer record);

    int insertSelective(Customer record);

    List<Customer>  selectByExample1(CustomerExample example);
    List<Customer> selectByExample(CustomerExample example);
    List<Customer> selectZhaoJiaXin(String  cname);
    List<Map> selectShuangBiao();
    List<Map> selectShuangBiao1();
    List<Map> selectCustomer();

    Customer selectByPrimaryKey(Integer cno);

    int updateByExampleSelective(@Param("record") Customer record, @Param("example") CustomerExample example);

    int updateByExample(@Param("record") Customer record, @Param("example") CustomerExample example);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
}