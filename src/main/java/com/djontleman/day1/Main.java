package com.djontleman.day1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int testNumber = 25;

        int[] arrayOfNumbers = GenerateArray(testNumber);
        int key = GenerateKey(testNumber);
        System.out.println("Array: " + Arrays.toString(arrayOfNumbers));
        System.out.println("Key: " + key);
        System.out.println();
        System.out.println("Number of steps");
        System.out.println("Linear Search: " + LinearSearch(arrayOfNumbers, key));
        System.out.println("Jump Search: " + JumpSearch(arrayOfNumbers, key, 3));
        System.out.println("Ternary Search: " + TernarySearch(arrayOfNumbers, key));
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

    //  || ======== Extension ======== ||

    // | ------- Jump Search ------- |
    public static int JumpSearch(int[] arr, int key, int jump) {
        int numberOfSteps = 0;

        int previousIndex = -1;
        int previousNumber;

        int currentIndex = 0;
        int currentNumber;

        numberOfSteps++;

        currentNumber = arr[currentIndex];
        if (currentNumber == key) {
            return numberOfSteps;
        }

        while (currentNumber < key) {
            numberOfSteps++;

            previousIndex = currentIndex;
            if (currentIndex + jump >= arr.length) {
                currentIndex = arr.length - 1;
            } else {
                currentIndex += jump;
            }

            currentNumber = arr[currentIndex];
            if (currentNumber == key) {
                return numberOfSteps;
            }
        }

        for (int i = previousIndex + 1; i < currentIndex; i++) {
            numberOfSteps++;

            currentNumber = arr[i];
            if (currentNumber == key) {
                break;
            }
        }
        return numberOfSteps;
    }

    // | ------- Ternary Search ------- |

    public static int TernarySearch(int[] arr, int key) {
        int numberOfSteps = 0;

        int l = 0;
        int r = arr.length - 1 ;

        return TernarySearchModule(l, r, arr, key, numberOfSteps);
    }

    private static int TernarySearchModule(int l, int r, int[] arr, int key, int numberOfSteps) {
        numberOfSteps++;

        int mid1 = l + (r - l) / 3;
        int mid2 = r - (r - l) / 3;

//        else if (arr[l] > key) {
//            return TernarySearchModule(l, r, arr, key, numberOfSteps);
//        }

        if (arr[mid1] > key) {
            return TernarySearchModule(l, mid1 -1, arr, key, numberOfSteps);
        }

        numberOfSteps++;

        if (arr[mid1] == key) {
            return numberOfSteps;
        } else if (arr[mid1] < key && key < arr[mid2] ) {
            return TernarySearchModule(mid1 + 1, mid2 - 1, arr, key, numberOfSteps);
        }

        numberOfSteps++;

        if (arr[mid2] == key) {
            return numberOfSteps;
        } else if (arr[mid2] < key) {
            return TernarySearchModule(mid2 + 1, r, arr, key, numberOfSteps);
        }

        return 0;
    }
}


