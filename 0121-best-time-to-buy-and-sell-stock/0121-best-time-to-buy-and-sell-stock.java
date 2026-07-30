class Solution {
    public int maxProfit(int[] arr) {
        int minPrice = arr[0];
        int maxProfit =0;
        for(int i =0; i < arr.length; i++){
            minPrice = Math.min(arr[i],minPrice);
            int Profit = arr[i] - minPrice; 
            maxProfit = Math.max(Profit,maxProfit);
        }
        return maxProfit;
    }
}