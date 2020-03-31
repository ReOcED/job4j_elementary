package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {7, 5, 1, 3, -2, 2, 4, 6, -1};
        int temp = array[0]; // переменная для временного хранения значение ячейки с индексом 0.
        array[0] = array[3]; // записываем в ячейку с индексом 0 значение ячейки с индексом 3.
        array[3] = temp; // записываем в ячейку с индексом 3 значение временной переменной.

/*        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
        System.out.println("ёпт");*/
        AlgoArray aa = new AlgoArray();
        for (int i : aa.selection(array)) {
            System.out.println(i);
        }
    }

    public int[] bubble(int[] unsorted) {
        boolean sorted = false;
        int j = 0;
        while (!sorted) {
            sorted = true;
            for (int i = j; i < unsorted.length - 1; i++) {
                if (unsorted[i] > unsorted[i + 1]) {
                    int temp = unsorted[i];
                    unsorted[i] = unsorted[i + 1];
                    unsorted[i + 1] = temp;
                    sorted = false;
                }
            }
            j++;
        }
        return unsorted;
    }

    public int[] insertion(int[] unsorted) {
        for (int i = 1; i < unsorted.length; i++) {
            int toSort = unsorted[i];
            int j = i;
            while (j > 0 && unsorted[j - 1] > toSort) {
                unsorted[j] = unsorted[j - 1];
                j--;
            }
            unsorted[j] = toSort;
        }
        return unsorted;
    }

    public int[] selection(int[] unsorted) {
        for (int i = 0; i < unsorted.length; i++) {
            int minIndex = i;
            int j = i + 1;
            while (j < unsorted.length) {
                if (unsorted[j] < unsorted[minIndex]) {
                    minIndex = j;
                }
                j++;
            }
            int temp = unsorted[i];
            unsorted[i] = unsorted[minIndex];
            unsorted[minIndex] = temp;

        }
        return unsorted;
    }

}
