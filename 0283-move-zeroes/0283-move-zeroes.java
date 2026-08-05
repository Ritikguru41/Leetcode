class Solution {
    public void moveZeroes(int[] n) {
     int inspos = 0;
     for(int i =0 ;i < n.length; i++){
        if(n[i] != 0){
            if(i != inspos){
                n[inspos] = n[i];
                n[i] = 0;
            }
            inspos++;
        }
     }
     for(int arr: n)
     System.out.println(arr);
    }
}