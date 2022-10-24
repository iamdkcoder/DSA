class Solution {
    public int maxLength(List<String> arr) {
        List<String> ls = new ArrayList<>();
        int maxlen=0;
        ls.add("");
        for(String s:arr){
            if(!checkuniquestring(s)){
                continue;
            }else{
                List<String> newanslist = new ArrayList<>();
                for(String candidate:ls){
                    String temp = candidate+s;
                    if(checkuniquestring(temp)){
                        newanslist.add(temp);
                        maxlen=Math.max(maxlen , temp.length());
                    }
                }
                ls.addAll(newanslist);
            }
            
          
        }
        return maxlen;
    }
    public boolean checkuniquestring(String s){
        int[] freq = new int[26];
        char[] arr = s.toCharArray();
        for(char ch:arr){
            freq[ch-'a']++;
            if(freq[ch-'a']>1){
                return false;
            }
            
        }
        return true;
    }
}