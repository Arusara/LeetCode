class Solution {
    public int diagonalSum(int[][] mat) {
      
    int sum = 0;
      
      int counter =0;
      int size = mat.length;
      int i=0;
      while(counter<size) {
        sum+= mat[i][i];
        i++;
        counter++;
      }
      i=0;
      int j=size-1;
      counter=0;
      while(counter<size) {
        
        if (i!=j) {
        sum+= mat[i][j];
        
      }
        i++;
          j--;
        counter++;
      }
      
      return sum;   
    }
}
