class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        s=s.toLowerCase();
        while(i<j){
            char start =s.charAt(i);
            char end =s.charAt(j);
                if(!Character.isLetterOrDigit(start)){
                   i++;
                    continue;
            }
            if(!Character.isLetterOrDigit(end)){
                j--;
                continue;
            }
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }
}