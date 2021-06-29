class Solution {
    public String addBinary(String a, String b) {
      
      int m = a.length()-1;
      int n = b.length()-1;
      
      StringBuilder result = new StringBuilder();
      int carry = 0;
      while(m >=0 && n>=0) {
        char ch1 = a.charAt(m);
        char ch2 = b.charAt(n);
        if (ch1=='0'&&ch2=='0') {
         if (carry==1) {
            result.append("1");
            carry=0;
          } else {
            result.append("0");
          }
        }
        else if (ch1=='1'&&ch2=='1') {
          if (carry==1) {
            result.append("1");
          } else {
            result.append("0");
            carry=1;
          }
          
        } else {
          if (carry==1) {
            result.append("0");
          } else {
            result.append("1");
            carry=0;
          }
        }
        m--;
        n--;
    
      }
      
      while(m!=-1) {
        
        char ch=a.charAt(m);
        if (ch=='1' && carry==1) {
          result.append("0");
        } else {
          if (carry==1) {
            result.append("1");
            carry=0;
          } else {
            result.append(ch);
            carry=0;
          }
        }
        m--;
        
      }
      
       while(n!=-1) {
        
        char ch = b.charAt(n);
        if (ch=='1' && carry==1) {
          result.append("0");
        } else {
          if (carry==1) {
            result.append("1");
            carry=0;
          } else {
            result.append(ch);
            carry=0;
          }
        }
        n--;
        
      }
      
      if (carry==1) result.append("1");
      
      return result.reverse().toString();
        
    }
}
