class Solution {
    public int numUniqueEmails(String[] emails) {
      
      Set<String> set = new HashSet<>();
      for (String email: emails) {
        
        StringBuilder str = new StringBuilder();
        boolean firstSkip=false;
        for (int i=0;i<email.length();i++) {
          
          if (email.charAt(i)=='.' ) {
            continue;
          } else if (email.charAt(i)=='+') {  
            while(email.charAt(i)!='@') {
              i++;
            }
            str.append(email.substring(i));
            break;
          } else if (email.charAt(i) =='@') {
             str.append(email.substring(i));
             break;
          } else {
            str.append(email.charAt(i));
          }
          
          
        }
        System.out.println(str.toString());
        set.add(str.toString());
      
      }
      return set.size();
        
    }
}
