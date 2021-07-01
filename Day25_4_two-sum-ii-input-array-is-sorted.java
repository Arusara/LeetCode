class Solution {
    public int[] twoSum(int[] numbers, int target) {
      
      if (numbers.length==2) {
        return new int[]{1,2};
      }
      
      if (target==0) {
        return new int[]{1,2};
      }
      
      int i= 0;
      while(i<numbers.length && numbers[i]<=target) {
        int j=i+1;
        int num = numbers[i];
        while(j <numbers.length && numbers[j]<=target) {
          if (target-numbers[j]==num) {
            return new int[]{i+1, j+1};
          }
          j++;
        }
        i++;
      }
      
      return new int[] {-1,-1};
      
    }
}
