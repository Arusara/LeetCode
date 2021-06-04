class Solution {
    public int findMaxConsecutiveOnes(int[] a) {
      
      for (int i=1;i<a.length;i++) {
        if (a[i]!=0){
          a[i] += a[i-1];
        }
      }
      
      int max = Integer.MIN_VALUE;
      for(int i=0;i<a.length;i++) {
        if(a[i]>max) {
          max = a[i];
        }
      }
      return max;
    }
}
