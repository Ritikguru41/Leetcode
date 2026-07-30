class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        
        int left = 0;
        int right = s.length() - 1;
        
        while(left < right){
            int ch1 = s.charAt(left);
            int ch2 = s.charAt(right);
            if(!((ch1 >= 'a' && ch1 <= 'z') || (ch1 >= '0' && ch1 <= '9'))){
                //false || false = false
                left++;
                continue;//skip non-alphabetic
            }
            if(!((ch2 >= 'a' && ch2 <= 'z') ||(ch2 >= '0' && ch2 <= '9'))){
                right--;
                continue; // skip non-alphabetic 
            }
            if(ch1 != ch2)
            return false;

            left++;
            right--;
        }      

        return true;
    }
}