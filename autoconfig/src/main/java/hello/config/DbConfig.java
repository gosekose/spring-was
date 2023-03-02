package hello.config;

import com.zaxxer.hikari.HikariDataSource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.JdbcTransactionManager;
import org.springframework.transaction.TransactionManager;

import javax.sql.DataSource;

@Slf4j
@Configuration
public class DbConfig {

    @Bean
    public DataSource dataSource() {
        log.info("dataSourc 빈 등록 ");
        HikariDataSource datasource = new HikariDataSource();
        datasource.setDriverClassName("org.h2.Driver");
        datasource.setJdbcUrl("jdbc:h2:mem:test");
        datasource.setUsername("sa");
        datasource.setPassword("");
        return datasource;
    }

    @Bean
    public TransactionManager transactionManager() {
        log.info("transactionManager 빈 등록 ");
        return new JdbcTransactionManager(dataSource());
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        log.info("jdbcTemplate 빈 등록");
        return new JdbcTemplate(dataSource());
    }


}
