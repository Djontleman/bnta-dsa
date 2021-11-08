package com.djontleman.day2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Day2Task1 {

    // Completed collaboratively in Study Group 4
    // With Darania, Hajera and Rashid

    public static void main(String[] args) {
        System.out.println("|| ========= DSA Day 2 Task 1 ========= ||");
        System.out.println();
        int[] arrayOfNumbers = generateArrayLoop(3);
        System.out.println("Generated array: " + Arrays.toString(arrayOfNumbers));
        System.out.println();

        long startTime = System.nanoTime();
        int subtractTwoResult = subtractTwo(arrayOfNumbers);
        long stopTime = System.nanoTime();
        System.out.println("subtractTwo() result: " + subtractTwoResult);
        System.out.println("SubtractTwo() time taken: " + (stopTime - startTime)/1 + " nanoseconds");
        System.out.println();

        startTime = System.nanoTime();
        int[][] pairNumbersResult = pairNumbers(arrayOfNumbers);
        stopTime = System.nanoTime();
        System.out.print("pairNumbers() result: ");
        for (int[] array : pairNumbersResult) {
            System.out.print(Arrays.toString(array));
        }
        System.out.println();
        System.out.println("pairNumbers() time taken: " + (stopTime - startTime)/1 + " nanoseconds");
        System.out.println();

        startTime = System.nanoTime();
        int sumArrayLoopResult = sumArrayLoop(arrayOfNumbers);
        stopTime = System.nanoTime();
        System.out.println("sumArrayLoop() result: " + sumArrayLoopResult);
        System.out.println("sumArrayLoop() time taken: " + (stopTime - startTime)/1 + " nanoseconds");
        System.out.println();

        System.out.println("Bonus!");
        startTime = System.nanoTime();
        int sumArrayStreamResult = sumArrayStream(arrayOfNumbers);
        stopTime = System.nanoTime();
        System.out.println("sumArrayStream() result: " + sumArrayStreamResult);
        System.out.println("sumArrayStream() time taken: " + (stopTime - startTime)/1 + " nanoseconds");
        System.out.println();

        System.out.println("|| ================ End ================ ||");
    }

    //  || ======== Part 1 ======== ||
    // (Taken from Day 1 Part 1)
    static int[] generateArrayLoop(int N) {
        int[] arrayOfNumbers = new int[N];
        for (int i = 0; i < N; i++)
            arrayOfNumbers[i] = i + 1;
        return arrayOfNumbers;
    }

    // Alternative using stream
    static int[] generateArrayStream(int N) {
        return IntStream.rangeClosed(1, N).toArray();
    }

    //  || ======== Part 2 ======== ||

    // | ------- Part 2A ------- |
    static int subtractTwo(int[] arr) {
        return arr[1] - 2;
    }
    // Time Complexity: Constant - O(1)

    // | ------- Part 2B ------- |
    static int[][] pairNumbers(int arr[]) {

        int[] [] numberPairs = new int[arr.length * arr.length][2];
        int i = 0;
        // Nested loop for all possible pairs
        for (int j = 0; j < arr.length; j++) {
            for (int k = 0; k < arr.length; k++) {
                numberPairs[i][0] = arr[j];
                numberPairs[i][1] = arr[k];
                i++;
            }
        }
        return numberPairs;
    }
    // Time Complexity: Quadratic - O(N^2)

    // | ------- Part 2C ------- |
    static int sumArrayLoop(int[] arr) {
        int sum = 0;

        for (int number : arr) {
            sum += number;
        }
        return sum;
    }
    // Time Complexity: Linear - O(N)

    // Alternative using streams
    static int sumArrayStream(int[] arr) {
        return IntStream.of(arr).sum();
    }

}
