package org.dsa.binarysearch;

public class CeilOfNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7, 8, 11};
        System.out.println(findCeil(arr, arr.length, 11));
    }

    private static int findCeil(int[] arr, int n, int target) {

        if (arr[0] >= target) return arr[0];
        if (target > arr[n - 1]) return -1;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                return arr[mid];
            } else if (mid > 0 && arr[mid] > target && arr[mid - 1] < target) {
                return arr[mid];
            }
            else if (arr[mid] < target) {
                low = mid + 1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            }
        }
        return -1;
    }
}
