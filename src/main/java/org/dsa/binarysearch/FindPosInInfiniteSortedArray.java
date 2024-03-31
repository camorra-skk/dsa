package org.dsa.binarysearch;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FindPosInInfiniteSortedArray {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int ans = findPos(arr, 190);

        if (ans == -1)
            log.info("Element not found");
        else
            log.info("Element found at index " + ans);
    }

    private static int findPos(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (end <= arr.length && arr[end] < target) {
            start = end + 1;
            end = 2 * end;
        }
        if(end > arr.length) {
            end = arr.length -1;
        }
        return binarySearch(arr, start, end, target);
    }

    private static int binarySearch(int[] arr, int low, int high, int target) {
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) return mid;
            else if (arr[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }


}
