class Solution {
    public boolean isPowerOfTwo(int n) {
      
      if (n>=Integer.MAX_VALUE || n<=Integer.MIN_VALUE) {
        return false;
      }
      
      int num = 1;
      int pow = 0;
      while (num<=n) {
        num = (int) Math.pow(2, pow);
        if (num==n) 
          return true;
        pow++;
      }
      
      return false;
        
    }
}
