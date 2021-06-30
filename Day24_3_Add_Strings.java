class Solution {
    public String addStrings(String num1, String num2) {
      
      int m = num1.length()-1;
      int n = num2.length()-1;
      StringBuilder result = new StringBuilder();
      int carry=0;
      while(m>=0 || n>=0) {
        int value1 = (m<0) ? 0 : num1.charAt(m)-'0';
        int value2 = (n<0) ? 0 : num2.charAt(n)-'0';
        
        int sum = value1+value2+carry;
        
        carry = sum/10;
        sum = sum%10;
        result.append(sum);
        
        m--;
        n--;
      }
      
      if (carry==1) {
        result.append(1);
      }
      
      return result.reverse().toString();
        
    }
}
