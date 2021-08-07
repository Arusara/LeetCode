class Solution {
    public int minSetSize(int[] num) {
      
       Map<Integer, Integer> map = new TreeMap<>();

        for(int i=0;i<num.length;i++) {
            map.put(num[i], map.getOrDefault(num[i],0)+1);
        }


        PriorityQueue<Integer> pq = new PriorityQueue<>( (a,b)->b-a);
        map.forEach((k,v)->{
            pq.add(v);
        });

        int count=0;
        int index=0;
        while(!pq.isEmpty()) {
            count+=pq.poll();

            if (count >= num.length/2) {
                return index+1;
               // break;
            }
            index++;
        }
      
      return 1;
      
      
      
        
    }
}
