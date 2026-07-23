class Solution {
    public static int nthDay(int d, int n) {
        // write your code here
        int day=0;
        if(d>n){
            day=d-n;
            return day;
        }else{
            day=(d-(n%7)+7)%7;
            return day;
        }
    }
}