class Solution {
    public int[] sumZero(int n) {
      
      int counter = n/2;
      int i=1;
      int j=0;
      int a[]= new int[n];
      
      while(counter>0) {
        a[j] = i;
        a[j+1] = -i;
        j=j+2;
        i++;
        counter--;
      }
      return a;
        
    }
}
