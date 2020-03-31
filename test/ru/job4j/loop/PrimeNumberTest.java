package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberTest {
    @Test
    public void when5() {
        PrimeNumber prime = new PrimeNumber();
        int count = prime.calc(5);
        assertEquals(3, count);
    }

    @Test
    public void when11() {
        PrimeNumber prime = new PrimeNumber();
        int count = prime.calc(11);
        assertEquals(5, count);
    }

    @Test
    public void when2() {
        PrimeNumber prime = new PrimeNumber();
        int count = prime.calc(2);
        assertEquals(1, count);
    }

}