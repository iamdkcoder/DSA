class Solution {
    public boolean halvesAreAlike(String s) {
        s=s.toLowerCase();
        int i=0;
        int j=s.length()-1;
        int totalvowels=0;
        
        while(i<j){
        
            if(isVowel(s.charAt(i))){
                totalvowels++;
            }
            if(isVowel(s.charAt(j))){
                totalvowels--;
            }
            i++;
            j--;
        }
        
        
        return (totalvowels==0)?true:false;
        
    }
    public boolean isVowel(char y){
        if (y == 'a' || y == 'e' || y == 'i' || y == 'o'
            || y == 'u' ){
            return true;
        }else{
          return false;
        }
     }
}