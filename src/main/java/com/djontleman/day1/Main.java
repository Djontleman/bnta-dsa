package com.djontleman.day1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int testNumber = 25;

        int[] arrayOfNumbers = GenerateArray(testNumber);
        int key = GenerateKey(testNumber);
        System.out.println(Arrays.toString(arrayOfNumbers));
        System.out.println(key);

        System.out.println(LinearSearch(arrayOfNumbers, key));
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

    //  || ======== Part 3 ======== ||
    public static int LinearSearch(int[] arr, int key) {
        if (key < arr[0] || key > arr[arr.length - 1]) {
            System.out.println("Key outside of array");
            return 0;
        } else {
            int numberOfSteps = 0;

            for (int num : arr) {
                numberOfSteps++;
                if (num == key) {
                    break;
                }
            }
            return numberOfSteps;
        }
    }
}


