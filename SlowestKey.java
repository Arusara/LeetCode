class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        
        if (keysPressed.length()==1) {
            return keysPressed.charAt(0);
        }
        
        char maxCh = keysPressed.charAt(0);
    
        //int times = a[0];
        int maxTime= releaseTimes[0];
        
        for (int i=1;i<keysPressed.length();i++){
            int ch = keysPressed.charAt(i);
            int times = releaseTimes[i]-releaseTimes[i-1];
          
          System.out.println(times);
            
            if (times>maxTime) {
                maxTime = times;
                maxCh = (char) ch;
            } else if (times==maxTime) {
              
              int c1 = Math.max(ch,(int)maxCh);
              maxCh = (char) c1;
              
            }
        
        }
        
        return maxCh;
        
    }
}
