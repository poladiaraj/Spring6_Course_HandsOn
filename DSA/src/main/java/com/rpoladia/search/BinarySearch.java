package com.rpoladia.search;

import com.rpoladia.data.Data;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = Data.SORTED_ARRAY_PRIMENUMBERS_UPTO_50;

        int target = 41;
        int result = binarySearch(array, target);

        if(result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found");

        result = binarySearchRecursive(array, target, 0, array.length - 1);

        if(result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found");
    }

    public static int binarySearch(int[] array, int target) {
        int left=0;
        int right=array.length-1;

        int steps = 0;
        while(left<=right){
            steps++;
            int mid = (left+right)/2;
            if(array[mid]==target){
                System.out.println("Steps taken: " + steps);
                return mid;
            } else if(array[mid]>target){
                right=mid-1;
            } else {
                left=mid+1;
            }
        }
        System.out.println("Steps taken: " + steps);
        return -1;
    }

    public static int binarySearchRecursive(int[] array, int target, int left, int right) {
        if(left <= right){
            int mid = (left+right)/2;
            if(array[mid]==target){
                return mid;
            } else if(array[mid]>target){
                return binarySearchRecursive(array, target, left, mid-1);
            } else {
                return binarySearchRecursive(array, target, mid+1, right);
            }
        }

        return -1;
    }
}
