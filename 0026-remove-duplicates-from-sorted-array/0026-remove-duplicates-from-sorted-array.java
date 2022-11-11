class Solution {
    
   public int removeDuplicates(int[] nums) {
       int i=0;
       for(int j=1; j<nums.length;j++){
           if(nums[j]==nums[j-1]){
                i++;
           }else{
               nums[j-i]=nums[j];
              
           }
       }
       
      
        return nums.length-i;
       
   }
}

// int count = 0;
// for(int i = 1; i < n; i++){
//     if(A[i] == A[i-1]) count++;
//     else A[i-count] = A[i];
// }
// return n-count;


//using set and loops

// public int removeDuplicates(int[] nums) {
//         Set<Integer> set = new HashSet<>();
//         int i=-1;
//         for(int j=0; j<nums.length;j++){
//             if(set.contains(nums[j])){
//                 nums[i]=nums[j];
                
//             }else{
//                 set.add(nums[j]);
//                 i++;
//                 nums[i]=nums[j];
//             }
           
//         }
        
//         for(int k=i+1;k<nums.length;k++){
//             nums[k]=0;
//         }
//         return i+1;
//     }