class Solution {
    public int maxSubArray(int[] nums) {
       int maxFar = nums[0];
       int currMax = nums[0];

       for(int i =1;i < nums.length;i++){

        currMax = Math.max(nums[i], nums[i] + currMax);
        maxFar = Math.max(currMax,maxFar);
       }
       return maxFar;
    }
}