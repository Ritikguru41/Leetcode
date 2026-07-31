class Solution {
    public int removeDuplicates(int[] n) {
        int slow = 0;
        for(int fast = 1; fast < n.length; fast++){
            if(n[fast] != n[slow]){
                slow++;
                n[slow] = n[fast];
            }
        }
        return slow + 1;
        }
    }