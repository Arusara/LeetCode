class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
      
      int result[] = new int[k];
      
      Map<Integer, Set<Integer>> map = new HashMap<>();
      for (int i=0;i<logs.length;i++) {
        
        int a = logs[i][0];
        int b = logs[i][1];
        
        if(map.containsKey(a)) {
          Set<Integer> set = map.get(a);
          set.add(b);
          map.put(a, set);
        } else {
          Set<Integer> set = new HashSet<>();
          set.add(b);
          map.put(a, set);
        }
      }
      
    for(Integer key : map.keySet()) { 
      Set<Integer> value = map.get(key);
      System.out.println(value.toString());
      result[value.size()-1]++;
    }
    return result;
        
    }
}
