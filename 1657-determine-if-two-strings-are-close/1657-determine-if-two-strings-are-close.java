class Solution {
    
    public boolean closeStrings(String word1, String word2) {
        char[] a = word1.toCharArray();
        char[] b = word2.toCharArray();
        if (a.length!=b.length)
            return false;
        int[] a1 = new int[26];
        int[] a2 = new int[26];
        for(char c : a) 
            a1[c-'a']++;
        for(char c : b)
            a2[c-'a']++;
        for(int i=0;i<26;i++) {
            if(a1[i]==0 && a2[i]!=0 || a1[i]!=0 && a2[i]==0)
                return false;
        }
        Arrays.sort(a1);
        Arrays.sort(a2);
        if (!Arrays.equals(a1,a2)){
            return false;
        }
        return true;
    }
    
//     public boolean closeStrings(String word1, String word2) {
//         if(word1.length()!=word2.length()){
//             return false;
//         }
//         HashMap<Character,Integer> map1 = new HashMap<>();
//         HashMap<Character,Integer> map2 = new HashMap<>();
//         for(char ch:word1.toCharArray()){
//             map1.put(ch,map1.getOrDefault(ch,0)+1);
//         }
//         for(char ch:word2.toCharArray()){
//             map2.put(ch,map2.getOrDefault(ch,0)+1);
//         }
//         if(!map1.keySet().equals(map2.keySet())){
//             return false;
//         }
//         int[] arr1 = new int[map1.size()];
//         int i=0;
//         for(char ch:map1.keySet()){
//             arr1[i++]=map1.get(ch);
//         }
        
//         int[] arr2 = new int[map2.size()];
//         i=0;
//         for(char ch:map2.keySet()){
//             arr2[i++]=map2.get(ch);
//         }
        
//         Arrays.sort(arr1);
//         Arrays.sort(arr2);
//         return Arrays.equals(arr1,arr2);
//     }
}