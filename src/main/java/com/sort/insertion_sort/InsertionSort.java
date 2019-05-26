package com.sort.insertion_sort;

import java.util.Arrays;


public class InsertionSort {

    public static void sortByInsertion(int[] array) {

        String arrayBefore = Arrays.toString(array);
        System.out.println();
        System.out.println(" Массив до сортировки - " + arrayBefore);


        for (int left = 0; left < array.length; left++) {

            /* Вытаскиваем значение элемента c левой части массива,
            полученное на текущей итерации внешнего цикла */
            int value = array[left];

            /* Затем выполняем перемемещение по элементам вправо,
             которые перед вытащенным элементомж;
             Для первой итерации внешенго цикла, внешний цикл не будет работать
             так как i = -1*/
            int i = left - 1;

            /*Внутренний цикл начинает передвижение по элементам вправо, от
            * текущего левого элемента*/
            for ( ; i >= 0; i--) {
                /* Если вытащили значение меньшее — передвигаем больший
                элемент дальше */
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    /* Если вытащенный элемент больше — останавливаемся*/
                    break;
                }
            }

            /* В освободившееся место вставляем вытащенное значение
            * (внешний цикл)*/
            array[i + 1] = value;
        }

        String arrayAfter = Arrays.toString(array);
        System.out.println(" Массив после `сортировки ` - " + arrayAfter);
    }
}
