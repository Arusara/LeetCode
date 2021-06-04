class Solution {
    public int minOperations(int[] a) {
      
      int value = 0;
      int count =0;
      for (int i=1;i<a.length;i++) {
        if (a[i]<=a[i-1]) {
          value = value + (a[i-1]+1 - a[i]);
          a[i] = a[i-1]+1;
        }
        
        
      }
      return value;
        
    }
}
