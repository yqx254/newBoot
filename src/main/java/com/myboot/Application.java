package com.myboot;

import com.myboot.controller.IndexController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;


/**
 * @author fstar
 */
@SpringBootApplication
public class Application implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(Application.class);

    @Autowired
    private DataSource dataSource;

    public static void main(String [] args){
        SpringApplication.run(IndexController.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        try(Connection conn = dataSource.getConnection()){
            logger.info("Connection get:!");
        } catch (SQLException e){
            throw  new RuntimeException(e);
        }
    }
}
