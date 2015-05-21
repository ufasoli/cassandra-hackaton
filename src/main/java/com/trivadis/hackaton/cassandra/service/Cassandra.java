package com.trivadis.hackaton.cassandra.service;

import com.datastax.driver.core.querybuilder.QueryBuilder;
import com.datastax.driver.core.querybuilder.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.stereotype.Component;

/**
 * @author ulf
 */
@Component
public class Cassandra {

     @Autowired
     private CassandraOperations cassandraOperations;

    public void doTest() {


        //cassandraOps.insert();

        Select s = QueryBuilder.select().from("person");
        s.where(QueryBuilder.eq("id", "1234567890"));

        cassandraOperations.truncate("person");

    }
}
