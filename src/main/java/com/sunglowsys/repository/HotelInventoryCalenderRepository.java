package com.sunglowsys.repository;

import com.sunglowsys.domain.HotelInventoryCalender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelInventoryCalenderRepository extends JpaRepository<HotelInventoryCalender,Long> {
}
