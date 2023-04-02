package com.fabricgroup.waterbillmanager;

import com.fabricgroup.waterbillmanager.util.Constants;

public class Main {
    public static void main(String[] args) {
        System.out.println(Constants.APPLICATION_START_MESSAGE);
        if (args.length > 0) {
            for (String arg : args) {
                String inputFilePath = arg;
                System.out.println(inputFilePath);
            }
        } else {
            System.out.println(Constants.INPUT_FILEPATH_ARG_NOT_FOUND_MESSAGE);
        }
    }
}