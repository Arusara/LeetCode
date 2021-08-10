class Solution {
    public int getLucky(String s, int k) {
      
      
      int number=0;
      for(int i=0;i<s.length();i++) {
        
        int a = s.charAt(i)-'a'+1;
        number+= addNumber(a);
        
      }
      System.out.println(number);
      
      
      for(int i=1;i<k;i++) {
        
        number = addNumber(number);
      
      }
      
      return number;
        
    }
  
  
    public int addNumber(int n) {
      int sum=0;
      while(n!=0) {
        sum+=n%10;
        n=n/10;
      }
      return sum;
    }
}
