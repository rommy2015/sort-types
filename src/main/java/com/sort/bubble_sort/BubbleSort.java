package com.sort.bubble_sort;

import java.util.Arrays;


/* Сложность алгоритма O(n ^ 2)*/
public class BubbleSort {

   /*обмен местами значений указанных элеметов,
   * текущего массива*/
    public static int [] swap ( int [] array, int a1, int b2) {

        int tmp = array[a1];
        array [a1] = array[b2];
        array [b2] = tmp;

        return array;
    }

    public static void sortByBubble(int [] array){

        String arrayBefore = Arrays.toString(array);
        System.out.println();
        System.out.println(" Массив до сортировки - " + arrayBefore);

        boolean needAnIteration = true;

        while (needAnIteration) {

            needAnIteration = false;

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i + 1] < array[i]) {

                    array = swap(array, i + 1, i);

                    needAnIteration = true;
                }
            }

        }

        String arrayAfter = Arrays.toString(array);
        System.out.println(" Массив после `сортировки пузырьком` - " + arrayAfter);
    }

}
