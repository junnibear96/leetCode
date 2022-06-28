package algorithms;

import java.util.ArrayList;

class Solution {
    public boolean isPalindrome(ListNode head) {
        boolean answer = true;
        ArrayList<Integer> vals = new ArrayList<>();
        
        
        while(answer){
            vals.add(head.val);
            if(head.next == null){
                break;
            }
            head = head.next;
        }
        for(int i = 0; i < vals.size()/2; i++){
            if(vals.get(i) != vals.get(vals.size()-1-i)){
                return false;
            }
        }
        return true;
    }
}