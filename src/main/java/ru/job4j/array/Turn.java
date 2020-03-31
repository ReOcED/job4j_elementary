package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            int temp = array[i];
            array[i] = array[length - 1 - i];
            array[length - 1 - i] = temp;
        }

        return array;
    }

    public static void main(String[] args) {
        int[] input = new int[] {4, 1, 6, 2};
        for (int i : Turn.back(input)) {
            System.out.println(i);
        }
    }
}
