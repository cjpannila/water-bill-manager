/**
 * Bill controller class to calculate usage and cost
 *
 * @author Chinthana Pannila
 * @version 1.0
 * @since 2023-04-03
 */
package com.fabricgroup.waterbillmanager.controller;

import com.fabricgroup.waterbillmanager.util.Constants;
import model.WaterBill;

public class BillController {
    private WaterBill waterBill;

    public BillController(WaterBill waterBill) {
        this.waterBill = waterBill;
    }

    /**
     * Method to calculate total usage and cost
     * @return WaterBill
     */
    public WaterBill calculateTotalUsageAndCost() {
        int peoplePerm = 0;
        if (waterBill.getRooms() == 2) {
            peoplePerm = Constants.PEOPLE_IN_TWO_BR;
        } else if (waterBill.getRooms() == 3) {
            peoplePerm = Constants.PEOPLE_IN_THREE_BR;
        }
        int usageFixed = peoplePerm * Constants.LITERS_PER_PERSON_PER_DAY * Constants.DAYS_PER_MONTH;
        double corporationCost = usageFixed * waterBill.getCorporatePercentage() * Constants.CORPORATION_RATE;
        double borewellCost = usageFixed * waterBill.getBorewellPercentage() * Constants.BOREWELL_RATE;

        int usageGuests = waterBill.getGuests() * Constants.LITERS_PER_PERSON_PER_DAY * Constants.DAYS_PER_MONTH;
        double tankerWaterCost = calculateTankerWaterCost(usageGuests);

        int totalUsage = usageFixed + usageGuests;
        waterBill.setTotalWaterLiters(totalUsage);
        double totalCost = corporationCost + borewellCost + tankerWaterCost;
        int totalCostIntVal = (int) Math.round(totalCost);
        waterBill.setTotalCost(totalCostIntVal);
        return waterBill;
    }

    /**
     * calculate tanker water costs for guest usage
     * @param usageGuests
     * @return
     */
    private double calculateTankerWaterCost(int usageGuests) {
        double tankerWaterCost = 0.0;
        if (usageGuests <= 500) {
            tankerWaterCost = usageGuests * Constants.TANKER_RATE_500;
        } else {
            tankerWaterCost = 500 * Constants.TANKER_RATE_500;
            if (usageGuests <= 1500) {
                tankerWaterCost += (usageGuests - 500) * Constants.TANKER_RATE_500_1500;
            } else {
                tankerWaterCost += (1500 - 500) * Constants.TANKER_RATE_500_1500;
                if (usageGuests <= 3000) {
                    tankerWaterCost += (usageGuests - 1500) * Constants.TANKER_RATE_1500_3000;
                } else {
                    tankerWaterCost += (3000 - 1500) * Constants.TANKER_RATE_1500_3000;
                    tankerWaterCost += (usageGuests - 3000) * Constants.TANKER_RATE_3000_PLUS;
                }
            }
        }
        return tankerWaterCost;
    }

    /**
     * Method to print total usage and cost
     */
    public void printTotalUsageAndCost() {
        System.out.println(waterBill.getTotalWaterLiters() + " " + waterBill.getTotalCost());
    }
}
