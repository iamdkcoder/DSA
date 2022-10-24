class Solution {
    public int majorityElement(int[] n) {
      int count=0;
      int major = n[0];
        for(int a:n){
            if(count==0){
                count++;
                major=a;
            }else if(major==a){
                count++;
            }else{
                count--;
            }
        }
        return major;
        
    }
}