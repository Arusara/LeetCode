class Solution {
    public int dayOfYear(String date1) {
      
      String str[]= date1.split("-");
      
      int year = Integer.parseInt(str[0]);
      int month = Integer.parseInt(str[1]);
      int day = Integer.parseInt(str[2]);
      
      int total=0;
      for(int i=1;i<month;i++) {
        
        if (i==1 || i==3 || i==5 || i==7 || i==8 || i==10||i==12) {
          total=total+31;
        } else if  (i==2 && year%4==0) { 
          total+=29;
        } else if (i==2) {
          total+=28;
        } else {
          total+=30;
        }
      }
      
      total+=day;
      
      return total;
        
    }
}
