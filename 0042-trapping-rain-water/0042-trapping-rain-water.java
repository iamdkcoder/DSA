class Solution {
    public int trap(int[] height) {
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        int profit=0;
        int i=1;
        int j= height.length-2;
        left[0]=height[0];
        right[height.length-1]=height[height.length-1];
        while(i<height.length&&j>-1){
            left[i]=Math.max(height[i],left[i-1]);
            right[j]=Math.max(height[j],right[j+1]);
            i++;
            j--;
            
        }
        for(i=0; i<height.length;i++){
            profit=profit+(Math.min(left[i],right[i])-height[i]);
        }
        return profit;
    }
}