class Solution {
    public int sumOfUnique(int[] nums) {
      
      Map<Integer, Integer> map = new HashMap<>();
      
      int n = nums.length;
      int sum=0;
      for(int i=0;i<n;i++) { 
        map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
      }
      
      
      
      for (int num: map.keySet()) {  
        int num1=map.get(num);
        if(num1<2) {
          sum+=num;
        }
      } 
  
      return sum;
        
    }
}
