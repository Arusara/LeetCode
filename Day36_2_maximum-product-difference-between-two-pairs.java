class Solution {
    public int maxProductDifference(int[] nums) {
      
      
      int a =0;
      int b=0;
      int c=Integer.MAX_VALUE;
      int d = Integer.MAX_VALUE;
      int n = nums.length;
      
      for (int i=0;i<n;i++) {
        
        if (nums[i]>=a) {
          b = a;
          a = nums[i];
        } else if (nums[i]>b && nums[i]<a) {
          b = nums[i];
        }  
        if (nums[i]<=c) {
          d = c;
          c = nums[i];
        } else if (nums[i]<d &&nums[i]>c) {
          d = nums[i];
        }
        
      }      
      return (a*b) - (c*d);
        
    }
}
