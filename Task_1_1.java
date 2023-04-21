/*
*1. Реализовать алгоритм сортировки слиянием и выборкой.(Самое эффективное , это изучить эти сортировки на Питоне , и постараться написать их на java)
*/


import java.util.Random;
import java.util.Arrays;

public class Task_1_1 {
    public static int[] mergeSort(int[] sortArr) {
        int[] buff1 = Arrays.copyOf(sortArr, sortArr.length);
        int[] buff2 = new int[sortArr.length];
        int[] result = mergeSortInner(buff1, buff2, 0, sortArr.length);
        return result;
    }

    public static int[] mergeSortInner(int[] buff1, int[] buff2, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buff1;
        }

        
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergeSortInner(buff1, buff2, startIndex, middle);
        int[] sorted2 = mergeSortInner(buff1, buff2, middle, endIndex);


        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buff1 ? buff2 : buff1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
    public static void main(String args[]) {

        System.out.println("Сортировка слиянием:");
        Random r = new Random();
        int[] sortArr = new int[10];
        for(int i = 0; i < sortArr.length; i++) {
            sortArr[i] = r.nextInt(100);
            //System.out.print(sortArr[i] + "  ");

        int[] result = mergeSort(sortArr);
        System.out.println(Arrays.toString(result));
    }
}
}
