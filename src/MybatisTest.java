import com.hp.dao.PersonDao;
import com.hp.util.*;
import com.hp.util.dto.PersonDTO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;


import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class MybatisTest {
    private  SqlSession sqlSession;
    @Before//在@Test之前执行的方法 提取重复的代码
    public void before()throws  Exception{
        //加载并读取xml
        String path="SqlMapConfig.xml";
        //import org.apache.ibatis.io.Resources;
        InputStream is = Resources.getResourceAsStream(path);
        //sql连接的工厂类
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        sqlSession = sqlSessionFactory.openSession();
        System.out.println("sqlSession = " + sqlSession);
//sqlSession = org.apache.ibatis.session.defaults.DefaultSqlSession@e45f292
    }

    @Test
    public void test01()  {
       // List<Person> persons = sqlSession.selectList("com.hp.dao.PersonDao.selectAll");
        PersonDao mapper = sqlSession.getMapper(PersonDao.class);
        final List<Person> persons = mapper.selectAll();
        for (Person person : persons) {
            System.out.println("person = " + person);
        }
        sqlSession.close();
    }
    @Test
    public  void test02(){
       /* PersonDao mapper = sqlSession.getMapper(PersonDao.class);
        List<Person> people = mapper.selectPersonBySex(2);*/
        List<Person> people = sqlSession.selectList("com.hp.dao.PersonDao.selectPersonBySex",2);
        for (Person person : people) {
            System.out.println("person = " + person);
        }
        sqlSession.close();
    }
    @Test
    public  void test03(){
      long  o = sqlSession.selectOne("com.hp.dao.PersonDao.selectPersonCount");
        System.out.println("o = " + o);
        sqlSession.close();
    }
    @Test
    public  void test04(){
        Person person=new Person();
        person.setScore(100);
        person.setGender(2);
        long o = sqlSession.selectOne("com.hp.dao.PersonDao.selectPersonByParmterCount01",person);
        System.out.println("o = " + o);
        sqlSession.close();
    }
    //map 多表传参
    @Test
    public  void  test05() throws ParseException {
        String date="2020-10-14";
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        Date birthday =simpleDateFormat.parse(date);
        Map map=new HashMap();
        map.put("gender",2);
        map.put("birthday",birthday);//key值一定要和#{gender}值一样
        List<Person> lists = sqlSession.selectList("com.hp.dao.PersonDao.selectPersonByParmterCount02", map);
        for (Person list : lists) {
            System.out.println("list = " + list);
        }
        sqlSession.close();
    }
    //查询最高分数
    @Test
    public  void  test06(){
        List<Person> persons = sqlSession.selectList("com.hp.dao.PersonDao.selectPersonMax");
        for (Person person : persons) {
            System.out.println("person = " + person);
        }
        sqlSession.close();
    }
    //分组查询
    @Test
    public  void test07(){
        List<PersonDTO> objects = sqlSession.selectList("com.hp.dao.PersonDao.selectAvgScore");
        for (PersonDTO object : objects) {
            System.out.println("object = " + object);
        }
        sqlSession.close();
    }
    //分组查询加参数
    @Test
    public  void test08(){
        List<PersonDTO> objects = sqlSession.selectList("com.hp.dao.PersonDao.selectAvgScore1",200);
        for (PersonDTO object : objects) {
            System.out.println("object = " + object);
        }
        sqlSession.close();
    }
    @Test
    public  void test09(){
        List<Map> maps = sqlSession.selectList("com.hp.dao.PersonDao.selectAvgScore2", 200);
        for (Map object : maps) {
            System.out.println("object = " + object);
        }
        sqlSession.close();
    }
    @Test//模糊查询的第一种方式
    public  void test10(){
        Map map=new HashMap();
        map.put("name","孙");
        List<Person> persons = sqlSession.selectList("com.hp.dao.PersonDao.selectPersonByLike", map);
        //There is no getter for property named 'name' in 'class java.lang.String'  $是拼接的没有getter这个概念,#相当于？有getter这个概念
        for (Person person : persons) {
            System.out.println("person = " + person);
        }
        sqlSession.close();
    }

    @Test//模糊查询的第二种方式
    public void test11(){
        List<Person> list = sqlSession.selectList("com.hp.dao.PersonDao.selectPersonByLike2", "孙");
        for (Person person : list) {
            System.out.println("person = " + person);
        }
        sqlSession.close();
    }

    @Test//模糊查询的第三种方式
    public void test12(){
        List<Person> list = sqlSession.selectList("com.hp.dao.PersonDao.selectPersonByLike3", "孙");
        for (Person person : list) {
            System.out.println("person = " + person);
        }
        sqlSession.close();
    }

    //以上就是单表的所有查询    面试题 : $ 和 #


//                  增加

    @Test
    public  void test13(){
        Person person=new Person();
        person.setName("张三");
        person.setGender(2);
        person.setScore(100);
        person.setBirthday(new Date());
        person.setAddress("北京");
        int insert = sqlSession.insert("com.hp.dao.PersonDao.insertPerson", person);
        if(insert==1){
            System.out.println("添加成功 ");
        }
        sqlSession.commit();
        sqlSession.close();
    }
//                 删除
    @Test
    public  void test14(){
        int delete = sqlSession.delete("com.hp.dao.PersonDao.deletePersonById", 15);
        if(delete==1){
            System.out.println("删除成功");
        }
        sqlSession.commit();
        sqlSession.close();
    }

    //动态sql 重点 难点 高薪起点
    //动态sql 其实就是 让 达到1 条 xml 中的语句可以实现 N多种查询
    //那么要实现多种查询 就有硬性的条件 你的参数要多 》》 1.放弃单个属性（int,String) 改为是实体类 2.参数改用map
    //今天所学的 推翻 昨天所学的 那么就需要 总结昨天所学的


    //第一类： 特征 1） 返回值 ---》 正常表的结果集 对应的是 person 实体类
    //                2） 都是 select * from person  开头的
    // 1.1 select * from person
    // 1.2 select * from  person where gender=2

    //第二类:    特征1) 返回值 -----》 一个属 单行单列 非person实体类 是一个数据类型
                    //2.都是 select count(*) from person 开头的
    // 2.1 select count(*） from person
    // 2.2  select count(*） from person where gender=2 and score>100


    //综上所述  以上的sql可以进行动态的 判断 形成一个sql ！！！这就叫做  动态sql
    //动态查询
    @Test
    public  void  test15(){
        Person person=new Person();
        //null就是全查
       // person.setId(14);
        person.setScore(200);
        person.setGender(2);
        List<Person> personList = sqlSession.selectList("com.hp.dao.PersonDao.dontTaiSelect", person);
        for (Person person1 : personList) {
            System.out.println("person1 = " + person1);
        }
    }
    //动态修改  其实就是有选择性修改很多 多个字段 比如 可以修改女孩分数 日期等等
    @Test
    public  void  test16(){
        Person person=new Person();
        person.setId(14);
        person.setAddress("美国");
        person.setBirthday(new Date());
        int update = sqlSession.update("com.hp.dao.PersonDao.dongTaiUpdate", person);
        System.out.println("update = " + update);
        sqlSession.commit();
        sqlSession.close();
    }
    //批量删除
    @Test
    //构造一个ids
    public  void  test17(){
        List<Integer> idList=new ArrayList<>();
        idList.add(1);
        idList.add(2);
        idList.add(3);
        Map map=new HashMap();
        map.put("ids",idList);
        int delete = sqlSession.delete("com.hp.dao.PersonDao.piLiangDel", map);
        System.out.println("delete = " + delete);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public  void test18(){
        HumanExample example=new HumanExample();//创建一个例子类
        HumanExample.Criteria criteria=example.createCriteria();//用例子类实现查询的规则或者标准
       //当example的criteria 不用 赋值的时候 则是 Preparing：select count(*) from human
       //criteria.andGenderEqualTo(2);
       /* criteria.andAddressEqualTo("西京");*/
        //criteria.andAddressLike( "%"+ "西京" +"%");//模糊查询
      /*  criteria.andAddressEqualTo("北京");
        criteria.andScoreEqualTo(200.00);
        example.or(criteria);//条件查询 or*/
        /*example.or().andScoreEqualTo(200.00);
        example.or().andAddressEqualTo("北京");*/
        List<Integer> e=new ArrayList<>();
        e.add(1);
        e.add(2);
        e.add(3);
        criteria.andIdIn(e);

        long o = sqlSession.selectOne("com.hp.dao.HumanDAO.countByExample", example);

        System.out.println("o = " + o);
        sqlSession.close();
    }

    @Test
    public  void test19(){
        HumanExample example=new HumanExample();//创建一个例子类
        HumanExample.Criteria criteria=example.createCriteria();
        criteria.andGenderEqualTo(1);
        criteria.andAddressLike("%"+ "西京" +"%");
        criteria.andScoreLessThan(200.00);


        List<Human> humans = sqlSession.selectList("com.hp.dao.HumanDAO.selectByExample", example);
        for (Human human : humans) {
            System.out.println("human = " + human);
        }
        sqlSession.close();
    }
    @Test
    public  void  test34(){
        HumanExample example=new HumanExample();//创建一个例子类
        HumanExample.Criteria criteria=example.createCriteria();
        criteria.andGenderEqualTo(1);
        List<Human> objects = sqlSession.selectList("com.hp.dao.HumanDAO.selectByExample", example);
        for (Human object : objects) {
            System.out.println("object = " + object);
        }
        sqlSession.close();
    }
    @Test
    public  void  test35(){
        HumanExample example=new HumanExample();//创建一个例子类
        HumanExample.Criteria criteria=example.createCriteria();
        criteria.andIdEqualTo(1);
        List<Human> objects = sqlSession.selectList("com.hp.dao.HumanDAO.selectByExample", example);
        for (Human object : objects) {
            System.out.println("object = " + object);
        }
        sqlSession.close();
    }
    @Test
    public  void  test36(){
        HumanExample example=new HumanExample();//创建一个例子类
        HumanExample.Criteria criteria=example.createCriteria();
        criteria.andScoreLessThan(80.0);
        List<Human> objects = sqlSession.selectList("com.hp.dao.HumanDAO.selectByExample", example);
        for (Human object : objects) {
            System.out.println("object = " + object);
        }
        sqlSession.close();
    }
    @Test
    public  void  test37(){
        HumanExample example=new HumanExample();//创建一个例子类
        HumanExample.Criteria criteria=example.createCriteria();
        criteria.andScoreGreaterThan(80.0);
        criteria.andGenderEqualTo(1);
        List<Human> objects = sqlSession.selectList("com.hp.dao.HumanDAO.selectByExample", example);
        for (Human object : objects) {
            System.out.println("object = " + object);
        }
        sqlSession.close();
    }
    /////////////////////////////
    @Test
    public  void test20(){
        CustomerExample example=new CustomerExample();//创建一个例子类
        CustomerExample.Criteria criteria=example.createCriteria();
        criteria.andSalBetween(5000,7000);
        List<Customer> customer = sqlSession.selectList("com.hp.dao.CustomerDAO.selectByExample1", example);
        for (Customer customer1 : customer) {
            System.out.println("customer1 = " + customer1);
        }
        sqlSession.close();
    }
    @Test
    public  void test21(){
        CustomerExample example=new CustomerExample();//创建一个例子类
        CustomerExample.Criteria criteria=example.createCriteria();
        example.setOrderByClause("sal desc");
        example.setLimit(3);
        List<Customer> objects = sqlSession.selectList("com.hp.dao.CustomerDAO.selectByExample", example);
        for (Customer object : objects) {
            System.out.println("object = " + object);
        }
        sqlSession.close();
    }
    @Test
    public  void test22(){
        CustomerExample example=new CustomerExample();//创建一个例子类
        CustomerExample.Criteria criteria=example.createCriteria();
        criteria.andCnameLike("%"+"明"+"%");
        List<Customer> objects = sqlSession.selectList("com.hp.dao.CustomerDAO.selectByExample", example);
        for (Customer object : objects) {
            System.out.println("object = " + object);
        }
        sqlSession.close();
    }
    @Test
        public  void test23(){
            CustomerExample example=new CustomerExample();//创建一个例子类
        CustomerExample.Criteria criteria=example.createCriteria();
        criteria.andCnameLike("%"+"刚");
        List<Customer> objects = sqlSession.selectList("com.hp.dao.CustomerDAO.selectByExample", example);
        for (Customer object : objects) {
            System.out.println("object = " + object);
        }
        sqlSession.close();
    }
    @Test
    public  void test24(){
        CustomerExample example=new CustomerExample();//创建一个例子类
        CustomerExample.Criteria criteria=example.createCriteria();
        criteria.andCnameEqualTo("赵嘉欣");
        criteria.andSalGreaterThan(5000);
        List<Customer> objects = sqlSession.selectList("com.hp.dao.CustomerDAO.selectByExample", example);
        for (Customer object : objects) {
            System.out.println("object = " + object);
        }
        sqlSession.close();
    }
    @Test
    public  void test25(){
        List<Customer> customers = sqlSession.selectList("com.hp.dao.CustomerDAO.selectZhaoJiaXin", "赵嘉欣");
        for (Customer customer : customers) {
            System.out.println("customer = " + customer);
        }
        sqlSession.close();
    }
    @Test
    public  void test26(){
        List<Map> map = sqlSession.selectList("com.hp.dao.CustomerDAO.selectShuangBiao");
        for (Map map1 : map) {
            System.out.println("map1 = " + map1);
        }
        sqlSession.close();
    }
    @Test
    public void test27(){
        List<Map> maps = sqlSession.selectList("com.hp.dao.CustomerDAO.selectShuangBiao1");
        for (Map map : maps) {
            System.out.println("map = " + map);
        }
        sqlSession.close();
    }
    @Test
    public  void test28(){
        List<Map> map = sqlSession.selectList("com.hp.dao.CustomerDAO.selectCustomer");
        for (Map map1 : map) {
            System.out.println("map1 = " + map1);
        }
        sqlSession.close();
    }
    @Test
    public  void test29(){
        List<Map> map=sqlSession.selectList("com.hp.dao.CustomerDAO.selectCustomerAndEmp");
        for (Map map1 : map) {
            System.out.println("map1 = " + map1);
        }
        sqlSession.close();
    }
    @Test
    public void  test30(){
        List<Map> maps = sqlSession.selectList("com.hp.dao.CustomerDAO.selectCustomerAndEmp1");
        for (Map map : maps) {
            System.out.println("map = " + map);
        }
        sqlSession.close();
    }
    @Test
    public  void  test31(){

        Map map=new HashMap();
        map.put("cname","赵峰刚");
        map.put("tel","18728392567");

        int update = sqlSession.update("com.hp.dao.CustomerDAO.updateByPrimaryKey1", map);

        System.out.println("update = " + update);
        sqlSession.commit();
        sqlSession.close();

    }
    @Test
    public  void  test32(){

        Map map=new HashMap();
        map.put("remarks","金标客户");
        map.put("sal","5000");
        map.put("money","500000");

        int update = sqlSession.update("com.hp.dao.CustomerDAO.updateByPrimaryKey2", map);

        System.out.println("update = " + update);
        sqlSession.commit();
        sqlSession.close();

    }
    @Test
    public  void  test33(){

        Map map=new HashMap();
        map.put("cname","刘国华");

        int update = sqlSession.update("com.hp.dao.CustomerDAO.updateByPrimaryKey3", map);

        System.out.println("update = " + update);
        sqlSession.commit();
        sqlSession.close();

    }
    //工具的增加
    @Test
    public  void  test38(){
        Human human=new Human();
        human.setName("刘晓云");
        human.setAddress("北京");
        human.setGender(2);
        int insert = sqlSession.insert("com.hp.dao.HumanDAO.insertSelective", human);
        System.out.println("insert = " + insert);
        sqlSession.commit();
        sqlSession.close();
    }
    //工具的删除
    @Test
    public void  test39(){
        int delete = sqlSession.delete("com.hp.dao.HumanDAO.deleteByPrimaryKey", 6);
        System.out.println("delete = " + delete);
        sqlSession.commit();
        sqlSession.close();
    }//按主键id删除
    @Test
    public  void test40(){//按条件删除
        HumanExample example=new HumanExample();
        HumanExample.Criteria criteria=example.createCriteria();
        criteria.andScoreLessThan(20.0);
        int delete = sqlSession.delete("com.hp.dao.HumanDAO.deleteByExample", example);
        System.out.println("delete = " + delete);
        sqlSession.commit();
        sqlSession.close();
    }//按条件删除
    @Test
    public  void test41(){
        Human human=new Human();
        human.setId(4);
        human.setName("猪八戒");
        int update = sqlSession.update("com.hp.dao.HumanDAO.updateByPrimaryKeySelective", human);
        System.out.println("update = " + update);
        sqlSession.commit();
        sqlSession.close();
    }//修改一条数据
    @Test
    public  void  test42(){
        //mybatis测试不了
        Human human=new Human();
        human.setScore(100.0);
        HumanExample example=new HumanExample();
        HumanExample.Criteria criteria=example.createCriteria();
        criteria.andScoreGreaterThan(100.0);
    //    sqlSession.update("com.hp.dao.HumanDAO.updateByExampleSelective",human,example);
    }//批量修改
    @Test
    public  void test43(){
        Human o = sqlSession.selectOne("com.hp.dao.HumanDAO.selectByPrimaryKey", 4);
        System.out.println("o = " + o);
        sqlSession.close();
    }//查询一条数据
    @Test
    public  void test44() throws ParseException {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        Date parse = simpleDateFormat.parse("2020-11-04");
        HumanExample example=new HumanExample();
        HumanExample.Criteria criteria=example.createCriteria();
        criteria.andScoreGreaterThan(100.0);
        criteria.andBirthdayGreaterThan(parse);
        List<Human> objects = sqlSession.selectList("com.hp.dao.HumanDAO.selectByExample", example);
        for (Human object : objects) {
            System.out.println("object = " + object);
        }
        sqlSession.close();
    }//动态查询
    @Test
    public void test45(){
        Map ma=new HashMap();
        ma.put("name","孙尚香");
    List<Person> objects = sqlSession.selectList("com.hp.dao.PersonDao.selectOrdersByPersonId", ma);
    for (Person object : objects) {
        System.out.println("object = " + object);
    }
    sqlSession.close();
}//mybatis一对多
    @Test
    public  void test46(){
        Map map=new HashMap();
        map.put("c_id",1);
        List<City> cities = sqlSession.selectList("com.hp.dao.CityDAO.selectCityAndArea", map);
        for (City city : cities) {
            System.out.println("city = " + city);
        }
        sqlSession.close();
    }
}
