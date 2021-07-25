class Solution {
    public int totalMoney(int n) {
       int weeks = n/7;
       int rem = n%7;

       int sum=0;


       // weeks calc

        int val = 3 + weeks;
        val = (val* (val+1))/2;
        val = val - 6;
        sum += val*7;



       rem = rem+weeks;

       sum+=(rem*(rem+1))/2;
       sum-=(weeks*(weeks+1))/2;




       return sum;

        
    }
}
