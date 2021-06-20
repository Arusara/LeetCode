class Solution {
    public int[] sortArrayByParity(int[] a) {
      
      int i=0;
      int j=a.length-1;
      int temp;
      while(i<j) {
        
        
        if(a[i]%2==1 && a[j]%2==1) {
          j--;
        } else if(a[i]%2==1 && a[j]%2==0) {
          temp = a[j];
          a[j] = a[i];
          a[i] = temp;
          i++;
          j--;
        } else if (a[i]%2==0 &&a[j]%2==1) {
          i++;
        } else {
          i++;
          //j--;
        }
      
      }
      return a;
        
    }
}
