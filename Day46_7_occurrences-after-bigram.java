class Solution {
    public String[] findOcurrences(String text, String first, String second) {
      
      
      String[] splitStr = text.split(" ");
      
      List<String> list = new ArrayList<>();
      for(int i=0;i<splitStr.length-2;i++) {
      
        if (splitStr[i].equals(first) && splitStr[i+1].equals(second) ) {
          list.add(splitStr[i+2]);
        }
      }
      
      String[] result= new String[list.size()];
      int i=0;
      for(String str: list) {
        result[i++] = str;
      }
      
      return result;
        
    }
}
