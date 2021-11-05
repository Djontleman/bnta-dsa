package com.djontleman.day1;

import java.util.Arrays;

public class Day1Main {

    public static void main(String[] args) {
        int testNumber = 100000;

        int[] arrayOfNumbers = generateArray(testNumber);
        int key = generateKey(testNumber);

        System.out.println("|| ========= DSA Day 1 Tasks ========= ||");
        System.out.println();
//        System.out.println("Array: " + Arrays.toString(arrayOfNumbers));
        System.out.println("Key to find: " + key);
        System.out.println();
        System.out.println("|| ========= Search Algorithms ========= ||");
        System.out.println();

        long startTime = System.nanoTime();
        System.out.println("Linear Search: " + linearSearch(arrayOfNumbers, key) + " steps");
        long stopTime = System.nanoTime();
        long timeTaken = (stopTime - startTime)/ 10000;
        System.out.println("Time taken: " + timeTaken + " milliseconds");
        System.out.println();

        startTime = System.nanoTime();
        System.out.println("Jump Search: " + jumpSearch(arrayOfNumbers, key, 3) + " steps");
        stopTime = System.nanoTime();
        timeTaken = (stopTime - startTime)/ 10000;
        System.out.println("Time taken: " + timeTaken + " milliseconds");
        System.out.println();

        startTime = System.nanoTime();
        System.out.println("Binary Search (Recursive): " + binarySearchRecursive(arrayOfNumbers, key) + " steps");
        stopTime = System.nanoTime();
        timeTaken = (stopTime - startTime)/ 100;
        System.out.println("Time taken: " + timeTaken + " microseconds");
        System.out.println();

        startTime = System.nanoTime();
        System.out.println("Binary Search (Iterative): " + binarySearchIterative(arrayOfNumbers, key) + " steps");
        stopTime = System.nanoTime();
        timeTaken = (stopTime - startTime)/ 100;
        System.out.println("Time taken: " + timeTaken + " microseconds");
        System.out.println();

        startTime = System.nanoTime();
        System.out.println("Ternary Search (Recursive): " + ternarySearchRecursive(arrayOfNumbers, key) + " steps");
        stopTime = System.nanoTime();
        timeTaken = (stopTime - startTime)/ 100;
        System.out.println("Time taken: " + timeTaken + " microseconds");
        System.out.println();

        startTime = System.nanoTime();
        System.out.println("Ternary Search (Iterative): " + ternarySearchIterative(arrayOfNumbers, key) + " steps");
        stopTime = System.nanoTime();
        timeTaken = (stopTime - startTime)/ 100;
        System.out.println("Time taken: " + timeTaken + " microseconds");
        System.out.println();
    }

    //  || ======== Part 1 ======== ||
    private static int[] generateArray(int N) {
        int[] arrayOfNumbers = new int[N];
        for (int i = 0; i < N; i++)
            arrayOfNumbers[i] = i + 1;
        return arrayOfNumbers;
    }

    //  || ======== Part 2 ======== ||
    private static int generateKey(int N) {
        return (int)(Math.random() * N) + 1;
    }

    //  || ======== Part 3 ======== ||
    private static int linearSearch(int[] arr, int key) {
        int numberOfSteps = 0;

        for (int num : arr) {
            numberOfSteps++;
            if (num == key) {
                break;
            }
        }
        return numberOfSteps;
    }

    //  || ======== Extension ======== ||

    // | ------- Jump Search ------- |
    private static int jumpSearch(int[] arr, int key, int jump) {
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

    // | ------- Binary Search ------- |

    private static int binarySearchRecursive(int[] arr, int key) {
        int numberOfSteps = 0;

        int low = 0;
        int high = arr.length - 1;

        return binarySearchModule(arr, key, low, high, numberOfSteps);
    }

    private static int binarySearchModule(int[] arr, int key, int low, int high, int numberOfSteps) {
        numberOfSteps++;

        int mid = (high + low) / 2;
        if (arr[mid] == key) {
            return numberOfSteps;
        } else if (arr[mid] > key) {
            high = mid - 1;
            return binarySearchModule(arr, key, low, high, numberOfSteps);
        } else if (arr[mid] < key) {
            low = mid + 1;
            return binarySearchModule(arr, key, low, high, numberOfSteps);
        } else {
            return numberOfSteps;
        }
    }

    private static int binarySearchIterative(int[] arr, int key) {
        int numberOfSteps = 0;

        int low = 0;
        int high = arr.length - 1;

        while(true) {
            numberOfSteps++;

            int mid = (high + low) / 2;
            if (arr[mid] == key) {
                return numberOfSteps;
            } else if (arr[mid] > key) {
                high = mid - 1;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                return numberOfSteps;
            }
        }
    }

    // | ------- Ternary Search ------- |

    private static int ternarySearchRecursive(int[] arr, int key) {
        int numberOfSteps = 0;

        int l = 0;
        int r = arr.length - 1 ;

        return ternarySearchModule(l, r, arr, key, numberOfSteps);
    }

    private static int ternarySearchModule(int l, int r, int[] arr, int key, int numberOfSteps) {
        numberOfSteps++;

        int mid1 = l + (r - l) / 3;
        int mid2 = r - (r - l) / 3;

        if (arr[mid1] > key) {
            return ternarySearchModule(l, mid1 -1, arr, key, numberOfSteps);
        } else if (arr[mid1] == key) {
            return numberOfSteps;
        } else if (arr[mid1] < key && key < arr[mid2] ) {
            return ternarySearchModule(mid1 + 1, mid2 - 1, arr, key, numberOfSteps);
        } else if (arr[mid2] == key) {
            return numberOfSteps;
        } else if (arr[mid2] < key) {
            return ternarySearchModule(mid2 + 1, r, arr, key, numberOfSteps);
        } else {
            return numberOfSteps;
        }
    }

    private static int ternarySearchIterative(int[] arr, int key) {
        int numberOfSteps = 0;

        int l = 0;
        int r = arr.length - 1 ;

        while(true) {
            numberOfSteps++;

            int mid1 = l + (r - l) / 3;
            int mid2 = r - (r - l) / 3;

            if (arr[mid1] > key) {
                r = mid1 - 1;
            } else if (arr[mid1] == key) {
                return numberOfSteps;
            } else if (arr[mid1] < key && key < arr[mid2]) {
                l = mid1 + 1;
                r = mid2 - 1;
            } else if (arr[mid2] == key) {
                return numberOfSteps;
            } else if (arr[mid2] < key) {
                l = mid2 + 1;
            } else {
                return numberOfSteps;
            }
        }
    }
}


