class Solution {
    public List<Integer> minSubsequence(int[] nums) {
      PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
      int sum=0;
      for(int val:nums) {
        sum+=val;
        pq.add(val);
      }
      
      List<Integer> result = new ArrayList<>();
      
      int max=0;
      while(!pq.isEmpty()) {
        if (max>sum)
          return result;    
        int value = pq.poll();
        result.add(value);
        max+=value;
        sum-=value;
    
      }
      
      return result;
      
        
    }
}
