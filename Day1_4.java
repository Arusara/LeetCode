class Solution {
    public int addDigits(int num) {
      int temp =num;
      int sum =0;
      while (temp!=0) {
        
        int rem = temp%10;
        sum = sum +rem;
        temp= temp/10;
        
        if (temp==0&&sum>9) {
          temp = sum;
          sum =0;
        }
      }
      return sum;
        
    }
}
