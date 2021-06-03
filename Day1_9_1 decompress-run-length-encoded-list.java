class Solution {
    public int[] decompressRLElist(int[] nums) {
      
      int sum =0;
      for (int i=0;i<nums.length;i+=2) {  
        sum = sum+nums[i];
      }
      
      int result[] = new int[sum];
      
      int counter=0;
      for (int i=0;i<nums.length;i+=2) {
        
        int a = nums[i];
        int b = nums[i+1];
        
        for(int j=1;j<=a;j++) {
          result[counter++] = b;
        }
      
      }
      return result;
        
    }
}
