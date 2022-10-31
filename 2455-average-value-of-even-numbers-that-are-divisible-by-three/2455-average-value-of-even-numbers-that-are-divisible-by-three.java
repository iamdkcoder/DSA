class Solution {
    public int averageValue(int[] nums) {
        int count=0;
        int i=0;
        for(int num:nums){
            if(num%3==0 && num%2==0){
                count+=num;
                i++;
            }
        }
        return (i==0)?0:count/i;
    }
}