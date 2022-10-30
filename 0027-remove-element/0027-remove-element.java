class Solution {
    public int removeElement(int[] nums, int val) {
        int pointer=0;
        int i=0;
        while(i<nums.length){
            if(nums[i]!=val){
                nums[pointer]=nums[i];
                pointer++;
            }
            i++;
            
        }
        return pointer;

    }
}