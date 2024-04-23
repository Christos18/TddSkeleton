package com.teamoptimization;

public class ElfCalorieCounter {
    public ElfCalorieCounter() {

    }

    public int calculateMax(String calories) {
        String[] caloriesArray = calories.trim().split("\n\n");
        int max = 0;

        for (String calorie: caloriesArray) {
            String[] caloriesPerElf = calorie.trim().split("\n");
            int totalPerElf = 0;

            for (String individualCalorie : caloriesPerElf) {
                totalPerElf += Integer.parseInt(individualCalorie);
            }

            if (totalPerElf > max) {
                max = totalPerElf;
            }
        }

        return max;
    }
}
