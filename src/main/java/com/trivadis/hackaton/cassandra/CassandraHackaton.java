package com.trivadis.hackaton.cassandra;

import com.trivadis.hackaton.cassandra.service.Cassandra;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author ulf
 */
@EnableAutoConfiguration
@ComponentScan(basePackages = { "com.trivadis"})
public class CassandraHackaton {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(CassandraHackaton.class, args);

        Cassandra cassandra = context.getBean("cassandra", Cassandra.class);
        cassandra.doTest();


    }
}
