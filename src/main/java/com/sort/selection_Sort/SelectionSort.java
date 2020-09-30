package com.sort.selection_Sort;

import java.util.Arrays;

import static com.sort.bubble_sort.BubbleSort.swap;

/* Сложность алгоритма O(n ^ 2)*/
public class SelectionSort {

    /**
     * Может быть как устойчивый,
     * так и неустойчивый. На массиве
     * из n элементов имеет время выполнения в худшем,
     * среднем и лучшем случае Θ(n2),
     * предполагая что сравнения делаются за постоянное время.
     *
     * Шаги алгоритма:
     *
     *    - находим номер минимального значения в текущем списке
     *   -  производим обмен этого значения со
     *     значением первой неотсортированной позиции
     *     (обмен не нужен, если минимальный элемент уже
     *     находится на данной позиции)
     *     - теперь сортируем хвост списка,
     *     исключив из рассмотрения уже отсортированные элементы
     * @param array
     */
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
