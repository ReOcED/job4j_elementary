package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean first = data[0];
        for (boolean b : data) {
            if (b != first) {
                return false;
            }
        }
        return true;
    }
}
