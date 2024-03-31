package org.dsa.binarysearch;

import lombok.extern.slf4j.Slf4j;


@Slf4j
public class FirstOccurence {
    public static void main(String[] args) {
        log.info("{}", firstOccurences(new int[]{1, 1, 1, 1, 1, 1, 2}, 7, 3));
    }

    public static int firstOccurences(int[] nums, int n, int target) {
        int low = 0;
        int high = n - 1;
        int startIndex = Integer.MAX_VALUE;
        while (low <= high) {

            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                startIndex = Math.min(mid, startIndex);
                high = mid - 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return startIndex == Integer.MAX_VALUE ? -1 : startIndex;
    }
}
