package org.dsa.slidingwindow.fixedwindow;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FindMaxAverage {
    public static void main(String[] args) {
        log.info("{}",findMaxAverage(new int[]{1,12,-5,-6,50,3},4));
        log.info("{}",findMaxAverage(new int[]{5},1));

    }

    public static double findMaxAverage(int[] nums, int k) {
        double res = Integer.MIN_VALUE;
        double temp = 0;
        int i=0;
        while (i<nums.length) {
            temp+= nums[i];
            if(i+1 < k) {
                i++;
            } else {
                res = Math.max(res,temp);
                temp -= nums[i-(k-1)];
                i++;
            }
        }

        return res/k;
    }
}
