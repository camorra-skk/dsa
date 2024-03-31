package org.dsa.binarysearch;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CeilOfNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7, 8, 11};
        log.info("{}",findCeil(arr, arr.length, 9));
    }

    private static int findCeil(int[] arr, int n, int target) {

        if(target > arr[arr.length-1]) return -1;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                return arr[mid];
            }
            else if (arr[mid] < target) {
                low = mid + 1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            }
        }
        return arr[low];
    }
}
