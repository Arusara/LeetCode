class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
      List<Integer> result = new ArrayList<>();
      for(int i=left;i<=right;i++) {
        
        if (selfDivide(i)) {
          result.add(i);
        }
      }
      return result;
        
    }
  
  
  
    public static boolean selfDivide(int num) {
      
      int temp = num;
      int rem;
      
      if(num%10==0) {
        return false;
      }
      
      while(temp!=0) {
        rem = temp%10;
        
        if (rem==0 || num%rem!=0) {
          return false;
        }
        temp/=10;
      }
      return true;
    
    }
}
