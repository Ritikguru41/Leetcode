class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] maps = new int[256];
        int[] mapt = new int[256];
        for(int i = 0; i < s.length(); i++){
            char sc = s.charAt(i);//e
            char ts = t.charAt(i);//a
            if(maps[sc] != mapt[ts])
            return false;

            maps[sc]  = i + 1;
            mapt[ts] =  i+ 1;
        }
        return true;
    }
}