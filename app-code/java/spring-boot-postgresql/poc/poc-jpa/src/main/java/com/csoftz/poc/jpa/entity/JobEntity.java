package com.csoftz.poc.jpa.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "job")
@Data
public class JobEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "job_seq")
    @SequenceGenerator(name = "job_seq", sequenceName = "job_sequence", allocationSize = 1)
    private Long id;
    private double salery;
    private String jobDescr;
}
