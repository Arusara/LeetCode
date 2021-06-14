class Solution {
    public int oddCells(int m, int n, int[][] indices) {
      
      
      int result[][]=new int[m][n];
      
      int count=0;
      for (int i=0;i<indices.length;i++) {
        int a = indices[i][0];
        int b = indices[i][1];
        
        for (int j=0;j<n;j++) {
          result[a][j]++;
          if (result[a][j]%2==0) {
            count--;
          } else {
            count++;
          }
        }
        
        for (int j=0;j<m;j++) {
          result[j][b]++;
          
          if (result[j][b]%2==0) {
            count--;
          } else {
            count++;
          }
          
        }
        
        
      }
      
      return count;
        
    }
}
