class Solution {
    public String shiftingLetters(String s, int[] shifts) {
      
      int n = shifts.length;
      shifts[n-1] = shifts[n-1]%26;
      for (int i=n-2;i>=0;i--) {
        shifts[i] = (shifts[i] +shifts[i+1])%26;
      }
      
      StringBuilder result = new StringBuilder();
      for (int i=0;i<n;i++) {
        System.out.println(shifts[i]);
        
        int ch = s.charAt(i)-'a';
        ch =(ch+shifts[i])%26;
        char ch1 =(char) ('a'+ch);
        result.append(ch1);
      }
      return result.toString();
      
      
        
    }
}
