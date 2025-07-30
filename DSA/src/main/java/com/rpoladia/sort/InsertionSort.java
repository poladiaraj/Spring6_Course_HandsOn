package com.rpoladia.sort;

import com.rpoladia.data.Data;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = Data.UNSORTED_ARRAY_PRIMENUMBERS_UPTO_50;
        int size = array.length;

        System.out.println("Unsorted Array");
        for(int num : array) {
            System.out.print(num + " ");
        }

        for(int i = 1; i < size; i++) {
            int key = array[i];
            int j = i-1;

            while(j>=0 && array[j] > key) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;

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
