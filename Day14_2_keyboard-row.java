class Solution {
    public String[] findWords(String[] words) {
      
      Map<Character, Integer> map = new HashMap<>();
      map.put('a',2);
      map.put('s',2);        
      map.put('d',2);        
      map.put('f',2);        
      map.put('g',2);        
      map.put('h',2);        
      map.put('j',2);        
      map.put('k',2);        
      map.put('l',2); 
      
      
      map.put('q',1);
      map.put('w',1);
      map.put('e',1);
      map.put('r',1);
      map.put('t',1);
      map.put('t',1);
      map.put('y',1);
      map.put('u',1);
      map.put('i',1);
      map.put('o',1);
      map.put('p',1);

      
      map.put('z',3);
      map.put('x',3);
      map.put('c',3);
      map.put('v',3);
      map.put('b',3);
      map.put('n',3);
      map.put('m',3);
      

      List<String> result = new ArrayList<>();
      
      for(String s: words) {
        
        boolean flag = true;
        for (int i=0;i<s.length()-1;i++) {
                    
          char ch1 = Character.toLowerCase(s.charAt(i));  
          char ch2 = Character.toLowerCase(s.charAt(i+1));  

          if ( map.get(ch1)!=map.get(ch2)) {
            flag = false;
            break;
          }
        }
        
        if (flag) {
          result.add(s);
        }
      
      }
      
      String[] str = new String[result.size()];
      int i=0;
      for (String s:result) {
        str[i++]=s;
      }
      
      return str;
      

    }
}
