class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int maxlength=0;
       
        for(int num1:nums){
            if(!set.contains(num1-1)){
                int count=1;
                while(set.contains(num1+1)){
                    count++;
                    num1++;
                }
                maxlength= Math.max(count,maxlength);
                      
            }
        }
        return maxlength;
    }
}