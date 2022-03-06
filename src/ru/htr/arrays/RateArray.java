package ru.htr.arrays;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class RateArray {
    public void rateArray() {
        var n = ThreadLocalRandom.current().nextInt(1,51);
        int[] randArray = new int[n];
        for (int i = 0; i < n; i++) {
            randArray[i] = ThreadLocalRandom.current().nextInt(1,11);
        }
        Arrays.sort(randArray);
        System.out.println("Массив случайной длины, заполненный случайными числами: ");
        for (int i = 0; i < n; i++) {
            System.out.print(randArray[i] +  " ");
        }
        int[][] rateArray = new int[2][10];
        for (int i = 0; i < 10; i++) {
            rateArray[0][i] = i + 1;
        }
        int amount;
        for (int i = 0; i < 10; i++) {
            amount = 0;
            for (int j = 0; j < n; j++) {
                if (i + 1 == randArray[j]) amount++;
            }
            rateArray[1][i] = amount;
        }
        System.out.println();
        System.out.println("Частотный массив:");
        for(int i = 0; i < rateArray.length; i++) {
            for (int j = 0; j < rateArray[i].length; j++) {
                System.out.print(rateArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
