/**
 * Class DataTypeConverter
 * util class for string to number type conversion
 *
 * @author Chinthana Pannila
 * @version 1.0
 * @since 2023-04-03
 */
package com.fabricgroup.waterbillmanager.util;

public class DataTypeConverter {
    /**
     * method for converting number string to int
     * If number format error then returns the default int value
     * @param number
     * @param defaultVal
     * @return converted int value
     */
    public static int parseIntWithDefault(String number, int defaultVal) {
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException e) {
            return defaultVal;
        }
    }
}
