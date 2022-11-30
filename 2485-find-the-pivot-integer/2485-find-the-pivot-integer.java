class Solution {
    public int pivotInteger(int n) {
        int sum = (n*(n+1))/2;
        int presum=0;
        for(int i=1;i<=n;i++){
            presum+=i;
            // System.out.println("this is presum "+presum+" for "+i);
            // System.out.println("our calculation is "+(sum-presum+i));
            if(sum-presum+i==presum){
                return i;
            }
        }
        return -1;
            
    }
}