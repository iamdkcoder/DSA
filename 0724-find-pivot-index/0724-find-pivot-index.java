class Solution {
    public int pivotIndex(int[] nums) {
      int total=0;
        for(int i=0 ; i<nums.length;i++){
            total+=nums[i];
        }
        
        int currentsum=0;
        for(int j=0; j<nums.length;j++){
            if(total-currentsum-nums[j]==currentsum){    //28-11-6=11 
                return j;
            }
            currentsum+=nums[j];
            
            
        }
        
        return -1;
    }
}