package com.softserveinc.retail.shopping.dal.mysql;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;


@Configuration
public class MySqlDataSourceBean {
    @Bean(name = "MySqlDataSource")
    public DataSource getDataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/shopping");
        dataSource.setUsername("root");
        dataSource.setPassword("12345678");

        return dataSource;
  }
}
