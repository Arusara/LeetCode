class Solution {
    public int[] twoSum(int[] nums, int target) {
      Map<Integer, Integer> map = new HashMap<>();
      
      Map<Integer, Integer> map1 = new HashMap<>();
      
      for (int i=0;i<nums.length;i++) {
        if (map.containsKey(nums[i])){
          map1.put(nums[i], i);
        } else {
          map.put(nums[i], i);
        }
      }
      
      System.out.println(map.toString());
            System.out.println(map1.toString());

      
      for (int i=0;i<nums.length;i++) {
        
        int num = target - nums[i];
        
        if (num!=nums[i]&&map.containsKey(num)) {
          return new int[]{map.get(num), i};
        } else if(map1.containsKey(num)) {
            return new int[]{map1.get(num), i};
          }
        
      }
      return new int[]{0};
        
        
    }
}
