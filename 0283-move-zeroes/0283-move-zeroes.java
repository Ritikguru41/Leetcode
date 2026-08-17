class Solution {
    public void moveZeroes(int[] n) {
        int i = 0;
        for(int r = 0; r < n.length; r++){
            if(n[r] != 0){
                int temp = n[i];
                n[i] = n[r];
                n[r] = temp;
                i++;
            }
        }

    }
}