class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length-1;
        int maxArea =0;
        while(right >= left){
            int h = Math.min(height[left], height[right]);
            int w = right - left;
            int a = h * w;
            maxArea = Math.max(a,maxArea);
            if(height[left] <= height[right]) left++;
            else right--;
        }
            return maxArea;
    }
}