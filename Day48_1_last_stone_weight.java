class Solution {
    public int lastStoneWeight(int[] stones) {
      
      PriorityQueue<Integer> pqueue =  
             new PriorityQueue<Integer>(Collections.reverseOrder()); 
      
      for(int i=0;i<stones.length;i++) {
        pqueue.add(stones[i]);
      }
      
      while(pqueue.size()>1) {
        
        int firstMax = pqueue.poll();
        int secondMax = pqueue.poll();
        
        if(firstMax-secondMax>0) {
          pqueue.add(firstMax-secondMax);
        }
        
      }
      
      if(!pqueue.isEmpty()) return pqueue.poll();
  
      return 0;
        
    }
}
