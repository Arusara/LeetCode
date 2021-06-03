class ParkingSystem {
  
    private int big;
    private int medium;
    private int small;

    public ParkingSystem(int big, int medium, int small) {
      this.big = big;
      this.medium = medium;
      this.small = small;
        
    }
    
    public boolean addCar(int carType) {
      
      boolean result = false;
      if (carType==1) {
        result = this.big>0;
        this.big--;
      } else if (carType==2) {
        result = this.medium>0;
        this.medium--;
      } else if (carType==3) {
        result = this.small>0;
        this.small--;
      } 
      return result;
        
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
