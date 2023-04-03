/**
 * Class DataReaderUtil
 * util class for reading data from the input lines
 *
 * @author Chinthana Pannila
 * @version 1.0
 * @since 2023-04-03
 */
package com.fabricgroup.waterbillmanager.util;

import model.WaterBill;

public class DataReaderUtil {
    /**
     * allotWater
     * ALLOT_WATER 2 3:7
     * @param waterBill
     * @param inputs
     * @return
     */
    public static WaterBill allotWater(WaterBill waterBill, String[] inputs) {
        int rooms = DataTypeConverter.parseIntWithDefault(inputs[1], 0);
        if (rooms == 2 || rooms == 3) {
            waterBill.setRooms(rooms);
        }
        String[] ratioArr = inputs[2].split(Constants.RATIO_SEPARATOR);
        int corporationRatioVal = DataTypeConverter.parseIntWithDefault(ratioArr[0], 0);
        int borewellRatioVal = DataTypeConverter.parseIntWithDefault(ratioArr[1], 0);
        double corporatePercentage = ((double)corporationRatioVal / (corporationRatioVal + borewellRatioVal));
        double borewellPercentage = ((double)borewellRatioVal / (corporationRatioVal + borewellRatioVal));
        waterBill.setCorporatePercentage(corporatePercentage);
        waterBill.setBorewellPercentage(borewellPercentage);
        return waterBill;
    }

    /**
     * Add guests
     * ADD_GUESTS 4
     * @param waterBill
     * @param inputs
     * @return
     */
    public static WaterBill addGuests(WaterBill waterBill, String[] inputs) {
        int guests = DataTypeConverter.parseIntWithDefault(inputs[1], 0);
        waterBill.setGuests(waterBill.getGuests() + guests);
        return waterBill;
    }
}
