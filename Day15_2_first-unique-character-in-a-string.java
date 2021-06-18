class Solution {
    public int firstUniqChar(String s) {
      Map<Character,Integer> map = new LinkedHashMap<>();
      
      for (int i=0;i<s.length();i++) {
        char ch = s.charAt(i);
        map.put(ch, map.getOrDefault(ch, 0)+1);
      }
      
      for (Map.Entry<Character, Integer> entry :map.entrySet()) {
            // System.out.println(entry.getKey() + " => "
            //                    + ": " + entry.getValue());
        
        
        if (entry.getValue()==1) {
          return s.indexOf(entry.getKey());
        }
      }
      
      return -1;
        
    }
}
