class Solution {
    public String removeStars(String s) {
        
        StringBuilder sb = new StringBuilder();
        for(char c:s.toCharArray()){
            int size = sb.length();
            if(size>0 && c=='*'){
                sb.deleteCharAt(size-1);
                
            }else{
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}