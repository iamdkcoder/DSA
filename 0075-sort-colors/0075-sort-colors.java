class Solution {
    public void sortColors(int[] nums) {
        int num0=0;
        int num1=0;
        int num2=0;
        for(int num:nums){
            if(num==0){
                num0++;
            }else if(num==1){
                num1++;
            }else{
                num2++;
            }
        }
       
        for(int i=0; i<nums.length;i++){
            if(num0!=0){
                nums[i]=0;
                num0--;
            }else if(num1!=0){
                nums[i]=1;
                num1--;
            }else{
                nums[i]=2;
            }
        }
        
        
    }
}