class Solution {
    public String smallestPalindrome(String s) {
       int[] freq = new int[26];
       StringBuilder left = new StringBuilder();
       String middle = "";
       char[] ch = s.toCharArray();
       for(int i =0; i < ch.length; i++)
       freq[ch[i] - 'a']++;
       for(int j =0; j < 26; j++){

        if(freq[j]%2 == 1)
        middle = String.valueOf((char)('a' + j));

        for(int k = 0;k < freq[j]/2; k++)
            left.append((char)('a' + j));

       }
       return left.toString() + middle + left.reverse().toString();

    }
}
