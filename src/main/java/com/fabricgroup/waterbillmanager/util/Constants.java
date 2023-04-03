/**
 * Class Constants - class for constants
 *
 * @author Chinthana Pannila
 * @version 1.0
 * @since 2023-04-03
 */
package com.fabricgroup.waterbillmanager.util;

public class Constants {
    public final static String COLUMN_SEPARATOR = " ";
    public final static String RATIO_SEPARATOR = ":";
    public final static String APPLICATION_START_MESSAGE = "### Water Bill manager application starting ###";
    public final static String APPLICATION_END_MESSAGE = "### Water Bill manager application ending ###";
    public final static String INPUT_FILEPATH_ARG_NOT_FOUND_MESSAGE = "Input file path argument not found";
    public final static String PROCESSING_FILE = "Processing file:";
    public final static String FILE_NOT_FOUND = "File not found in given path";
    public final static String ERROR_WHILE_PROCESSING_FILE = "Error while processing file";
    public final static String INCORRECT_INPUT_COMMAND = "Incorrect input command";
    public final static String ALLOT_WATER = "ALLOT_WATER";
    public final static String ADD_GUESTS = "ADD_GUESTS";
    public final static String BILL = "BILL";
    public final static int PEOPLE_IN_TWO_BR = 3;
    public final static int PEOPLE_IN_THREE_BR = 5;
    public final static int LITERS_PER_PERSON_PER_DAY = 10;
    public final static int DAYS_PER_MONTH = 30;
    public final static double CORPORATION_RATE = 1.0;
    public final static double BOREWELL_RATE = 1.5;
    public final static double TANKER_RATE_500 = 2.0;
    public final static double TANKER_RATE_500_1500 = 3.0;
    public final static double TANKER_RATE_1500_3000 = 5.0;
    public final static double TANKER_RATE_3000_PLUS = 8.0;
}
