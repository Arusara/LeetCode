class Solution {
    public int countGoodSubstrings(String s) {
      
   if (s.length()==0) {
     return 0;
   }
      int count = 0;
      for (int i=0;i<s.length()-2;i++) {
        StringBuilder str = new StringBuilder(s.substring(i, i+3));
        
        boolean result = uniqueCharacters(str.toString());
        if (result) {
          count++;
        }
        
      }
      return count;
        
    }
  
  public static boolean uniqueCharacters(String str)
    {
  
        for (int i = 0; i < str.length(); i++)
            for (int j = i + 1; j < str.length(); j++)
                if (str.charAt(i) == str.charAt(j))
                    return false;
 
    
        return true;
    }
}
