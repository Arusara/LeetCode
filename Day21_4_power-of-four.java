class Solution {
    public boolean isPowerOfFour(int n) {
      
      if (n>=Integer.MAX_VALUE || n<=Integer.MIN_VALUE) {
        return false;
      }
      
      if (n<1) return false;
      
      while(n%4==0) {
        n=n/4;
      }
      
      return n==1;
        
    }
}
