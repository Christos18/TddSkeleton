package com.teamoptimization;

import com.oocode.Example;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ElfCalorieCounterTest {
    private final ElfCalorieCounter underTest = new ElfCalorieCounter();

    @Test
    @Disabled
    public void testCanFindMaxOfExample() {
        assertThat(underTest.calculateMax(
                """
                        1000
                        2000
                        3000

                        4000

                        5000
                        6000

                        7000
                        8000
                        9000

                        10000"""
        ), equalTo(24000));
    }
    @Test
    public void checkMaxCaloriesForOneElfOneItem() {
        assertThat(underTest.calculateMax("1000"), equalTo(1000));
    }
}
