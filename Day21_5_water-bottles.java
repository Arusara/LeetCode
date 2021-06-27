class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
     
      int total = numBottles;
      
      int bottle = numBottles;
      
      while (bottle>=numExchange) {
        
        total = total + (bottle/numExchange);

        bottle = (bottle/numExchange) + (bottle%numExchange);
         
      }
      
      return total;
    
      
    }
}
