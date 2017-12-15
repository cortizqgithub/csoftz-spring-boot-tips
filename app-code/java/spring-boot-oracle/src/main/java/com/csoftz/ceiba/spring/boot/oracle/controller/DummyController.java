package com.csoftz.ceiba.spring.boot.oracle.controller;

import com.csoftz.ceiba.spring.boot.oracle.data.interfaces.MyTableRepository;
import com.csoftz.ceiba.spring.boot.oracle.data.interfaces.MyTableRepositoryCustom;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/r/oracle/procedure")
public class DummyController {
    private final Logger log = LoggerFactory.getLogger(this.getClass());
    private final MyTableRepository myTableRepository;
    private final MyTableRepositoryCustom myTableRepositoryCustom;

    public DummyController(MyTableRepository myTableRepository, MyTableRepositoryCustom myTableRepositoryCustom) {
        this.myTableRepository = myTableRepository;
        this.myTableRepositoryCustom = myTableRepositoryCustom;
    }

    @GetMapping("/inonlytest/{inParam}")
    public String callInOnlyTestSP(@PathVariable String inParam) {
        this.myTableRepository.inOnlyTest(inParam);
        log.info("IN ONLY EXEC");
        return  "IN ONLY EXC";
    }

    @GetMapping("/inandouttest/{inParam}")
    public String callInAndOutTestSP(@PathVariable String inParam) {
        String outParam = this.myTableRepository.inAndOutTest(inParam);
        log.info(outParam);
        return outParam;

    }

    @GetMapping("/inandouttest/{inParam}/custom")
    public String callInAndOutTestCustomSP(@PathVariable String inParam) {
        String outParam = this.myTableRepositoryCustom.inAndOutTestCustom(inParam);
        log.info(outParam);
        return outParam;

    }

}
