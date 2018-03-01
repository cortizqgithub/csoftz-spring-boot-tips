package com.csoftz.poc.jpa.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "person")
@Data
public class PersonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "person_seq")
    @SequenceGenerator(name = "person_seq", sequenceName = "person_sequence", allocationSize = 1)
    private Long id;
    private String firstName;
    private String lastName;

    @ManyToOne
    private FamilyEntity familyEntity;

    @Transient
    private String nonsenseField = "";

    @OneToMany
    private List<JobEntity> jobList = new ArrayList<JobEntity>();
}
