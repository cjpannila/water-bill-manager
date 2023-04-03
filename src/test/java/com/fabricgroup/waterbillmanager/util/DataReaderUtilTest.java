package com.fabricgroup.waterbillmanager.util;

import model.WaterBill;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataReaderUtilTest {

    @Test
    void allotWaterRooms() {
        WaterBill waterBill = new WaterBill();
        String[] inputs = {"ALLOT_WATER", "2", "3:7"};
        DataReaderUtil.allotWater(waterBill, inputs);
        assertEquals(2, waterBill.getRooms());
    }

    @Test
    void allotWaterRatio1() {
        WaterBill waterBill = new WaterBill();
        String[] inputs = {"ALLOT_WATER", "2", "3:7"};
        DataReaderUtil.allotWater(waterBill, inputs);
        assertEquals(0.3, waterBill.getCorporatePercentage());
    }

    @Test
    void allotWaterRatio2() {
        WaterBill waterBill = new WaterBill();
        String[] inputs = {"ALLOT_WATER", "2", "3:7"};
        DataReaderUtil.allotWater(waterBill, inputs);
        assertEquals(0.7, waterBill.getBorewellPercentage());
    }

    @Test
    void addGuests() {
        WaterBill waterBill = new WaterBill();
        waterBill.setGuests(3);
        String[] inputs = {"ADD_GUESTS", "2"};
        DataReaderUtil.addGuests(waterBill, inputs);
        assertEquals(5, waterBill.getGuests());
    }
}