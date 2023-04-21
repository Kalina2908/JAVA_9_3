/*
 * 1.Реализовать алгоритм сортировки слиянием и выборкой.
 */

import java.util.Random;

public class Task_1_2 {

    public static class SelectionSort {
        int find_min(int arr[], int start, int end) {
            int min_idx = start;
            int minimum = arr[start];
            for (int i=start; i<end; i++) {
                if (arr[i] < minimum) {
                    min_idx = i;
                    minimum = arr[i];
                }
            }
            return min_idx;
        }
    
        void selection_sort(int[] arr) {
            int arr_len = arr.length;
            int start = 0;
            int min_idx;
            while (start < arr_len) {
                min_idx = find_min(arr, start, arr_len);
                int temp = arr[start];
                arr[start] = arr[min_idx];
                arr[min_idx] = temp;
                start++;
            }
        }
   
    public static void main(String args[]) {

        System.out.println("Сортировка выборкой:");
        Random r = new Random();
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
            System.out.printf("%d ", arr[i]);
        }
        

        SelectionSort sel_sort = new SelectionSort();
        sel_sort.selection_sort(arr);

        System.out.println("Список после сортировки:");
        for (int j=0; j<arr.length; j++) {
            System.out.printf("%d ", arr[j]);
        }
    }
}
}

