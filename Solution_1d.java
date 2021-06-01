class Solution {
    public int[] runningSum(int[] nums) {
        
        int n = nums.length;
        int[] prevSum = new int[n];
        prevSum[0] = nums[0];
        for (int i=1;i<n;i++) {
           prevSum[i] = nums[i]+prevSum[i-1];
        }
        return prevSum;
        
    }
}
