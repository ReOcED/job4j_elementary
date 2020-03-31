package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        if (number == 1) {
            return false;
        }
        boolean prime = true;
        int i = 2;
        while (i < number && prime) {
            if (number % i == 0) {
                prime = false;
            }
            i++;
        }
        return prime;
    }
}
