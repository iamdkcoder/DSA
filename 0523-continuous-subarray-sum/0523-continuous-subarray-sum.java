class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        
        Map<Integer,Integer> map = new HashMap<>();
        //zero case
        if(k==0){
            boolean Zeros = false;
            for(int i=1; i<nums.length;i++){
                if(nums[i]==0 && nums[i-1]==0){
                    Zeros=true;
                }
                return Zeros;
            }
        }
        
        map.put(0,-1);
        int prefixsum=0;
        for(int i=0;i<nums.length;i++){
            prefixsum+=nums[i];
            if(map.containsKey(prefixsum%k)){
                
                if((i-(map.get(prefixsum%k))>1)){
                    return true;
                }
            }
            map.putIfAbsent(prefixsum%k,i);
        }
        return false;
    }
}