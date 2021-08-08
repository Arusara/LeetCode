class Solution {
    public int arrayPairSum(int[] nums) {
      Arrays.sort(nums);
      int N = nums.length;
      
      int sum =0;
      for(int i=0;i<N;i++) {
        sum = sum + Math.min(nums[i], nums[i+1]);
        i++;
      }
      
      return sum;
        
    }
}
