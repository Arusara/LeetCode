class Solution {
    public boolean judgeCircle(String moves) {
      
      int x=0,y=0;
      int n = moves.length();
      
      for (int i=0;i<n;i++) {
        

        if (moves.charAt(i)=='L') {
          x--;
          
        } else if (moves.charAt(i)=='R') {
          x++;
          
        } else if (moves.charAt(i)=='U') {
          y++;
          
        } else if (moves.charAt(i)=='D') {
          y--;
        }
        
        
      }
      return (x==0 && y==0);       
    }
}
