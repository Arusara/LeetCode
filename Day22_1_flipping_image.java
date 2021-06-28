class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
      
      
      for (int i=0;i<image.length;i++) {
        
        int m=0;
        int n=image.length-1;
        
        while(m<n) {
          int temp = image[i][m];
          image[i][m] = image[i][n];
          image[i][n] = temp;
          m++;
          n--;
        }
        
        for (int j=0;j<image[i].length;j++) {
          
          if (image[i][j]==1) {
            image[i][j]=0;
          } else {
            image[i][j]=1;
          }
          
          
        }
        
        
        
      }
      return image;
        
    }
}
