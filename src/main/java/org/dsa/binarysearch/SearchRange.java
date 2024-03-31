package org.dsa.binarysearch;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SearchRange {
    public static void main(String[] args) {
        log.info("{}",searchRanges(new int[] {1},2));
    }

    public static int[] searchRanges(int[] nums, int target) {
        int[] res = new int[2];

        res[0] = firstOccurence(nums,nums.length,target);
        if(res[0] == -1) {
            res[1] = -1;
            return res;
        }
        res[1] = lastOccurence(nums,nums.length,target);
        return res;
    }

    private static int lastOccurence(int[] nums, int n, int target) {
        int low = 0;
        int high = n - 1;
        int startIndex = Integer.MIN_VALUE;
        while (low <= high) {

            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                startIndex = Math.max(mid, startIndex);
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return startIndex == Integer.MIN_VALUE ? -1 : startIndex;
    }

    public static int firstOccurence(int[] nums, int n, int target) {
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
