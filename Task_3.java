/*
 * 3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
 */

 import java.util.ArrayList;
 import java.util.Random;
 
 import static java.util.Collections.max;
 import static java.util.Collections.min;
 
 public class Task_3 {
     public static void main(String[] args) {
         Random rnd = new Random();
         ArrayList<Integer> arr = new ArrayList<Integer>();
         for (int i = 0; i < 10; i++) {
             int val = rnd.nextInt(-10, 10);
             arr.add(val);
         }
         System.out.printf("Основной список: %s\n", arr);
         int max = max(arr);
         int min = min(arr);
         int maxItem = arr.get(0);
         int minItem = arr.get(0);
         int sumItems = 0;
         for (int item : arr) {
             if (item > maxItem) {
                 maxItem = item;
             }
             if (item < minItem) {
                 minItem = item;
             }
             sumItems += item;
         }
         float average = (float) sumItems / arr.size();
         System.out.printf("Максимальный элемент = %s\n", max);
 
         System.out.printf("Минимальный элемент = %s\n", min);
 
         System.out.printf("Среднее арифметическое = %s\n", average);
     }
 }
