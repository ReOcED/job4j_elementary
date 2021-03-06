package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        if (pref.length > word.length) {
            return false;
        }
        boolean result = true;
        for (int i = 0; i < pref.length && result; i++) {
            result = word[i] == pref[i];
        }
        return result;
    }
}
