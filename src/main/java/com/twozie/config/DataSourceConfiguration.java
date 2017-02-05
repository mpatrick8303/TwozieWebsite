package com.twozie.config;

import javax.sql.DataSource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;


@Configuration
public class DataSourceConfiguration 
{
    static final String DATABASE_URL = "jdbc:mysql://localhost/twozie?" + "user=root&password=patrick8303&" + "useServerPrepStmts=true";
    static final Logger LOGGER = LogManager.getLogger(DataSourceConfiguration.class);
    @Bean
    public DataSource datasource()
    {
        LOGGER.debug("YEAH ANnotation based processing is working");
        MysqlDataSource mysqlds = new MysqlDataSource();
        mysqlds.setURL(DATABASE_URL);
        return mysqlds;
    }


}