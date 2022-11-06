class Solution {
    public int[] applyOperations(int[] nums) {
        
        for(int i=0 ; i<nums.length-1;i++){
            
            if(nums[i]==nums[i+1]){
                nums[i]=nums[i]*2;
                nums[i+1]=0;
            }
        }
        for(int j=0; j<nums.length;j++){
            if(nums[j]==0 && j!=nums.length-1){
                int k=j+1;
                while(k!=nums.length-1 && nums[k]==0){
                    k++;
                }
                swap(j,k,nums);
            }
        }
        return nums;
    }
    public void swap(int j, int k,int []arr){
        int temp=arr[j];
        arr[j]=arr[k];
        arr[k]=temp;
    }
}