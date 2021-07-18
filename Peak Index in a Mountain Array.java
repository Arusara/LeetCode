class Solution {
    public int peakIndexInMountainArray(int[] a) {
      
      int N = a.length;
      
      boolean increase=false;
      boolean decrease=false;
      
      for(int i=1;i<N;i++) {
        
        if (a[i]>a[i-1]) {
          increase = true;
        } else if (increase && a[i]<a[i-1]) {
          decrease = true;
        }
        
        if (decrease && increase) {
          return i-1;
        }
        
        
        
        
      }
      return 0;
        
    }
}
