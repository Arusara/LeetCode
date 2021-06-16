class Solution {
    public int maxProduct(int[] nums) {
      int firstMax=-1;
      int secondMax = -1;
      for(int i=0;i<nums.length;i++) {
        if (nums[i]>firstMax) {
          
          if (nums[i]>secondMax) {
            secondMax = firstMax;
          }
          firstMax = nums[i];
          
          
        } else if (nums[i]<=firstMax && nums[i]>secondMax) {
          secondMax = nums[i];
        }
      } 

      return (firstMax -1)*(secondMax-1); 
    }
}
