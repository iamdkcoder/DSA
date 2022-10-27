class Solution {
    public boolean isSubsequence(String s, String t) {
       int n=s.length();
        int m =t.length();
        if(n>m){
            return false;
        }
        int i=0;
        int j=0;
         char[]S=s.toCharArray();
         char[] T=t.toCharArray();
        while(j<m && i<n){
            
            if(S[i]==T[j]){
                i++;
                j++;
            }else{
                j++;
            }


        }

        return i==s.length();
    }
}