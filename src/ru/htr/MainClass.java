package ru.htr;

import ru.htr.arrays.EvenArray;
import ru.htr.arrays.RateArray;

public class MainClass {
    public static void main(String[] args) {
        var rateArray = new RateArray();
        var evArray = new EvenArray();
        rateArray.rateArray();
        evArray.evenArray();
    }
}
