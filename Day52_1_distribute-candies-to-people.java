class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        
      int result[] = new int[num_people];      
      int candy=1;
      
      while(candies>0) {
       // candy=1;
        for(int i=0;i<num_people;i++) {
          if(candies>0) { 
            if (candies>candy)
              result[i]=result[i]+candy;
            else result[i]=result[i]+candies;
            candies=candies-candy;
            candy++;
          }
        }
    }
      
      return result;
      
      
    }
}
