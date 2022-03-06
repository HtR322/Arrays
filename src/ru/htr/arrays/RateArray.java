package ru.htr.arrays;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class RateArray {
    public void rateArray() {
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
        int uniq = 1;
        for (int i = 1; i < n; i++) {
            if (randArray[i] != randArray[i-1]) uniq++;
        }
        int[][] rateArray = new int[2][uniq];
        int k = 1;
        rateArray[0][0] = randArray[0];
        for (int i = 1; i < n; i++) {
             if (randArray[i] != randArray[i-1]) {
                 rateArray[0][k] = randArray[i];
                 k++;
             }
        }
        int amount;
        for (int i = 0; i < uniq; i++) {
            amount = 0;
            for (int j = 0; j < n; j++) {
                if (rateArray[0][i] == randArray[j]) amount++;
            }
            rateArray[1][i] = amount;
        }
        System.out.println();
        System.out.println("Частотный массив:");
        for(int i = 0; i < rateArray.length; i++) {
            for (int j = 0; j < rateArray[i].length; j++) {
                System.out.printf("%2d ", rateArray[i][j]);
            }
            System.out.println();
        }
    }
}
