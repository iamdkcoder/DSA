class Solution {
    public int maxProfit(int[] nums) {
     int minsofar=nums[0];
     int max = 0;
     for(int i=0; i<nums.length;i++){
         minsofar= Math.min(minsofar,nums[i]);
         max= Math.max((nums[i]-minsofar),max);
     }
        return max;
    }
}