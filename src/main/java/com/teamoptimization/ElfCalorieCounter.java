package com.teamoptimization;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ElfCalorieCounter {
    public ElfCalorieCounter() {

    }

    public Integer calculateMax(String calories) {
        String[] caloriesArray = calories.split("\n\n");

        for (String calorie : caloriesArray) {
            return Integer.valueOf(calorie);
        }

        return 0;
    }
}
