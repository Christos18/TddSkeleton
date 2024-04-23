package com.teamoptimization;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ElfCalorieCounter {
    public ElfCalorieCounter() {

    }

    public int calculateMax(String calories) {
        String[] caloriesArray = calories.trim().split("\n\n");;

        int max = 0;

        for (String calorie : caloriesArray) {
            int currVal = Integer.parseInt(calorie);

            if (currVal > max){
                max = currVal;
            }
        }

        return max;
    }
}
