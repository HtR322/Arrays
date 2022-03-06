package ru.htr.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class EvenArray {
    public void evenArray() {
        var n = ThreadLocalRandom.current().nextInt(1,101);
        int[] randArray = new int[n];
        for (int i = 0; i < n; i++) {
            randArray[i] = ThreadLocalRandom.current().nextInt(1,21);
        }
        Arrays.sort(randArray);
        System.out.println("Отсортированный массив случайной длины, заполненный случайными числами: ");
        for (int i = 0; i < n; i++) {
            System.out.print(randArray[i] +  " ");
        }
        System.out.println();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (randArray[i] % 2 == 0) count++;
        }
        int[] evArray = new int[count];
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (randArray[i] % 2 == 0) {
                evArray[k] = randArray[i];
                k++;
            }
        }
        System.out.println("Массив, заполненный чётными числами");
        for (int i = 0; i < count; i++) {
            System.out.print(evArray[i] + " ");
        }
    }
}
