package com.csoftz.ceiba.spring.boot.oracle.data.interfaces;

import org.springframework.data.repository.query.Param;

public interface MyTableRepositoryCustom {
    void inOnlyTestCustom(@Param("inParam1") String inParam1);

    String inAndOutTestCustom(@Param("inParam1") String inParam1);
}
