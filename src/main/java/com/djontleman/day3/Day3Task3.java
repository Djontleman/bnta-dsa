package com.djontleman.day3;

import java.util.Arrays;
import java.util.HashMap;

public class Day3Task3 {

    public static void main(String[] args) {

        System.out.println("|| ========= DSA Day 3 Task 3 ========= ||");
        System.out.println();

        int[] arrayToBeTested1 = {2, 7, 11, 15};
        int target1 = 9;

        int[] arrayToBeTested2 = {3, 2, 4};
        int target2 = 6;

        int[] arrayToBeTested3 = {3, 3};
        int target3 = 6;

        System.out.println("Array to be tested: " + Arrays.toString(arrayToBeTested1));
        System.out.println("Target: " + target1);
        System.out.println();

        long startTime = System.nanoTime();
        int[] twoSumLoopResult = twoSumLoop(arrayToBeTested1, target1);
        long stopTime = System.nanoTime();
        System.out.print("twoSumLoop result: ");
        System.out.println(Arrays.toString(twoSumLoopResult));
        System.out.println("Time taken: " + (stopTime - startTime) + " nanoseconds");
        System.out.println();

        startTime = System.nanoTime();
        int[] twoSumHashMapResult = twoSumHashMap(arrayToBeTested1, target1);
        stopTime = System.nanoTime();
        System.out.print("twoSumHashMap result: ");
        System.out.println(Arrays.toString(twoSumHashMapResult));
        System.out.println("Time taken: " + (stopTime - startTime) + " nanoseconds");
        System.out.println();

        System.out.println("|| ================ End ================ ||");
    }

    static int[] twoSumLoop(int[] numbers, int target) {

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target && i != j) {
                    return new int[]{i, j};
                }
            }
        }

        System.out.println("No solution found");
        return new int[0];
    }

    static int[] twoSumHashMap(int[] numbers, int target) {
        HashMap<Integer, Integer> solutions = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            if (solutions.containsKey(numbers[i]) && solutions.get(numbers[i]) != i) {
                return new int[]{solutions.get(numbers[i]), i};
            }
            solutions.put(target - numbers[i], i);
        }

        System.out.println("No solution found");
        return new int[0];
    }







    static int[] twoOrMoreSum(int[] nums, int target) {
        int[] sums = new int[nums.length];




        return new int[0];
    }
}
