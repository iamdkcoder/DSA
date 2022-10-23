class Solution {
    public boolean isHappy(int n) {
         
        int slow =n;
        int fast =n;
        do{
            slow=findsquare(slow);
            fast=findsquare(findsquare(fast));
        }while(slow!=fast);
            
        if(slow==1){
            return true;
        }
        return false;
        
    }
    public int findsquare(int n){
        int sq=0;
        while(n>0){
            int digit = n%10;
            sq+=(digit*digit);
            n/=10;

        }
        return sq;
    }
}