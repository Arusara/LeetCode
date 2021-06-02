
// https://leetcode.com/problems/reverse-string/submissions/
// chars string is reversed without using extra memory and memory usage is o(1).

class Solution {
    public void reverseString(char[] s) {
        
        int lastIndex = s.length-1;
        for (int i=0;i<s.length/2;i++) {
            
            char temp = s[i];
            s[i] = s[lastIndex];
            s[lastIndex--] = temp;
            
        }
    }
}
