class Solution {
    public int reverse(int x) {
      
      if(x < Math.pow(-2,31) || x > Math.pow(2, 31)-1)
        return 0;
     
      long reverse =0;
  
      while(x!=0) {
        long rem = x%10;
        reverse = reverse*10;
        reverse = reverse + rem;
        x = x/10;
      }
      
       if (reverse>=Integer.MAX_VALUE || reverse<=Integer.MIN_VALUE) {
          return 0;
        }
        
      return (int) reverse;
        
    }
}
