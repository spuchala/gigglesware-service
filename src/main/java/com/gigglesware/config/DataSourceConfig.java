package com.gigglesware.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Configuration
@Component
public class DataSourceConfig {
    /**
     * Bean for dataSource connection.
     */
    @Bean
    public DataSource dataSource() {

        HikariConfig config = new HikariConfig();
        config.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        config.setJdbcUrl("jdbc:sqlserver://localhost;databaseName=GigglesWare;Trusted_Connection=True;MultipleActiveResultSets=true");

        config.setUsername("sa");
        config.setPassword("GigglesWare#123");

        config.setConnectionTimeout(30000);
        config.setIdleTimeout(60000);
        config.setMaxLifetime(1800000);
        config.setMinimumIdle(5);
        config.setMaximumPoolSize(20);
        config.setConnectionTestQuery("select 1");
        return new HikariDataSource(config);
    }
}
