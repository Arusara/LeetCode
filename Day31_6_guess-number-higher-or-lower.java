/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
      
      int left = 1;
      int right = n;
      
      while(left<=right) {
        
        int middle = left +(right - left)/2;
        
        int result = guess(middle);
        
        if (result == 0)  {
          return middle;
        }
        
        if (result==1) {
          left = middle+1;
        } else {
          right = middle-1;
        }
        
        
        
      }
      return left;
        
    }
}
