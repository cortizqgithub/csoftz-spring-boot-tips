package com.csoftz.ceiba.spring.boot.oracle.entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "region")
public class RegionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "region_seq")
    @SequenceGenerator(name = "region_seq", sequenceName = "region_sequence", allocationSize = 1)
    private Long id;
    private String regionName;

    @Column
    @CreatedDate
    private LocalDateTime creationDate;

    @Column
    @LastModifiedDate
    private LocalDateTime updateDate;

    @Column(name = "usr")
    private String user;

    private Date myDate;

    public LocalDate getMyLocalDate() {
        return myLocalDate;
    }

    public void setMyLocalDate(LocalDate myLocalDate) {
        this.myLocalDate = myLocalDate;
    }

    private LocalDate myLocalDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Date getMyDate() {
        return myDate;
    }

    public void setMyDate(Date myDate) {
        this.myDate = myDate;
    }

    @Override
    public String toString() {
        return "RegionEntity{" +
                "id=" + id +
                ", regionName='" + regionName + '\'' +
                ", creationDate=" + creationDate +
                ", updateDate=" + updateDate +
                ", user='" + user + '\'' +
                '}';
    }
}
