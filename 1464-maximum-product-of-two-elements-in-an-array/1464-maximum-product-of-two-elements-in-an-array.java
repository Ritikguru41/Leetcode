class Solution {
    public int maxProduct(int[] n) {
        int larg=0,seclarg = 0;
        for(int i = 0; i < n.length; i++){
            if(n[i] > larg){
                seclarg = larg;
                larg = n[i];
            }else if(n[i] > seclarg && n[i] != 0){
                seclarg = n[i];
            }
        }
        return (larg -1) * (seclarg -1);
    }
}