class Solution {
    public int prefixCount(String[] words, String pref) {
        int count =0;
        int len = pref.length();
        for(String word:words){
          if(word.length()<len){
              continue;
          }
           int checklen=len;
            for(int i=0;i<len;i++){
                
                if(pref.charAt(i)!=word.charAt(i)){
                    break;
                }
                else{
                    checklen--;
                }
                
            }
            if(checklen==0) count++ ;
            
        }
        return count;
    }
}