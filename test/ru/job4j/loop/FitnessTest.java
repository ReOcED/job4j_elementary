package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FitnessTest {
    @Test
    public void whenIvanGreatNik() {
        int month = Fitness.calc(95, 90);
        assertEquals(month, 0);
    }

    @Test
    public void whenIvanLessByOneNik() {
        int month = Fitness.calc(90, 95);
        assertEquals(month, 1);
    }

    @Test
    public void whenIvanLessByFewNik() {
        int month = Fitness.calc(50, 90);
        assertEquals(month, 2);
    }
}