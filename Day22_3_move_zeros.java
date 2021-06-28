class Solution {
    public void moveZeroes(int[] a) {
      
      int index=0;
      for (int i=0;i<a.length;i++) {
        if (a[i]!=0) {
          a[index++] = a[i];
        }
      }
      
      for (int i=index;i<a.length;i++) {
        a[i]=0;
      }
     
      
    }
}
