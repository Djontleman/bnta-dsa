package com.djontleman.day1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(GenerateArray(3)));
    }

    public static int[] GenerateArray(int N) {
        int[] arrayOfNumbers = new int[N];
        for (int i = 0; i < N; i++)
            arrayOfNumbers[i] = i + 1;
        return arrayOfNumbers;
    }
}


