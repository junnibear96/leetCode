package algorithms;
class Solution {
    public void reverseString(char[] s) {        
        int left = 0;
        char c;
        for(int right = s.length-1; right >= left; right--){
            c = s[left];
            s[left] = s[right];
            s[right] = c;
            left++;
        }
        
    }
}