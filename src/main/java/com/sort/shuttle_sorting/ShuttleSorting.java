package com.sort.shuttle_sorting;

import java.util.Arrays;

import static com.sort.bubble_sort.BubbleSort.swap;

public class ShuttleSorting {


    public static void sortByShuttle(int[] array) {

        String arrayBefore = Arrays.toString(array);
        System.out.println();
        System.out.println(" Массив до сортировки - " + arrayBefore);

        for (int i = 1; i < array.length; i++) {

            if (array[i] < array[i - 1]) {

               array = swap(array, i, i - 1);

                for (int z = i - 1; (z - 1) >= 0; z--) {

                    if (array[z] < array[z - 1]) {

                   array = swap(array, z, z - 1);

                    } else {
                        break;
                    }
                }
            }
        }

        String arrayAfter = Arrays.toString(array);
        System.out.println(" Массив после `сортировки ` - " + arrayAfter);
    }

}
