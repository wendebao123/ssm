package com.itheima.test;

import com.itheima.dao.IAccountDao;
import com.itheima.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;


public class TestMyBatis {
    @Test
    public void run1() throws Exception {
        //加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建一个SqlSessionFactory工厂对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //创建SqlSession对象
        SqlSession sqlSession = factory.openSession();
        // 获取代理对象
        IAccountDao accountDao = sqlSession.getMapper(IAccountDao.class);
        //查询所有数据
        List<Account> accounts = accountDao.findAll();
        for (Account account : accounts) {
            System.out.println(account);
        }
        //关闭资源
        sqlSession.close();
        in.close();

    }
    @Test
    public void run2() throws Exception {
        Account account = new Account();
        account.setName("大灰狼");
        account.setMoney(32d);
        //加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建一个SqlSessionFactory工厂对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //创建SqlSession对象
        SqlSession sqlSession = factory.openSession();
        // 获取代理对象
        IAccountDao accountDao = sqlSession.getMapper(IAccountDao.class);
        //执行添加操作
        accountDao.saveAccount(account);
        //提交事务
        sqlSession.commit();
        //关闭资源
        sqlSession.close();
        in.close();

    }
}
