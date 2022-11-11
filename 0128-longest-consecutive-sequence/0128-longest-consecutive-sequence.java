class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int maxsequencelength=0;
        for(int i=0; i<nums.length;i++){
            int currsum=nums[i];
            int currsumlength=1;
            if(!set.contains(nums[i]-1)){
                while(set.contains(currsum+1)){
                    currsum++;
                    currsumlength++;
                }
            }
            maxsequencelength= Math.max(currsumlength,maxsequencelength);
        }
        
        return maxsequencelength;
    }
}