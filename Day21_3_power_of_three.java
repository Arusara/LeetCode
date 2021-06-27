class Solution {
    public boolean isPowerOfThree(int n) {
      
      if (n>=Integer.MAX_VALUE || n<=Integer.MIN_VALUE) {
        return false;
      }
      
      
      int num = 1;    
      int index = 0;
      while(num <= n) {
        num = (int) Math.pow(3, index);
        if (num==n) return true;
        index++;
      }
      return false;
  
    }
}
