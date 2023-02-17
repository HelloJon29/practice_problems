package com.jonkim.algorithm;

import java.util.Random;

public class MergeSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[100000000];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(1000000);
        }

        System.out.println("Before:");
//        printArray(numbers);
        mergeSort(numbers);

        System.out.println("\nAfter:");
//        printArray(numbers);
    }

    public static void mergeSort(int[] inputArray) {
        int inputLength = inputArray.length;
        // if the length of the array is less than 2 than sorting is finished
        if(inputLength < 2) {
            return;
        }

        // Need to divide array
        int midIndex = inputLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength - midIndex];

        // populate halves
        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = inputArray[i];
        }
        for (int i = midIndex; i < inputLength; i++) {
            rightHalf[i - midIndex] = inputArray[i];
        }

        //sort both halves recursively by calling the method itself
        mergeSort(leftHalf);
        mergeSort(rightHalf);

        // Merge down until complete array
        merge(inputArray, leftHalf, rightHalf);

    }

    private static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        // declare variables for iterators for left, right and full array iterations
        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
               inputArray[k] = leftHalf[i];
               i++;
            } else {
                inputArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        // Loop through remaining elements to add to the end of the final array
        while (i < leftSize) {
            inputArray[k] = leftHalf[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            inputArray[k] = rightHalf[j];
            j++;
            k++;
        }
    }

    public static void  printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
