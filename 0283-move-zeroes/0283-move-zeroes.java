class Solution {
    public void moveZeroes(int[] n) {
        int l = 0;
        for(int r = 0; r < n.length; r++){
            if(n[r]!= 0){
                int temp = n[r];
                n[r] = n[l];
                n[l] = temp;
                l++;
            }
        }

    }
}