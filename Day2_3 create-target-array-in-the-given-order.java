class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
      
      int result[] = new int[nums.length];
      
      List<Integer> list = new ArrayList<>();
      for (int i=0;i<nums.length;i++) {
        int a = nums[i];
        int b = index[i];
        
        list.add(b,a); 
      }
      
      int j=0;
      for(Integer value:list) {
        result[j++] = value;
        
      }
      return result;
    }
}
