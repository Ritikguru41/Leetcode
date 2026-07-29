class Solution {
    public boolean isPalindrome(int x) {
        // x= 121
        int digit,temp;
        int rev = 0;
        if(x < 0) return false;

        temp = x;
        while(temp > 0){
            digit = temp%10;
            rev = rev * 10 + digit;
            temp = temp/10;
        }
        return (rev == x);
    }
}