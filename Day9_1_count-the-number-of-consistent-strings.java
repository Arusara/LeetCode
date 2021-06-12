class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
      
      Set<Character> set = new HashSet<>();
      
      for(int i=0;i<allowed.length();i++) {
        set.add(allowed.charAt(i));
      }
      
      int result = words.length;
      for (String string:words) {
        
        boolean flag = true;
        for(int i=0;i<string.length();i++) {
          
          if (!set.contains(string.charAt(i))) {
            result--;
            break;
          }
        }
      
      }
      return result;
    }
}
