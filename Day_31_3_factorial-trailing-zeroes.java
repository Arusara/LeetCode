class Solution {
    public int trailingZeroes(int n) {
      
      int result=0;
      for (int i=5;i<=n;i=i*5) {
      
        int num = n/i;
        
        result+=num;
        
      }
      return result;
        
    }
}
