class Solution {
    public boolean uniqueOccurrences(int[] arr) {
      
      Map<Integer, Integer> map = new HashMap<>();
      
      
      for (int i=0;i<arr.length;i++) {
        map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
      }
      
      Set<Integer> set = new HashSet<>();
      
      for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        //System.out.println(entry.getKey() + ":" + entry.getValue());
        
        if(set.contains(entry.getValue())){
          return false;
        }
        set.add(entry.getValue());
    }
      return true;
        
    }
}
