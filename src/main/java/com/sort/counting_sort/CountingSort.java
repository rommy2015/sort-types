package com.sort.counting_sort;

import java.util.Arrays;

public class CountingSort {

    /**
     * Алгоритмическая сложность в этом случае будет O(n+k),
     * где n — количество элементов,
     * а k — максимальное значение элемента.
     * @param theArray
     * @param maxValue
     */
    public static void countingSort(int[] theArray, int maxValue) {

        String arrayBefore = Arrays.toString(theArray);
        System.out.println();
        System.out.println(" Массив до сортировки - " + arrayBefore);


        /* Массив со "счётчиками"
        размером от 0 до максимального значения*/

        int numCounts[] = new int[maxValue + 1];

        /* В соответствующей ячейке (индекс = значение)
        увеличиваем счётчик*/
        for (int num : theArray) {
            numCounts[num]++;
        }

        /*Подготавливаем массив для отсортированного результата*/
        int[] sortedArray = new int[theArray.length];

        int currentSortedIndex = 0;
        // идём по массиву со "счётчиками"
        for (int n = 0; n < numCounts.length; n++) {
            int count = numCounts[n];
            // идём по количеству значений
            for (int k = 0; k < count; k++) {
                sortedArray[currentSortedIndex] = n;
                currentSortedIndex++;
            }
        }
        String arrayAfter = Arrays.toString(sortedArray);
        System.out.println(" Массив после `сортировки пузырьком` - " + arrayAfter);

      //  return sortedArray;
    }
}
