class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;//3
        int[] ans = new int[2 * n]; // empty array

        for(int i = 0; i < n; i++){ //3<3
            ans[i] = nums[i];//0 1 2
            ans[i + n] = nums[i];//3 4 5  
        }
        return ans;
    }
}