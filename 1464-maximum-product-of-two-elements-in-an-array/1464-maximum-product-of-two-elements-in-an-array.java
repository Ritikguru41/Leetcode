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

    
        // // Arrays.sort(nums);
        // // int ans = ((nums[nums.length-1])-1) * (nums[nums.length-2]-1);
        // // return ans;

        // int larg = 0, seclarg = 0;
        // for(int arr : n){
        //     if(arr > larg){
        //         seclarg = larg;
        //         larg = arr;
        //     }else if(arr > seclarg){
        //         seclarg = arr;
        //     }
        // }
        // return (larg - 1) * (seclarg - 1);