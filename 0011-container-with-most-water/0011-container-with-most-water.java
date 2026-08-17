class Solution {
    public int maxArea(int[] height) {
       int left =0, right= height.length-1,maxArea = 0;
       while(left < right){
        int width = right - left;
        int heig  = Math.min(height[left],height[right]);
        int area = width * heig;
        maxArea = Math.max(area, maxArea);
        if(height[left] <= height[right]) left++;
        else right--;
       }
       return maxArea;
    }
}