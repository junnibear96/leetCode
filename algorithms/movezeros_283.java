package algorithms;
class Solution {
    public void moveZeroes(int[] nums) {
        int num = 0;
        int zero = 0;
        int change = 0;
        
        for(int i = 0;i < nums.length; i++){
            if(nums[i] != 0){
                nums[num++] = nums[i];
            }else{
                zero++;
            }
        }
        for(int j = nums.length -1; j >= nums.length - zero; j--){
            nums[j] = 0;
        }
        
    }
}