class Solution {
    public String smallestPalindrome(String s) {
        int[] freq = new int[26];
        String middle = "";
        StringBuilder left = new StringBuilder();
        char[] ch = s.toCharArray(); // b, a, b, a, b
        for(int i =0; i < ch.length; i++)
        freq[ch[i] - 'a']++;

        for(int j = 0; j < freq.length; j++){
            if(freq[j]%2 == 1){
                middle = String.valueOf((char)('a' + j));
            }
            for(int k = 0; k < freq[j]/2; k++)
            left.append((char)('a' + j));
        }
        String ans = left.toString() + middle + left.reverse().toString();
        return ans;

    }
}