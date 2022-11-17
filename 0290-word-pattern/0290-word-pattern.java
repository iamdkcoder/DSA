class Solution {
    public boolean wordPattern(String pattern, String s) {
      
        String[] words = s.split(" "); 
        if (words.length != pattern.length()) return false;
          
        HashMap<Character,String> map = new HashMap<>();
        HashMap<String , Boolean> checkmap= new HashMap<>();
        int i=0;
        System.out.println(Arrays.toString(words));
        
        for(char p:pattern.toCharArray()){
            String word = words[i];
                
            if(map.containsKey(p)){
            String temp = map.get(p);
                if(!temp.equals(word)){
                    return false;
                }
                 
            }else{
                if(checkmap.containsKey(word)){
                    return false;
                }else{
                map.put(p,word);
                checkmap.put(word,true);
            }
           
            
        }
             i++;
        }
        return true;
    }
}