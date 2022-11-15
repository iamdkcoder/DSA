class Solution {
    
  public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for (int n : nums2) {
            while (!stack.isEmpty() && stack.peek() < n) {
                map.put(stack.pop(), n);
            }

            stack.push(n);
        }

        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = map.getOrDefault(nums1[i], -1);
        }

        return nums1;
    }
}


// public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//         HashMap<Integer,Integer> map = new HashMap<>();
//         int[] ans = new int[nums1.length];
//         int max =-1;
//         Stack<Integer> stack = new Stack<>();
        
//         for(int i=nums2.length-1;i>=0;i--){
//             if(!stack.isEmpty() && stack.peek()>nums2[i]){
//                 max=stack.pop();
//             }
//             stack.push(nums2[i]);
//             map.put(nums2[i],max);
            
            
//         }
        
//         for(int j=0;j<nums1.length;j++){
//             ans[j]=map.getOrDefault(nums1[j],-1);
//         }
        
//         return ans;
        
//     }