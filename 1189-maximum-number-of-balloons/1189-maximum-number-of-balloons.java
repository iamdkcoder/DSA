class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> map = new HashMap<>();
        int count =text.length();
        
        for(char ch:text.toCharArray()){
            if(ch=='b' || ch=='a' || ch=='l' || ch=='o' || ch=='n'){
                          map.put(ch,map.getOrDefault(ch,0)+1);
            
            }
        }
        HashMap<Character,Integer> balloon_map = new HashMap<>();
        String s = "balloon";
        for(char ch1:s.toCharArray()){
        balloon_map.put(ch1,balloon_map.getOrDefault(ch1,0)+1);
        }
       for(char ch2:s.toCharArray()){
           count = Math.min(count, map.getOrDefault(ch2,0)/balloon_map.get(ch2));
       }
        return count;
    }
}