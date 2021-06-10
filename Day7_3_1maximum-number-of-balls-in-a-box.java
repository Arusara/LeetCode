class Solution {
    public int countBalls(int lowLimit, int highLimit) {
      
      int noOfDigit = (int)Math.floor(Math.log10(highLimit)+1);
      
      int result[] = new int[46];
    
      
        int ans=0;
        int prev=0;
        int newAns = 0;
      for (int i=lowLimit;i<=highLimit;i++) {
        
        
          if (i%10==0) {
             ans = findSum(i);
            prev = i;
            newAns = ans;
            
          } else {
            
            if (i==lowLimit) {
            ans = findSum(i);
            prev = i;
            newAns = ans;
            } else {
              newAns= ans + (i-prev);
            }
          }
        
          System.out.println(newAns);
          result[newAns] = result[newAns] + 1;  
      }
      
      int max = Integer.MIN_VALUE;
      for (int i=0;i<result.length;i++) {
        
        
        if (result[i]>max) {
          max = result[i];
        }
      }
      
      return max;
    }
  
  
  public static int findSum(int num) {
    
    int sum = 0;
    while(num!=0){
      int rem = num%10;
      num = num/10;
      sum = sum+rem;
    }
    return sum;
  }
}
