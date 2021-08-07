class KthLargest {
  
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

    int k;

    public KthLargest(int k, int[] nums) {
      
      this.k =k;
      
      for(int i=0;i<nums.length;i++) fillQueue(nums[i]);
      
      
      
      
    }
    
    public int add(int val) {
       fillQueue(val);
      return pq.peek();
       
    }
  
    public void fillQueue(int num) {
      
      if (this.pq.size()<this.k) pq.add(num);
      else {
        
        if (num>pq.peek()) {
          
          pq.poll();
          pq.add(num);
        }
        
        
      }
      
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
