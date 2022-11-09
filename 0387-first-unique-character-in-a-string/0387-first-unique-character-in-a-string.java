class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        
        for(int i=0; i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        
        for(int i=0; i<s.length();i++){
            if(freq[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
}



// public int firstUniqChar(String s) {
//         HashMap<Character,Integer> map = new HashMap<>();
//         for(int i=0;i<s.length();i++ ){
//             map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
//         }
        
//         for(int j=0 ;j<s.length();j++){
//             if(map.get(s.charAt(j))==1){
//                 return j;
//             }
           
//         }
//         return -1;
//     }