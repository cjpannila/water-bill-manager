/**
 * Main class of the Water Bill Manager application
 *
 * @author Chinthana Pannila
 * @version 1.0
 * @since 2023-04-03
 */
package com.fabricgroup.waterbillmanager;

import com.fabricgroup.waterbillmanager.controller.InputFileController;
import com.fabricgroup.waterbillmanager.util.Constants;
import model.WaterBill;

public class Main {
    public static void main(String[] args) {
        System.out.println(Constants.APPLICATION_START_MESSAGE);
        if (args.length > 0) {
            for (String arg : args) {
                String inputFilePath = arg;
                System.out.println(Constants.PROCESSING_FILE + inputFilePath);
                InputFileController inputFileController = new InputFileController(inputFilePath);
                WaterBill waterBill = inputFileController.ReadInputFile();
                System.out.println(waterBill.getRooms() + "|" + waterBill.getGuests() + "|"
                + waterBill.getCorporatePercentage() + "|" + waterBill.getBorewellPercentage());
            }
        } else {
            System.out.println(Constants.INPUT_FILEPATH_ARG_NOT_FOUND_MESSAGE);
        }
    }
}