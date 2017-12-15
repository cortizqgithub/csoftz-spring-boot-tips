package com.csoftz.ceiba.spring.boot.oracle.data.interfaces;

import com.csoftz.ceiba.spring.boot.oracle.entity.MyTableEntity;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 * Extracted from https://dzone.com/articles/calling-stored-procedures-from-spring-data-jpa
 */
public interface MyTableRepository extends CrudRepository<MyTableEntity, Long> {
    @Procedure(name="in_only_test")
    void inOnlyTest(@Param("inParam1") String inParam1);

    @Procedure(name="in_and_out_test")
    String inAndOutTest(@Param("inParam1") String inParam1);
}
