class Solution {
    public int majorityElement(int[] nums) {
      int count = 0, candidate = -1;
        int n = nums.length;
        for(int i = 0; i< n; i++){
            if(count == 0){
            candidate = nums[i];
            }
            if(candidate == nums[i]) count++;
            else count--;
        }
        return candidate;
    }
}