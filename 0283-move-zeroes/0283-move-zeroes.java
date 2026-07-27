class Solution {
    public void moveZeroes(int[] n) {
       int j = 0;
       for(int i =0;i < n.length; i++){
        if(n[i] != 0){
            int temp = n[i];
            n[i] = n[j];
            n[j] = temp;
            j++;
        }
       }
       for(int nums:n)
       System.out.print(nums + " ");
    }
}