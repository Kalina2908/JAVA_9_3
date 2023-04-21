/*
 * 2. Пусть дан произвольный список целых чисел, удалить из него чётные числа
 */

import java.util.ArrayList;
import java.util.Random;

public class Task_2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int val = rnd.nextInt(-10, 10);
            arr.add(val);
        }
        System.out.printf("Основной список: %s\n", arr);
        int i = 0;
        while (i < arr.size()) {
            if (arr.get(i) % 2 == 0) {
                arr.remove(i);
            } else {
                i++;
            }
        }
        System.out.printf("Список без четных чисел:  %s", arr);
    }
}