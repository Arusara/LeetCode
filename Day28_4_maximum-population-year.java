class Solution {
    public int maximumPopulation(int[][] logs) {
      
      TreeMap<Integer, Integer> map = new TreeMap<>();
      
      for (int[] log:logs) { 
        for (int i=log[0];i<log[1];i++) {
          map.put(i, map.getOrDefault(i, 0)+1);
        }
      }
      
      int year = 0;
      int value = 0;
      for(Map.Entry<Integer, Integer> m : map.entrySet())  { 
        
        if (m.getValue()>value) {
          value = m.getValue();
          year = m.getKey();
        }
                
      } 
      
      
      
      return year;
        
    }
}
