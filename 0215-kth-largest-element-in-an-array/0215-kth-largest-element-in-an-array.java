class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums); //logn
        return nums[nums.length-k];
       
    }
}