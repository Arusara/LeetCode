class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
      
      String split[] = text.split(" ");
      
      int count=0;
      
      Set<Character> set = new HashSet<>();
      
      for(int i=0;i<brokenLetters.length();i++) {
        set.add(brokenLetters.charAt(i));
      }
      
      for (String str : split) {
        boolean flag = false;
        for(int i=0;i<str.length();i++) {
          if (set.contains(str.charAt(i))) {
            flag = true;
            break;
          }
        }
        
        if (flag==false) count++;
        
      }
      return count;
      
          
    }
}
