class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
      
      Map<Character, Integer> map = new HashMap<>();
      for (int i=0;i<magazine.length();i++) {
        char ch = magazine.charAt(i);
        map.put(ch, map.getOrDefault(ch, 0)+1);
      }
      
      for(int i=0;i<ransomNote.length();i++) {
        
        char ch = ransomNote.charAt(i);
        if (!map.containsKey(ch) || map.containsKey(ch) && map.get(ch)<=0 ){
          return false;
        }
        map.put(ch, map.getOrDefault(ch, 0)-1);
      }
      
      return true;
    
        
    }
}
