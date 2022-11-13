class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
            for(int num1:nums1){
                map.put(num1,map.getOrDefault(num1,0)+1);
            }
        
        
         ArrayList<Integer> list = new ArrayList<>();
        
        for(int num2:nums2){
            if(map.containsKey(num2) && map.get(num2)>0 ){
                list.add(num2);
                map.put(num2, map.get(num2) - 1);

            }
        }
        
        int[] arr = new int[list.size()];
        
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        
        return arr;
    }
}