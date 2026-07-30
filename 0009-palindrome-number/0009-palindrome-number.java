class Solution {
    public boolean isPalindrome(int x) {
        int digit, temp;
        int rev = 0;
        temp = x;
        if(x<0) return false;

        while(temp > 0){
            digit = temp%10;
            rev = rev*10 + digit;
            temp = temp/10;
        }
        return (rev == x);
    }}