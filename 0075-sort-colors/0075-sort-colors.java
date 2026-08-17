class Solution {
    public void sortColors(int[] nums) {
        int countzero = 0, countone = 0, counttwo = 0;
        for(int i =0; i < nums.length; i++){
            if(nums[i]  == 0) countzero++;
            else if(nums[i] == 1) countone++;
            else counttwo++;
        }
        int j = 0;
        while(countzero > 0){
            nums[j++] = 0;
            countzero--;
        }
        while(countone > 0){
            nums[j++] = 1;
            countone--;
        }
        while(counttwo  > 0){
            nums[j++] = 2;
            counttwo--;
        }
    }
}