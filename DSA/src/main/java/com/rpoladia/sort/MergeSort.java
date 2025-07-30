package com.rpoladia.sort;

import com.rpoladia.data.Data;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = Data.UNSORTED_ARRAY_PRIMENUMBERS_UPTO_50;

        System.out.println("Unsorted Array");
        for(int num : array) {
            System.out.print(num + " ");
        }

        mergeSort(array, 0, array.length-1);

        System.out.println();
        System.out.println("Sorted Array");
        for(int num : array) {
            System.out.print(num + " ");
        }
    }

    private static void mergeSort(int[] array, int l, int r) {
        if(l < r) {
            int mid = (l+r)/2;
            mergeSort(array, l, mid);
            mergeSort(array, mid+1, r);

            merge(array, l, mid, r);
        }
    }

    private static void merge(int[] array, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int[] lArr = new int[n1];
        int[] rArr = new int[n2];

        for(int x=0; x<n1; x++) {
            lArr[x] = array[l+x];
        }

        for(int x=0; x<n2; x++) {
            rArr[x] = array[mid+1+x];
        }

        int i=0;
        int j=0;
        int k=l;

        while(i<n1 && j<n2) {
            if(lArr[i]<=rArr[j]) {
                array[k] = lArr[i];
                i++;
            } else {
                array[k] = rArr[j];
                j++;
            }
            k++;
        }

        while(i<n1) {
            array[k] = lArr[i];
            i++;
            k++;
        }

        while(j<n2) {
            array[k] = rArr[j];
            j++;
            k++;
        }
    }
}
