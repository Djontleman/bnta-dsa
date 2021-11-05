package com.djontleman.day1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(GenerateArray(3)));
        System.out.println(GenerateKey(3));

    }

    //  || ======== Part 1 ======== ||
    public static int[] GenerateArray(int N) {
        int[] arrayOfNumbers = new int[N];
        for (int i = 0; i < N; i++)
            arrayOfNumbers[i] = i + 1;
        return arrayOfNumbers;
    }

    //  || ======== Part 2 ======== ||
    public static int GenerateKey(int N) {
        return (int)(Math.random() * N) + 1;
    }
}


