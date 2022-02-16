package com.sunglowsys.service;

import com.sunglowsys.domain.HotelInventoryCalender;

import java.util.List;

public interface HotelInventoryCalenderService {
    HotelInventoryCalender save(HotelInventoryCalender hotelInventoryCalender);

    HotelInventoryCalender update(HotelInventoryCalender hotelInventoryCalender,Long id);

    List<HotelInventoryCalender> findAll();

    HotelInventoryCalender findById(Long id);

    void delete(Long id);
}
