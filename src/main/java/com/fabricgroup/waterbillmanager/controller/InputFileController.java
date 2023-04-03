/**
 * Class InputFileController
 * for read input file and populate water bill object
 *
 * @author Chinthana Pannila
 * @version 1.0
 * @since 2023-03-16
 */
package com.fabricgroup.waterbillmanager.controller;

import com.fabricgroup.waterbillmanager.util.Constants;
import com.fabricgroup.waterbillmanager.util.DataReaderUtil;
import model.WaterBill;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class InputFileController {
    private String filePath;
    public InputFileController(String filePath) {
        this.filePath = filePath;
    }

    public WaterBill ReadInputFile() {
        String row = "";
        WaterBill waterBill = new WaterBill();
        try
        {
            BufferedReader br = new BufferedReader(new FileReader(this.filePath));
            while ((row = br.readLine()) != null)
            {
                boolean exitLoop = false;
                String[] inputStringArr = row.split(Constants.COLUMN_SEPARATOR);
                if (inputStringArr.length > 0) {
                    String inputCommand = inputStringArr[0].trim();
                    switch (inputCommand) {
                        case Constants.ALLOT_WATER:
                            waterBill = DataReaderUtil.allotWater(waterBill, inputStringArr);
                            break;
                        case Constants.ADD_GUESTS:
                            waterBill = DataReaderUtil.addGuests(waterBill, inputStringArr);
                            break;
                        case Constants.BILL:
                            exitLoop = true;
                            break;
                        default:
                            System.out.println(Constants.INCORRECT_INPUT_COMMAND);
                    }
                }
                if (exitLoop) {
                    break;
                }
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println(Constants.FILE_NOT_FOUND);
        }
        catch (IOException e)
        {
            System.out.println(Constants.ERROR_WHILE_PROCESSING_FILE);
        }
        return waterBill;
    }
}
