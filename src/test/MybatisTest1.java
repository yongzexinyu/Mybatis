package test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;


import java.io.InputStream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MybatisTest1 {

	 private SqlSession sqlSession;
	    @Before//在@Test之前执行的方法 提取重复的代码
	    public void before()throws  Exception{
	        //加载并读取xml
	        String path="mybatis-config.xml";
	        //import org.apache.ibatis.io.Resources;
	        InputStream is = Resources.getResourceAsStream(path);
	        //sql连接的工厂类
	        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
	        sqlSession = sqlSessionFactory.openSession();
	        System.out.println("sqlSession = " + sqlSession);
	//sqlSession = org.apache.ibatis.session.defaults.DefaultSqlSession@e45f292
	    }
	        @Test
	        public void test01() {
	        	Map map=new HashMap();
	        	map.put("c_id1","01");
	        	map.put("c_id2", "02");
	        List<Map> stus=	sqlSession.selectList("com.hp.dao.StudentDao.select01",map);
	        for(Map stu:stus) {
				System.out.println("stu = " + stu);
	        }
	        sqlSession.close();
}
	@Test
	public void test02() {
		Map map=new HashMap();
		map.put("c_id1","01");
		map.put("c_id2", "02");
		List<Map> stus=	sqlSession.selectList("com.hp.dao.StudentDao.select02",map);
		for(Map stu:stus) {
			System.out.println("stu = " + stu);
		}
		sqlSession.close();
	}
	@Test
	public void test03() {
		Map map=new HashMap();
		map.put("s_score",60);

		List<Map> stus=	sqlSession.selectList("com.hp.dao.StudentDao.select03",map);
		for(Map stu:stus) {
			System.out.println("stu = " + stu);
		}
		sqlSession.close();
	}
	@Test
	public void test04() {
		Map map=new HashMap();
		map.put("s_score",60);

		List<Map> stus=	sqlSession.selectList("com.hp.dao.StudentDao.select04",map);
		for(Map stu:stus) {
			System.out.println("stu = " + stu);
		}
		sqlSession.close();
	}

	@Test
	public void test05() {

		List<Map> stus=	sqlSession.selectList("com.hp.dao.StudentDao.select05");
		for(Map stu:stus) {
			System.out.println("stu = " + stu);
		}
		sqlSession.close();
	}
	@Test
	public void test06() {

		List<Map> stus=	sqlSession.selectList("com.hp.dao.StudentDao.select06","李");
		for(Map stu:stus) {
			System.out.println("stu = " + stu);
		}
		sqlSession.close();
	}

	@Test
	public void test07() {

		List<Map> stus=	sqlSession.selectList("com.hp.dao.StudentDao.select07","张三");
		for(Map stu:stus) {
			System.out.println("stu = " + stu);
		}
		sqlSession.close();
	}
	@Test
	public void test08() {

		List<Map> stus=	sqlSession.selectList("com.hp.dao.StudentDao.select08","张三");
		for(Map stu:stus) {
			System.out.println("stu = " + stu);
		}
		sqlSession.close();
	}

	@Test
	public void test09() {
	Map map=new HashMap();
	map.put("cid1",01);
	map.put("cid2",02);
		List<Map> stus=	sqlSession.selectList("com.hp.dao.StudentDao.select09",map);
		for(Map stu:stus) {
			System.out.println("stu = " + stu);
		}
		sqlSession.close();
	}

	@Test
	public void test10() {
		Map map=new HashMap();
		map.put("cid1",01);
		map.put("cid2",02);
		List<Map> stus=	sqlSession.selectList("com.hp.dao.StudentDao.select10",map);
		for(Map stu:stus) {
			System.out.println("stu = " + stu);
		}
		sqlSession.close();
	}
}
