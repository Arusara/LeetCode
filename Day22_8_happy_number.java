class Solution {
    public boolean isHappy(int n) {
      Set<Integer> set = new HashSet<>();
      
      while (n!=1) {
        
        int current =n;
        int sum = 0;
        while(current!=0) {
          sum += (current%10)*(current%10);
          current/=10;
        }
        
        n=sum;
        
        if (set.contains(n)) return false;
        
        set.add(n);
        
      }
      
      return true;
        
    }
}
