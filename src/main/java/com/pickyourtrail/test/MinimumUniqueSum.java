package com.pickyourtrail.test;

import java.util.Arrays;

public class MinimumUniqueSum {

    public int findMinUniqueSum(int arr[]) {
        makeUniqueSumArray(arr);
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        return sum;
    }

    private void makeUniqueSumArray(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            while (i + 1 < arr.length && arr[i] >= arr[i + 1]) {
                arr[i + 1] = arr[i] + 1;
                i++;
            }
        }
    }
}
