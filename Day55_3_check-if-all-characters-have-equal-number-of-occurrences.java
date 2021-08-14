class Solution {
    public boolean areOccurrencesEqual(String s) {
    
      int freq[] = new int[26];  
      int max = Integer.MIN_VALUE;
      for(int i=0;i<s.length();i++) {
        freq[s.charAt(i)-'a']++;
        max = Math.max(freq[s.charAt(i)-'a'], max);
      }
            
      for(int i=0;i<26;i++) {  
        if (freq[i]>0 && freq[i]!=max) return false;
      }
      return true; 
    }
}
