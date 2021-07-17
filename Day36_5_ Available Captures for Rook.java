class Solution {
    public int numRookCaptures(char[][] board) {
      
      int i=0;
      int j=0;
      
      int a=0;
      int b=0;
      
      boolean flag = false;
      
      for(i=0;i<board.length;i++) {
        for(j=0;j<board[i].length;j++) {
          
          if (board[i][j]=='R') {
            a=i;
            b=j;
            flag = true;
            break;
          }  
        }
        if (flag) {
          break;
        }
      }
      
      int count=0;
      
      
      //down.
      int down = a;
      while(down>=0) {
        if(board[down][b]=='B') break;
        if(board[down][b]=='p') {
          count++;
          break;
        }
        down--;
      }
      
      // up.
      int up = a;
      while(up<board.length) {
        if(board[up][b]=='B') break;
        if(board[up][b]=='p') {
          count++;
          break;
        }
        up++;
      }
      
      //left.
      int left=b;
      while(left>=0) {
        if(board[a][left]=='B') break;
        if(board[a][left]=='p') { 
          count++;
          break;
        }
        left--;
      }
      
      //right.
      int right=b;
      while(right<board[a].length) {
        if(board[a][right]=='B') break;
        if(board[a][right]=='p') {
          count++;
          break;
        }
        right++;
      }
      return count;  
    }
}
