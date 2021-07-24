class Solution {
    public String reformatDate(String date) {
      
      Map<String,String> map = new HashMap<>();
      map.put("Jan", "01");
      map.put("Feb", "02");
      map.put("Mar", "03");
      map.put("Apr", "04");
      map.put("May", "05");
      map.put("Jun", "06");
      map.put("Jul", "07");
      map.put("Aug", "08");
      map.put("Sep", "09");
      map.put("Oct", "10");
      map.put("Nov", "11");
      map.put("Dec", "12");
      
      String dateSplit[] = date.split(" ");
      
      
      StringBuilder result = new StringBuilder();
      
      result.append(dateSplit[2]+"-");
      
      result.append(map.get(dateSplit[1])+"-");
            
      
      if (Character.isDigit(dateSplit[0].charAt(1))) {
        result.append(dateSplit[0].charAt(0));
        result.append(dateSplit[0].charAt(1));
      } else {
        result.append("0");
        result.append(dateSplit[0].charAt(0));
      }
      
      
      return result.toString();
     
  
    }
}
