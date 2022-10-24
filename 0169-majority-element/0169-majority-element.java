class Solution {
    public int majorityElement(int[] n) {
      int count=0;
      int major = n[0];
        for(int a:n){
            if(count==0){
                count++;
                major=a;
            }else if(major==a){
                count++;
            }else{
                count--;
            }
        }
        return major;
        
    }
}

//o(nlogn) o(1)
// Arrays.sort(n);
//         int count=0;
//         int maxcount=0;
//         int majority=n[0];
//         for(int i=0; i<n.length-1;i++){
//             if(n[i]==n[i+1]){
//                 count++;
//                 if(count>maxcount){
//                     majority=n[i];
//                     maxcount=count;
//                 }
//             }else{
//                 count=0;

//             }
//         }