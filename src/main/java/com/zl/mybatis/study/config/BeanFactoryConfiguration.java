package com.zl.mybatis.study.config;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.io.InputStream;

@Configuration
public class BeanFactoryConfiguration {
//    @Value("${spring.datasource.url}")
//    private String url;
//
//    @Value("${spring.datasource.username}")
//    private String username;
//
//    @Value("${spring.datasource.password}")
//    private String password;
//
//    @Value("${spring.datasource.driver-class-name}")
//    private String driverClassName;
//
//    @Value("${spring.druid.initialSize}")
//    private int initialSize;
//
//    @Value("${spring.druid.minIdle}")
//    private int minIdle;
//
//    @Value("${spring.druid.maxActive}")
//    private int maxActive;
//
//    @Value("${spring.druid.maxWait}")
//    private int maxWait;
//
//    @Value("${spring.druid.timeBetweenEvictionRunsMillis}")
//    private int timeBetweenEvictionRunsMillis;
//
//    @Value("${spring.druid.minEvictableIdleTimeMillis}")
//    private int minEvictableIdleTimeMillis;
//
//    @Value("${spring.druid.validationQuery}")
//    private String validationQuery;
//
//    @Value("${spring.druid.testWhileIdle}")
//    private boolean testWhileIdle;
//
//    @Value("${spring.druid.testOnBorrow}")
//    private boolean testOnBorrow;
//
//    @Value("${spring.druid.testOnReturn}")
//    private boolean testOnReturn;
//
//    @Value("${spring.druid.poolPreparedStatements}")
//    private boolean poolPreparedStatements;
//
//    @Value("${spring.druid.maxPoolPreparedStatementPerConnectionSize}")
//    private int maxPoolPreparedStatementPerConnectionSize;
//
//    @Value("${spring.druid.filters}")
//    private String filters;
//
//    @Value("{spring.druid.connectionProperties}")
//    private String connectionProperties;
//
//    @Primary
//    @Bean
//    public DataSource getDataSource(){
//        DruidDataSource datasource = new DruidDataSource();
//
//        datasource.setUrl(url);
//        datasource.setUsername(username);
//        //这里可以做加密处理
//        datasource.setPassword(password);
//        datasource.setDriverClassName(driverClassName);
//
//        //configuration
//        datasource.setInitialSize(initialSize);
//        datasource.setMinIdle(minIdle);
//        datasource.setMaxActive(maxActive);
//        datasource.setMaxWait(maxWait);
//        datasource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
//        datasource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
//        datasource.setValidationQuery(validationQuery);
//        datasource.setTestWhileIdle(testWhileIdle);
//        datasource.setTestOnBorrow(testOnBorrow);
//        datasource.setTestOnReturn(testOnReturn);
//        datasource.setPoolPreparedStatements(poolPreparedStatements);
//        datasource.setMaxPoolPreparedStatementPerConnectionSize(maxPoolPreparedStatementPerConnectionSize);
//        try {
//            datasource.setFilters(filters);
//        } catch (SQLException e) {
//
//        }
//        datasource.setConnectionProperties(connectionProperties);
//
//        return datasource;
//    }
//
////    public SqlSessionFactory getSSF(){
////        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
////        configuration.set
////        SqlSessionFactory sqlSessionFactory = new DefaultSqlSessionFactory();
////
////        return null;
////    }

    @Bean
    public SqlSessionFactory getSqlSessionFactory() throws IOException {
        String resource = "mybatis/config/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        return new SqlSessionFactoryBuilder().build(inputStream);
    }
}
