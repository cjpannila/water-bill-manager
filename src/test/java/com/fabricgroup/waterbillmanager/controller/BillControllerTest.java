package com.fabricgroup.waterbillmanager.controller;

import model.WaterBill;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BillControllerTest {

    @Test
    void calculateTotalUsage() {
        WaterBill waterBill = new WaterBill();
        waterBill.setRooms(2);
        waterBill.setCorporatePercentage(0.3);
        waterBill.setBorewellPercentage(0.7);
        waterBill.setGuests(5);
        BillController billController = new BillController(waterBill);
        waterBill = billController.calculateTotalUsageAndCost();
        assertEquals(2400, waterBill.getTotalWaterLiters());
    }

    @Test
    void calculateTotalCost() {
        WaterBill waterBill = new WaterBill();
        waterBill.setRooms(2);
        waterBill.setCorporatePercentage(0.3);
        waterBill.setBorewellPercentage(0.7);
        waterBill.setGuests(5);
        BillController billController = new BillController(waterBill);
        waterBill = billController.calculateTotalUsageAndCost();
        assertEquals(5215, waterBill.getTotalCost());
    }

    @Test
    void printTotalUsageAndCost() {
        WaterBill waterBill = new WaterBill();
        BillController billController = new BillController(waterBill);
        billController.printTotalUsageAndCost();
        assertTrue(true);
    }
}