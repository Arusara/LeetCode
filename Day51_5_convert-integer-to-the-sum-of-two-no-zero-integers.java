class Solution {
    public int[] getNoZeroIntegers(int n) {
      
      
      int start= 1;
      int end=n-1;
      
      while(true) {
        
        boolean value = String.valueOf(start).contains("0");
        boolean value1 = String.valueOf(end).contains("0");

        
        if ( !value & !value1) {
          return new int[]{start, end};
        }
        start++;
        end--;
      }
    //  return new int[]{-1,-1};
        
    }
}
