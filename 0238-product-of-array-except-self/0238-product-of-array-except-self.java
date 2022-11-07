class Solution {
    public int[] productExceptSelf(int[] nums) {
     int n = nums.length;
      
    int[] res = new int[n];
    res[0]=1;
    for(int i=1;i<n;i++){
        res[i]=nums[i-1]*res[i-1];
    }
    
    int sum=1;
    for(int j=n-1;j>=0;j--){
        res[j]=sum*res[j];
     
        sum*=nums[j];
    
    }
   return res;
    }
}