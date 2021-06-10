class Solution {
    public String destCity(List<List<String>> paths) {
      
      Map<String, String> map = new HashMap<>();
      
      for(List<String> path : paths) {
        
        System.out.println(path.get(0));
        System.out.println(path.get(1));

        map.put(path.get(0), path.get(1));    
      }
      
      String firstValue = paths.get(0).get(0);
      
      int counter =0;
      
      while(counter<map.size()) {
        
        if (!map.containsKey(firstValue)) {
          return firstValue;
        } else {
          firstValue = map.get(firstValue);
        }
        counter++;
      }
      return firstValue;
    }
}
