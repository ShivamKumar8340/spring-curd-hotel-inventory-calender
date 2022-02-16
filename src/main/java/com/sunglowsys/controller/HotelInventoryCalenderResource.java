package com.sunglowsys.controller;

import com.sunglowsys.domain.HotelInventoryCalender;
import com.sunglowsys.service.HotelInventoryCalenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HotelInventoryCalenderResource {

    @Autowired
    private HotelInventoryCalenderService hotelInventoryCalenderService;

    @PostMapping("/hotelInventoryCalenders")
    public HotelInventoryCalender create(@RequestBody HotelInventoryCalender hotelInventoryCalender){
        return hotelInventoryCalenderService.save(hotelInventoryCalender);
    }

    @PutMapping("/hotelInventoryCalenders/{id}")
    public HotelInventoryCalender update(@RequestBody HotelInventoryCalender hotelInventoryCalender, @PathVariable("id") Long id){
        return hotelInventoryCalenderService.update(hotelInventoryCalender,id);
    }

    @GetMapping("/hotelInventoryCalenders")
    public List<HotelInventoryCalender> getAll() {
        List<HotelInventoryCalender> hotelInventoryCalenders=hotelInventoryCalenderService.findAll();
        return hotelInventoryCalenders;
    }

    @GetMapping("/hotelInventoryCalenders/{id}")
    public HotelInventoryCalender getById(@PathVariable("id") Long id) {
        return hotelInventoryCalenderService.findById(id);
    }

    @DeleteMapping("hotelInventoryCalenders/{id}")
    public void delete(@PathVariable("id") Long id){
        hotelInventoryCalenderService.delete(id);
    }

}
