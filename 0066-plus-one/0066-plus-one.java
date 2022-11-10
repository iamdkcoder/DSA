class Solution {
    public int[] plusOne(int[] digits) {
        
        // idea here is to traverse from last and 1 to the last index and add the carry to the next index
        
      
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        
        int [] ans = new int[digits.length+1];
        
         ans[0]=1;
        return ans;
        
    }
}