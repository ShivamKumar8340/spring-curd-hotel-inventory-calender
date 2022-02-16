package com.sunglowsys.service;

import com.sunglowsys.domain.HotelInventoryCalender;
import com.sunglowsys.repository.HotelInventoryCalenderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelInventoryCalenderServiceImpl implements HotelInventoryCalenderService{
    @Autowired
    private HotelInventoryCalenderRepository hotelInventoryCalenderRepository;

    @Override
    public HotelInventoryCalender save(HotelInventoryCalender hotelInventoryCalender) {
        return hotelInventoryCalenderRepository.save(hotelInventoryCalender);
    }

    @Override
    public HotelInventoryCalender update(HotelInventoryCalender hotelInventoryCalender, Long id) {
        HotelInventoryCalender hotelInventoryCalender1=hotelInventoryCalenderRepository.getById(id);
        hotelInventoryCalender1.setAvailble(hotelInventoryCalender.getAvailble());
        return hotelInventoryCalender1;
    }

    @Override
    public List<HotelInventoryCalender> findAll() {
        return hotelInventoryCalenderRepository.findAll();
    }

    @Override
    public HotelInventoryCalender findById(Long id) {
        Optional <HotelInventoryCalender> optional=hotelInventoryCalenderRepository.findById(id);
        HotelInventoryCalender  hotelInventoryCalender=null;
        if (optional.isPresent()) {
            hotelInventoryCalender=optional.get();
        }
        else {
            throw new RuntimeException("record not found for idNo:"+id);
        }
        return hotelInventoryCalender;
    }

    @Override
    public void delete(Long id) {
        hotelInventoryCalenderRepository.deleteById(id);
    }
}
