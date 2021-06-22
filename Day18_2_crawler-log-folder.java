class Solution {
    public int minOperations(String[] logs) {
      
      int main = 0;
      
      for (String str:logs) {
        
        
        if (str.equals("../")) {
          if (main>0) {
            main--;
          }
        } else if(str.equals("./")) {
          continue;
        } else  {
          main++;
        }
      
      }
      return main;
        
    }
}
