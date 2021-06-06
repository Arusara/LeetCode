public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
      
      System.out.println(n);
      
      String s = Integer.toBinaryString(n);
      int count = 0;
      for (int i=0;i<s.length();i++) {
        char ch = s.charAt(i);
        if (ch=='1') {
          count++;
        }
      }
      return count;
        
    }
}
