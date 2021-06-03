class Solution {
    public int uniqueMorseRepresentations(String[] words) {
      
      Set<String> result = new HashSet<>();
      
      
      Map<Character,String> map = new HashMap<>();
      map.put('a',".-");
      map.put('b',"-...");
      map.put('c',"-.-.");
      map.put('d',"-..");
      map.put('e',".");
      map.put('f',"..-.");
      map.put('g',"--.");
      map.put('h',"....");
      map.put('i',"..");
      map.put('j',".---");
      map.put('k',"-.-");
      map.put('l',".-..");
      map.put('m',"--");
      map.put('n',"-.");
      map.put('o',"---");
      map.put('p',".--.");
      map.put('q',"--.-");
      map.put('r',".-.");
      map.put('s',"...");
      map.put('t',"-");
      map.put('u',"..-");
      map.put('v',"...-");
      map.put('w',".--");
      map.put('x',"-..-");
      map.put('y',"-.--");
      map.put('z',"--..");
      
      for (String str : words){
        
        StringBuilder resultBuilder = new StringBuilder();
        for (int i=0;i<str.length();i++) {
          char ch = str.charAt(i);
          resultBuilder.append(map.get(ch)); 
        }
        result.add(resultBuilder.toString());    
      }
      
      return result.size();   
    }
}
