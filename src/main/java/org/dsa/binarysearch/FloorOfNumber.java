package org.dsa.binarysearch;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7, 8, 11};
        log.info("{}",findFloor(arr, arr.length, 0));
    }
    public static int findFloor(int[] arr, int n, int target) {

        if(target < arr[0]) return -1;
        int low = 0;
        int high = n-1;

        while(low <= high) {
            int mid = (low + high)/2;

            if(arr[mid] == target) return arr[mid];
            else if (arr[mid] > target) high = mid -1;
            else low = mid +1;
        }
        return arr[high];
    }
}

