package com.dummy.app.config;

import com.zaxxer.hikari.HikariDataSource;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import javax.annotation.Resource;
import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:jdbc-dev.properties")
public class DataSourceConfig {

    @Resource
    Environment env;

    @Bean
    public DataSource dataSource() {
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setConnectionTestQuery(env.getProperty("jdbc.testQuery"));
        dataSource.setDriverClassName(env.getProperty("jdbc.driver"));
        dataSource.setJdbcUrl(env.getProperty("jdbc.url"));
        dataSource.setUsername(env.getProperty("jdbc.user"));
        dataSource.setPassword(env.getProperty("jdbc.password"));
        dataSource.setMinimumIdle(Integer.parseInt(getOrDefault(env.getProperty("jdbc.min"), "10")));
        dataSource.setMaximumPoolSize(Integer.parseInt(getOrDefault(env.getProperty("jdbc.max"), "50")));
        return dataSource;
    }

    private String getOrDefault(String property, String defaultValue) {
        String value = env.getProperty(property);
        if(StringUtils.isEmpty(value)) {
            return defaultValue;
        }
        return value;
    }

}
