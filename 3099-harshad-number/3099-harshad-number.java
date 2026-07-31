class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
     int original = x;// value store
     int sum = 0;// initiallize 0
     while(x>0){ // loop till meet 0
        sum += x%10;// sum + digit add
        x /= 10; // 18 -> 8
     }
     if(original % sum ==0) return sum;//return the sum 
     else return -1;// return -1
    }
}