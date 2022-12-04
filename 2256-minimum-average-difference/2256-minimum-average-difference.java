class Solution {
    public int minimumAverageDifference(int[] nums) {
    
        int n=nums.length;
        
        long sum =0;
        for(int num: nums){
            sum+=num;
        }
        
        long minDiff = Integer.MAX_VALUE;
        long leftsum=0;
        long rightsum=sum;
        int ans=0;
        for(int i=0;i<n;i++){
            leftsum+=nums[i];
            rightsum-=nums[i];
            long lavg=leftsum/(i+1);
            long ravg=(n-1-i)!=0?rightsum/(n-1-i):rightsum;
            long diff = Math.abs(lavg-ravg);
            if(diff==0){
                return i;
            }
            if(diff<minDiff){
                minDiff=diff;
                ans=i;
            }
        }
        return ans;
    }
}