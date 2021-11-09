package com.djontleman.day3;

import java.util.Arrays;

import static java.lang.Math.random;

public class Day3Task1 {

    public static void main(String[] args) {

        System.out.println("|| ========= DSA Day 2 Task 3 ========= ||");
        System.out.println();

        // int[] arrayToBeSorted = {1, 4, 7, 2, 6, 7, 5, 3, 6};

        int[] generatedArrayToBeSorted = generateRandomArray(10, 10);
        System.out.print("Array to be sorted: ");
        System.out.println(Arrays.toString(generatedArrayToBeSorted));

        int[] sortedArray = bubbleSort(generatedArrayToBeSorted);
        System.out.print("Bubble-sorted array: ");
        System.out.println(Arrays.toString(sortedArray));
        System.out.println();

        System.out.println("|| ================ End ================ ||");
    }

    // Generates array of random numbers from 1 to [max]
    static int[] generateRandomArray(int length, int max) {
        int[] randomArray = new int[length];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) (Math.random() * max + 1);
        }
        return randomArray;
    }

    // Bubble Sort Algorithm
    static int[] bubbleSort(int[] arr) {
        int numberOfSteps = 0;
        boolean sorted;

        System.out.println("Starting bubble sort...");
        long startTime = System.nanoTime();

        do {
            sorted = true;

            for (int i = 0; i < arr.length - 1; i++) {
                numberOfSteps++;

                int currentElement = arr[i];
                int nextElement = arr[i + 1];
                if (currentElement > nextElement) {
                    arr[i] = nextElement;
                    arr[i + 1] = currentElement;

                    sorted = false;
                }
            }
        } while (!sorted);

        long stopTime = System.nanoTime();

        System.out.println("Time taken: " + (stopTime - startTime) + " nanoseconds");
        System.out.println("Number of steps: " + numberOfSteps);
        return arr;
    }
}
