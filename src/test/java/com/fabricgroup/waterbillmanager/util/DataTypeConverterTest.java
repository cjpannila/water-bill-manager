package com.fabricgroup.waterbillmanager.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataTypeConverterTest {

    @Test
    void parseIntWithDefault() {
        int expectedResult = 12;
        int result = DataTypeConverter.parseIntWithDefault("12", 0);
        assertEquals(expectedResult, result);
    }

    @Test
    void parseIntWithDefault1() {
        int expectedResult = 0;
        int result = DataTypeConverter.parseIntWithDefault("1x2", 0);
        assertEquals(expectedResult, result);
    }
}