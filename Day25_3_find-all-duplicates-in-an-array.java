class Solution {
    public List<Integer> findDuplicates(int[] nums) {
      List<Integer> result = new ArrayList<>();

      for(int i=0;i<nums.length;i++) {
        int number = Math.abs(nums[i])-1;
        nums[number]=nums[number]*-1;
        if (nums[number]>0) {
          result.add(number+1);
        }
      }
      
      return result;
    }
}
