package com.rpoladia.search;

import com.rpoladia.data.Data;

public class LinearSearch {
    public static void main(String[] args) {

        int[] array = Data.SORTED_ARRAY_PRIMENUMBERS_UPTO_50;

        int target = 41;
        int result = linearSearch(array, target);

        if(result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found");
    }

    public static int linearSearch(int[] array, int target) {
        int steps = 0;
        for(int i = 0; i < array.length; i++) {
            steps++;
            if(array[i] == target) {
                System.out.println("Steps taken: " + steps);
                return i;
            }
        }

        System.out.println("Steps taken: " + steps);
        return -1;
    }
}
