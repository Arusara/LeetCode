class Solution {
    public int findPeakElement(int[] nums) {
      
      if (nums==null || nums.length==0) return -1;
      
      if (nums.length==1) return 0;
      
      for (int i= nums.length-1;i>0;i--) {
        if (nums[i] >nums[i-1]) return i;
      }
      return 0;
        
    }
}
