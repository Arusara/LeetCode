class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
      
      int N = nums.length;
      
      List<List<Integer>> result = new ArrayList<>();
      
      Set<List<Integer>> set = new HashSet<>();
      
      Arrays.sort(nums);
      for(int i=0;i<N-3;i++) {
        
        for(int j=i+1;j<N-2;j++) {    
          int x = j+1;
          int y = N-1;
        
          while(x<y) {
            if (nums[i]+nums[j]+nums[x]+nums[y]==target) {
              List<Integer> list = new ArrayList<>();
              list.add(nums[i]);
              list.add(nums[j]);
              list.add(nums[x]);
              list.add(nums[y]);
              set.add(list);
              x++;
              y--;
            } else if (nums[i]+nums[j]+nums[x]+nums[y]>target) y--;
            else x++;
          }
        }
        
        
      }
      
      return new ArrayList<>(set);
        
    }
}
