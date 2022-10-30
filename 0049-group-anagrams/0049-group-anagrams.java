class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap<Character,Integer>,ArrayList<String>> bmap= new HashMap<>();
        
        for(String str:strs){
            HashMap<Character,Integer> hmap = new HashMap<>();
            for(int i=0;i<str.length();i++){
                
                char ch = str.charAt(i);
                hmap.put(ch, hmap.getOrDefault(ch,0)+1);
            }
            
            if(bmap.containsKey(hmap)==false){
                ArrayList<String> ls = new ArrayList<>();
                ls.add(str);
                bmap.put(hmap,ls);
            }else{
                ArrayList<String> ls = bmap.get(hmap);
                ls.add(str);
            }
            
        }
        List<List<String>> res = new ArrayList<>();
        for(ArrayList<String> val:bmap.values()){
            res.add(val);
        }
        return res;
    }
}