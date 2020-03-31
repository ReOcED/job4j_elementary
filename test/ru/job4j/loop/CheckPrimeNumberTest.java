package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckPrimeNumberTest {
    @Test
    public void when5() {
        boolean rsl = CheckPrimeNumber.check(5);
        assertTrue(rsl);
    }

    @Test
    public void when4() {
        boolean rsl = CheckPrimeNumber.check(4);
        assertFalse(rsl);
    }

    @Test
    public void when1() {
        boolean rsl = CheckPrimeNumber.check(1);
        assertFalse(rsl);
    }
}