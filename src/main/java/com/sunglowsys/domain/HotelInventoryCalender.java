package com.sunglowsys.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "hotel_inventory_calender_1")
public class HotelInventoryCalender {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer availble;
    private Integer sold;
    private Integer block;
    private Integer hotel_id;
    private Integer room_type_id;

    public HotelInventoryCalender () {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAvailble() {
        return availble;
    }

    public void setAvailble(Integer availble) {
        this.availble = availble;
    }

    public Integer getSold() {
        return sold;
    }

    public void setSold(Integer sold) {
        this.sold = sold;
    }

    public Integer getBlock() {
        return block;
    }

    public void setBlock(Integer block) {
        this.block = block;
    }

    public Integer getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(Integer hotel_id) {
        this.hotel_id = hotel_id;
    }

    public Integer getRoom_type_id() {
        return room_type_id;
    }

    public void setRoom_type_id(Integer room_type_id) {
        this.room_type_id = room_type_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HotelInventoryCalender that = (HotelInventoryCalender) o;
        return Objects.equals(id, that.id) && Objects.equals(availble, that.availble) && Objects.equals(sold, that.sold) && Objects.equals(block, that.block) && Objects.equals(hotel_id, that.hotel_id) && Objects.equals(room_type_id, that.room_type_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, availble, sold, block, hotel_id, room_type_id);
    }

    @Override
    public String toString() {
        return "HotelInventoryCalender{" +
                "id=" + id +
                ", availble=" + availble +
                ", sold=" + sold +
                ", block=" + block +
                ", hotel_id=" + hotel_id +
                ", room_type_id=" + room_type_id +
                '}';
    }

    public HotelInventoryCalender(Integer availble, Integer sold, Integer block, Integer hotel_id, Integer room_type_id) {
        this.availble = availble;
        this.sold = sold;
        this.block = block;
        this.hotel_id = hotel_id;
        this.room_type_id = room_type_id;





    }
}
