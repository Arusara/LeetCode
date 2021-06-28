class Solution {
    public String longestCommonPrefix(String[] strs) {
      
      if (strs==null || strs.length==0) return "";
      
      if (strs.length==1) return strs[0];
      
      int result=0;
        boolean check = false;
      
      for (int i=0;i<strs[0].length();i++) {
        char ch = strs[0].charAt(i);
        int j=1;
        while(j<strs.length) {
          if (strs[j].length()>i){
            if (ch!=strs[j].charAt(i)) {
              return strs[0].substring(0, i);
            } else {
              check = true;
            }
          } else {
            return strs[0].substring(0,i);
          }
          j++;
        }
      }
      
      
      return check ? strs[0]:"";
        
    }
}
