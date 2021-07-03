class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
      Map<Integer, Integer> map = new HashMap<>();
      List<Integer> result = new ArrayList<>();
      for (int i=0;i<nums1.length;i++)  {
        map.put(nums1[i], map.getOrDefault(nums1[i], 0)+1);
      }
      for (int i=0;i<nums2.length;i++) {
        if (map.containsKey(nums2[i]) && map.get(nums2[i])>=1) {
           result.add(nums2[i]);
          map.put(nums2[i], map.get(nums2[i])-1);
        }
        
      }
      
      int[] resultArray = new int[result.size()];
      int i=0;
      for (int value:result) {
        resultArray[i++] = value;
      }
      return resultArray;
    }
}
