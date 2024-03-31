package org.dsa.binarysearch;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FindPeakInMountain {
    public static void main(String[] args) {
        log.info("{}", peakIndexInMountainArray(new int[]{1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1}));
        log.info("{}", peakIndexInMountainArray(new int[]{0,1,0}));
        log.info("{}", peakIndexInMountainArray(new int[]{0,2,1,0}));
        log.info("{}", peakIndexInMountainArray(new int[]{0,10,5,2}));
        log.info("{}", peakIndexInMountainArray(new int[]{24,69,100,99,79,78,67,36,26,19}));
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = (start + end) / 2;

            if (arr[mid] > arr[mid + 1]) end = mid;
            else start = mid + 1;
        }
        return start;
    }
}
