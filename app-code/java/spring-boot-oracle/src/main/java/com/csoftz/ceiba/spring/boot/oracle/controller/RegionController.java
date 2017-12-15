package com.csoftz.ceiba.spring.boot.oracle.controller;

import com.csoftz.ceiba.spring.boot.oracle.data.interfaces.IRegionRepository;
import com.csoftz.ceiba.spring.boot.oracle.entity.RegionEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * When using ORACLE to map a Timestamp for LocalDateTime, read the following documentation.
 * https://community.oracle.com/blogs/montanajava/2014/06/16/using-java-8-datetime-classes-jpa
 * https://dzone.com/articles/dealing-with-javas-localdatetime-in-jpa
 */
@RestController
@RequestMapping("/r/oracle")
public class RegionController {
    private final Logger log = LoggerFactory.getLogger(this.getClass());
    private final IRegionRepository regionRepository;
    public RegionController(final IRegionRepository regionRepository) {
        this.regionRepository = regionRepository;
    }

    @GetMapping("/save")
    public RegionEntity save() {
        RegionEntity r = new RegionEntity();
        r.setRegionName("ASIA");
        r.setUser("CORTIZQ");
        r.setCreationDate(LocalDateTime.now());
        r.setUpdateDate(LocalDateTime.now());
        r.setMyDate(new Date());
        r.setMyLocalDate(LocalDate.now());

        this.regionRepository.save(r);
        return r;
    }

    @GetMapping("/update/{id}")
    public RegionEntity upate(@PathVariable Long id) {
        RegionEntity r = this.regionRepository.findOne(id);
        if (r == null) {
            return new RegionEntity();
        }
        else {
            //log.info(LocalDate.now().);
            log.info(r.toString());
            r.setRegionName(r.getRegionName() + " WHH");
            r.setUpdateDate(LocalDateTime.now());
            r.setUser("UPDUSR");
            this.regionRepository.save(r);

        }
        return r;
    }
}
