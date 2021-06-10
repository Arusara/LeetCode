class Solution {
    public int countBalls(int lowLimit, int highLimit) {
      
      int noOfDigit = (int)Math.floor(Math.log10(highLimit)+1);
      System.out.println(noOfDigit);
      
      int result[] = new int[noOfDigit*9+1];
    
      
      for (int i=lowLimit;i<=highLimit;i++) {
          int index = findSum(i);
        System.out.println(index);
          result[index] = result[index] + 1;  
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
