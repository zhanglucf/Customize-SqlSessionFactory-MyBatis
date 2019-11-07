package com.zl.mybatis.study;

import com.zl.mybatis.study.entity.Blog;
import com.zl.mybatis.study.mapper.BlogMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;

@RunWith(SpringRunner.class)
@SpringBootTest
class MybatisStudyApplicationTests {

    @Autowired
    private DataSource dataSource;

    @Autowired
    BlogMapper blogMapper;

    @Autowired
    SqlSessionFactory sqlSessionFactory2;



    @Test
    public  void ff() throws IOException {
        System.out.println("     sfsdf f  ");
        String resource = "mybatis/config/mybatis-config2.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        try (SqlSession session = sqlSessionFactory.openSession()) {
            Blog blog = (Blog) session.selectOne("com.zl.mybatis.study.mapper.BlogMapper.selectBlog", 1);
            System.out.println(blog);

        }

        try (SqlSession session = sqlSessionFactory2.openSession()) {
            Blog blog = (Blog) session.selectOne("com.zl.mybatis.study.mapper.BlogMapper.selectBlog", 1);
            System.out.println(blog);

        }
    }

    @Test
    public void f(){
//        TransactionFactory transactionFactory = new JdbcTransactionFactory();
//        Environment environment = new Environment("development", transactionFactory, dataSource);
//        Configuration configuration = new Configuration(environment);
//        configuration.addMapper(BlogMapper.class);
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);

//        try (SqlSession session = sqlSessionFactory.openSession()) {
//            BlogMapper mapper = session.getMapper(BlogMapper.class);
//            Blog blog = mapper.selectBlog(1);
//
//            System.out.println(blog);
//        }
    }
    @Test
    public void f2(){
        System.out.println(blogMapper.selectBlog(1));
    }
}
