package com.hp.dao;

import com.hp.util.Person;
import com.hp.util.dto.PersonDTO;

import java.util.List;
import java.util.Map;

public interface PersonDao {
    //全查
    List<Person>  selectAll();
    //单查
    List<Person> selectPersonBySex(int sex);
    //总条数
    long selectPersonCount();
   // 总条数+多个参数 2个参数都是person类中的属性 那么可以直接把person作为参数
    long  selectPersonByParmterCount01();
    //查性别和生日  当查询的sql语句不确定是唯一的一条的时候，一定要用list
    //当多表联查的时候 请求的参数一定要是map或自己写的实体类
    List<Person>  selectPersonByParmterCount02(Map map);
//查询最高分数的人
   /* Person selectPersonMax(int score);
    int selectMaxScore();*/
   List<Person>  selectPersonMax();

 List< PersonDTO> selectAvgScore();

 List<PersonDTO> selectAvgScore1(int score);

 List<Map> selectAvgScore2(int score);

 List<Person> selectPersonByLike(String name);

 List<Person> selectPersonByLike2(String name);

 List<Person> selectPersonByLike3(String name);

 //***********************************************
int insertPerson(Person person);
//.................................................
//删除的方法
    int deletePersonById(Integer id);
//dao层接口中 只有基础类型 ing String 不好的 不方便执行动态sql 对以后扩展不便
    //以后自己写代码 参数一定是 一个实体类 或者map 或者DTO
//动态sql
    List<Person> dontTaiSelect(Person person);//动态sql 如果参数不是 实体类 不是集合 是个空参数 没有任何意义
    //长成  返回值是 List<实体类> 参数也是同样的实体类 那么这是一个 典型的 动态 sql 语句
//动态的修改
    int dongTaiUpdate(Person person);
    //批量删除
    void piLiangDel(Map map);
}
