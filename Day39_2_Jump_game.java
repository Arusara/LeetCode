class Solution {
    public boolean canJump(int[] nums) {
      
      int N = nums.length;
      
      if (nums.length==1) return true;
      
      if (nums[0]==0) return false;
      
      int reachable = 0;
      for (int i=0;i<N;i++) {
  
        if (reachable<i) {
          return false;
        }
        
       reachable = Math.max(reachable, i+nums[i]);
        
      }
      return true;
        
    }
}
