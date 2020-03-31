package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        assertEquals(Factorial.calc(5), 120);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        assertEquals(Factorial.calc(0), 1);
    }
}