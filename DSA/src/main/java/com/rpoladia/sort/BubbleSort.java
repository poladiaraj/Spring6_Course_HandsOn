package com.rpoladia.sort;

import com.rpoladia.data.Data;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = Data.UNSORTED_ARRAY_PRIMENUMBERS_UPTO_50;
        int size = array.length;

        System.out.println("Unsorted Array");
        for(int num : array) {
            System.out.print(num + " ");
        }

        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size - i - 1; j++) {
                if(array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }

            System.out.println();
            for(int num : array) {
                System.out.print(num + " ");
            }
        }

        System.out.println();
        System.out.println("Sorted Array");
        for(int num : array) {
            System.out.print(num + " ");
        }
    }
}