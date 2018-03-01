package com.csoftz.poc.jpa.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "family")
@Data
public class FamilyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "family_seq")
    @SequenceGenerator(name = "family_seq", sequenceName = "family_sequence", allocationSize = 1)
    private Long id;
    private String description;

    @OneToMany(mappedBy = "familyEntity")
    private final List<PersonEntity> members = new ArrayList<PersonEntity>();
}
