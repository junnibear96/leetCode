package algorithms;
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] answer = new int[2];
        boolean r = true;
        int left = 0;
        int right = 1;
        while(r){
            if(numbers[left] + numbers[right] == target){
                answer[0]=left+1;
                answer[1]=right+1;
                r = false;
            }else if(right == numbers.length-1 && left != right){
                ++left;
                right = left + 1;
            }else if(left != right){
                right++;   
                if(numbers[left] == numbers[left+1]){
                    left++;
                }
            }
            
        }
        return answer;
    }
}