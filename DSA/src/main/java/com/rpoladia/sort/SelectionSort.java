package com.rpoladia.sort;

import com.rpoladia.data.Data;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = Data.UNSORTED_ARRAY_PRIMENUMBERS_UPTO_50;
        int size = array.length;
        int minIndex = 0;

        System.out.println("Unsorted Array");
        for(int num : array) {
            System.out.print(num + " ");
        }

        for(int i = 0; i < array.length-1; i++) {
            for(int j = i; j < size; j++) {
                if(array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }

            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;

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
