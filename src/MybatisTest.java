import com.hp.dao.PersonDao;
import com.hp.util.Person;
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
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


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

}
