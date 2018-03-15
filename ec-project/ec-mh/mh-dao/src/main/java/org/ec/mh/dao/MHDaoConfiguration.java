package org.ec.mh.dao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.flyway.FlywayAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration // 配置注解
@AutoConfigureBefore({FlywayAutoConfiguration.class})
@ImportAutoConfiguration({FlywayAutoConfiguration.class, DataSourceAutoConfiguration.class})
@PropertySource(value = "classpath:mybatis-config.properties")
@MapperScan("org.ec.mh.dao.mapper")
public class MHDaoConfiguration {
}
