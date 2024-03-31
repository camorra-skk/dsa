package org.dsa.binarysearch;

import lombok.extern.slf4j.Slf4j;

// https://leetcode.com/problems/find-smallest-letter-greater-than-target/
@Slf4j
public class NextGreatestLetter {

    public static void main(String[] args) {
        log.info("{}",nextGreatestLetter(new char[]{'c', 'f', 'j'},'a'));
        log.info("{}",nextGreatestLetter(new char[]{'c', 'f', 'j'},'c'));
        log.info("{}",nextGreatestLetter(new char[]{'x', 'x', 'y','y'},'z'));
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        return ceil(letters, letters.length, target);
    }

    public static char ceil(char[] letters, int n, char target) {

        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (letters[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        return letters[low % n];
    }
}
