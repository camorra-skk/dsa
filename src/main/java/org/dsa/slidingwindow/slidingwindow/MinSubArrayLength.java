package org.dsa.slidingwindow.slidingwindow;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MinSubArrayLength {
    public static void main(String[] args) {
        log.info("{}",minSubArrayLen(7,new int[]{2,3,1,2,4,3}));
        log.info("{}",minSubArrayLen(4,new int[]{1,4,4}));
        log.info("{}",minSubArrayLen(11,new int[]{1,1,1,1,1,1,1,1}));
        log.info("{}",minSubArrayLen(11,new int[]{1,2,3,4,5}));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int res = Integer.MAX_VALUE;

        int temp = 0;
        int i=0;
        int j = 0;
        while (j<nums.length) {
            temp+= nums[j];
            if(temp < target) {
                j++;
            } else {
                res = Math.min(res,j-i+1);
                int k = i;
                while(k <= j && temp >= target) {
                    res = Math.min(res,j-k+1);
                    temp -= nums[k];
                    k++;
                }
                i = k;
                j++;
            }
        }

        return res == Integer.MAX_VALUE ? 0 : res;
    }
}
