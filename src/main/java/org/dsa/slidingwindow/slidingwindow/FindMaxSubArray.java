package org.dsa.slidingwindow.slidingwindow;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FindMaxSubArray {
    public static void main(String[] args) {
        log.info("{}",findMaxSumSubArray(2,new int[]{2,3,4,1,5}));
    }

    public static int findMaxSumSubArray(int k, int[] arr) {
        int i=0;
        int j=0;
        int sum = 0;
        int res = 0;
        while(j < arr.length) {
            if(j < k) {
                sum += arr[j];
                j++;
            } else {
                log.info("sum is -> {}",sum);
                sum += arr[j] - arr[i];
                res = Math.max(sum,res);
                i++;
                j++;
            }
        }
        return res;
    }
}
