package com.sort;

import com.sort.bubble_sort.BubbleSort;

import java.util.Arrays;

import static com.sort.counting_sort.CountingSort.countingSort;
import static com.sort.insertion_sort.InsertionSort.sortByInsertion;
import static com.sort.merge_sort.MergeSort.mergeSort;
import static com.sort.merge_sort.MergeSort.sortByMergeWithRecursion;
import static com.sort.quick_sort.QuickSort.quickSort;
import static com.sort.selection_Sort.SelectionSort.sortBySelect;
import static com.sort.shuttle_sorting.ShuttleSorting.sortByShuttle;
import static com.sort.sort_shell.SortShell.sortOfShell;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) {


        int[] array = {  11, 3,  10,  7,  4,  2, 5};

        /*сорттировка пузырьком*/
     //   BubbleSort.sortByBubble(array);

        /*сорттировка выбором*/
      //  sortBySelect(array);

       // sortByInsertion(array);
      //  sortByShuttle(array);

       // sortOfShell(array);

    //    mergeSort (array, 0, array.length - 1);

     //   countingSort(array, 11);

        quickSort(array, 11, 5);
    }
}
