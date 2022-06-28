package algorithms;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] number = new int[2];
        for (int i = 0; i < nums.length; i ++){
            for (int j = 1; j < nums.length; j ++){
                if(i < nums.length-1 && i != j){
                    
                    if(nums[i]+nums[j] == target){
                        number[0] = i;
                        number[1] = j;
                    }
                }
            }
        }
        return number;
    }
}