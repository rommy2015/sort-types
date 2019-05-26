package com.sort.sort_shell;

import java.util.Arrays;

import static com.sort.bubble_sort.BubbleSort.swap;

public class SortShell {

    public static void sortOfShell(int[] array) {

        String arrayBefore = Arrays.toString(array);
        System.out.println();
        System.out.println(" Массив до сортировки - " + arrayBefore);

        /**
         Высчитываем промежуток между проверяемыми элементами
         **/
        int gap = array.length / 2;

         /**
        Пока разница между элементами есть
         **/
        while (gap >= 1) {

            for (int right = 0; right < array.length; right++) {
                /* Смещаем правый указатель, пока не сможем найти такой, что
               между ним и элементом до него не будет нужного промежутка*/
                for (int c = right - gap; c >= 0; c -= gap) {

                    if (array[c] > array[c + gap]) {

                        array = swap(array, c, c + gap);
                    }
                }
            }
            /* Пересчитываем разрыв*/
            gap = gap / 2;
        }
        String arrayAfter = Arrays.toString(array);
        System.out.println(" Массив после `сортировки ` - " + arrayAfter);
    }

}
