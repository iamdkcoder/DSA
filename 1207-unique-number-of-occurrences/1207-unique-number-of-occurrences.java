class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(int num: arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        for(int i:map.keySet()){
            if(set.contains(map.get(i))){
                return false;
            }
            set.add(map.get(i));
        }
        return true;
    }
}