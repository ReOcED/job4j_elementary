package ru.job4j.loop;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;


public class CounterTest {

    @Test
    public void sumByEven() {
        assertEquals(Counter.sumByEven(1, 10), 30);
    }
}