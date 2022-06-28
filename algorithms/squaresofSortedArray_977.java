package algorithms;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] answer = new int[nums.length];
        for(int i = 0 ; i < nums.length; i ++){
            answer[i] = nums[i] * nums[i];
            for(int j = 0; j < answer.length; j++){
                if(answer[j] > answer[i]){
                    int number = answer[j];
                    answer[j] = answer[i];
                    answer[i] = number;
                }   
            }            
        }
        
        return answer;
    }
}