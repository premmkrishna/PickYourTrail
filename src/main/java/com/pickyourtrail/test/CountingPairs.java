package com.pickyourtrail.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountingPairs {
    public int findPairs(int arr[], int k) {
        int count = 0;
        Arrays.sort(arr);
        int l = 0;
        int r = 0;
        Set<Integer> set = new HashSet<>();
        while (r < arr.length) {

            if (l != r && arr[r] - arr[l] == k) {
                if (!set.contains(arr[r])) {
                    count++;
                    set.add(arr[r]);
                }
                l++;
                r++;
            } else if (arr[r] - arr[l] > k)
                l++;
            else {
                r++;
            }
        }
        return count;

    }
}
