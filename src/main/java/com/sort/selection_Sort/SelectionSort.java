package com.sort.selection_Sort;

import java.util.Arrays;

import static com.sort.bubble_sort.BubbleSort.swap;

/* Сложность алгоритма O(n ^ 2)*/
public class SelectionSort {

    public static void sortBySelect(int[] array) {

        String arrayBefore = Arrays.toString(array);
        System.out.println();
        System.out.println(" Массив до сортировки - " + arrayBefore);


        for (int left = 0; left < array.length; left++) {

                /*минимальный индекс внешней итерации
                на начало внутренней итерации*/
            int minInd = left;

           /*поиск самого минимального элемента массива*/
            for (int i = left; i < array.length; i++) {

                if (array[i] < array[minInd] ) {

                    minInd = i;

                }
            }

            /*сдвиг элемента на начало массива, выполняется после полного прохода*/
            array = swap(array, left, minInd);

        }

        String arrayAfter = Arrays.toString(array);
        System.out.println(" Массив после `сортировки пузырьком` - " + arrayAfter);
    }


}
