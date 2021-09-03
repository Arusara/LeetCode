//package DaysChallenge;

//import java.util.Arrays;

class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {

        Arrays.sort(arr2);
        int count =0;
        for (int i=0;i<arr1.length;i++) {
            if (!binary_search(arr2, arr1[i], d)) count++;
        }
        return count;

    }

    public boolean binary_search(int arr[], int key, int d) {

        int left = 0;
        int right = arr.length-1;

        while (left<=right) {
            int mid = left + (right -left)/2;
            int result = Math.abs(key - arr[mid]);
            if (result <=d) return true;
            
            if (key > arr[mid])
                left = mid + 1;
            else
                right = mid - 1;
        }

        return false;
    }
}
