package com.csoftz.ceiba.spring.boot.oracle.data;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.csoftz.ceiba.spring.boot.oracle.data.interfaces.MyTableRepositoryCustom;

@Component
public class MyTableRepositoryCustomImpl implements MyTableRepositoryCustom {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @PersistenceContext
    private EntityManager em;

    @Override
    public void inOnlyTestCustom(String inParam1) {
    log.info("inOnlyTest called with param ["+inParam1+"]");
        this.em.createNativeQuery("BEGIN in_only_test(:inParam1); END;")
                .setParameter("inParam1", inParam1)
                .executeUpdate();
    }

    @Override
    public String inAndOutTestCustom(String inParam1) {
        log.info("inAndOutTest called with param ["+inParam1+"]");
        StoredProcedureQuery spq = this.em.createNamedStoredProcedureQuery("in_and_out_test").setParameter("inParam1", inParam1);
        spq.execute();
        String out = (String) spq.getOutputParameterValue("outParam1");
        log.info("inAndOutTest called with param ["+inParam1+"], and returned output [" + out + "] ");
        return out;

    }
}
