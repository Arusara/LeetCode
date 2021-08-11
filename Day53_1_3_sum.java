class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      List<List<Integer>> result = new ArrayList<>();
      Arrays.sort(nums); 
      
      int N = nums.length;
      for(int i=0;i<N-2;i++) {
        
        if (i==0 || nums[i]!=nums[i-1]) {
        
        
        int j = i+1;
        int k = N-1;
        
        while(j<k) {
          if (nums[i]+nums[j]+nums[k]==0) {
            List<Integer> list = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k]));
            result.add(list);
            
          while(j<N-1 && nums[j]==nums[j+1]) j++;
          while(k>0 && nums[k]==nums[k-1]) k--; 
            j++;
            k--;
          } else if (nums[i]+nums[j]+nums[k]>0) k--;
          else j++;            
        }
          
        }
        
        
      }
      return result;
}
}
  
