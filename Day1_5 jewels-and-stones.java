class Solution {
    public int numJewelsInStones(String jewels, String stones) {
      Map<Character, Integer> map = new HashMap<>();
      
      
      for (int i=0;i<stones.length();i++) {
        char ch = stones.charAt(i);
        map.put(ch, map.getOrDefault(ch, 0)+1);
      }
      
      int count = 0;
      
      for (int i=0;i<jewels.length();i++) {
        
        char ch1 = jewels.charAt(i);
        
        
        if (map.containsKey(ch1)) {
          count+= map.get(ch1);
        }
        
      }
      
      return count;
      
      
      
      
        
    }
}
