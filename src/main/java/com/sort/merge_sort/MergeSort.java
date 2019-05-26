package com.sort.merge_sort;

import java.util.Arrays;

import static com.sort.bubble_sort.BubbleSort.swap;


public class MergeSort {


    public static int[] sortByMergeWithRecursion(int[] source, int left, int right) {


        /* Выберем разделитель, т.е. разделим пополам входной массив*/
        int delimiter = left + ((right - left) / 2) + 1;

        /*Выполним рекурсивно данную функцию для двух половинок (если сможем разбить)*/

        if (delimiter > 0 && right > (left + 1)) {

            sortByMergeWithRecursion(source, left, delimiter - 1);
            sortByMergeWithRecursion(source, delimiter, right);
        }


        // Создаём временный массив с нужным размером
        int[] buffer = new int[right - left + 1];
        // Начиная от указанной левой границы идём по каждому элементу
        int cursor = left;
        for (int i = 0; i < buffer.length; i++) {
            // Мы используем delimeter чтобы указывать на элемент из правой части
            // Если delimeter > right, значит в правой части не осталось недобавленных элементов
            if (delimiter > right || source[cursor] > source[delimiter]) {
                buffer[i] = source[cursor];
                cursor++;
            } else {
                buffer[i] = source[delimiter];
                delimiter++;
            }
        }

        System.arraycopy(buffer, 0, source, left, buffer.length);

        return buffer;
    }


    public static void mergeSort (int[] source, int left, int right){

        String arrayBefore = Arrays.toString(source);
        System.out.println();
        System.out.println(" Массив до сортировки - " + arrayBefore);

        int[] ints = sortByMergeWithRecursion(source, left, right);

        String arrayAfter = Arrays.toString(ints);
        System.out.println(" Массив после `сортировки ` - " + arrayAfter);
    }

}
