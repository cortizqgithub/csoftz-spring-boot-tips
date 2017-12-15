package com.csoftz.ceiba.spring.boot.oracle.data.interfaces;

import com.csoftz.ceiba.spring.boot.oracle.entity.RegionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRegionRepository extends JpaRepository<RegionEntity, Long> {
}
