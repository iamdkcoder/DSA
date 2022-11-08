class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int num:nums){
            map.put(num , map.getOrDefault(num,0)+1);
        }
        
        //store same frequency in a list of type array
        
       List<Integer>[] bucket = new List[nums.length + 1];
        
        for(int i: map.keySet()){
            int frequency = map.get(i);
            if(bucket[frequency]==null){
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(i);
        }
        
        // extraxt top k element to do that we need to traverse from back
        int[] res = new int[k];
        int pointer=0;
        for(int j=bucket.length-1; j>=0  ; j--){
            if(bucket[j]!=null){
                for(int l=0;l<bucket[j].size()&&pointer!=k;l++){
                    res[pointer]=bucket[j].get(l);
                    pointer++;
                }
            }
        }
        
        return res;
    }
}