class Solution {
    public String toGoatLatin(String sentence) {
      String[] str = sentence.split(" ");
      StringBuilder result = new StringBuilder();
      int aCount=1;
      for(int i=0;i<str.length;i++) {
        char ch = Character.toLowerCase(str[i].charAt(0));
        if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
          result.append(str[i]).append("ma");
        } else {
          result.append(str[i].substring(1)).append(str[i].charAt(0)).append("ma");
        }
        
        for(int j=0;j<aCount;j++) {
            result.append('a');
          }
        result.append(" ");
        aCount++;
      }
      
      return result.toString().trim();
      
        
    }
}
