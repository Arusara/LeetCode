class Solution {
    public String[] findRelativeRanks(int[] score) {
        
        return findRank(score);
    }
  
  
  
     public  String[] findRank(int[] num) {

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> b[0] - a[0]);

        int index=0;
        for(int val:num) {
            pq.add(new int[]{val, index});
            index++;
        }

        int a[] = new int[2];
        String[] result = new String[num.length];
        
        int medal =0;
        while(medal<3 && !pq.isEmpty()) {
        if(medal==0) {  
        a = pq.poll();
        result[a[1]] = "Gold Medal";
        } else if (medal==1) {
        a = pq.poll();
        result[a[1]] = "Silver Medal";
        } else if (medal==2) {
        a = pq.poll();
        result[a[1]] = "Bronze Medal";
        }
          medal++;
        }
       

        int counter = 3;
        while(!pq.isEmpty()) {
            a = pq.poll();
            result[a[1]] = String.valueOf(counter+1);
            counter++;
        }

        return result;

    }
}
