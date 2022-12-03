class Solution {
    public String frequencySort(String s) {
        
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch: s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
        PriorityQueue<Map.Entry<Character,Integer>> pq = new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        pq.addAll(map.entrySet());
        StringBuilder sb= new StringBuilder();
        while(!pq.isEmpty()){
            Map.Entry<Character,Integer> e = pq.poll();
            int count = e.getValue();
            while(count!=0){
                sb.append(e.getKey());
                count--;
            }
        }
        return sb.toString();
        
    }
}