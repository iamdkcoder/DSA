class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int i=-1;
        for(int j=0; j<nums.length;j++){
            if(set.contains(nums[j])){
                nums[i]=nums[j];
 
                
            }else{
                set.add(nums[j]);
                i++;

                nums[i]=nums[j];
            }
           
        }
        
        for(int k=i+1;k<nums.length;k++){
            nums[k]=0;
        }
        return i+1;
    }
}