class Solution {
    static String conRevstr(String s1, String s2) {
        // code here
        String s3=s1+s2;
        String ans="";
        for(int  i=s3.length()-1;i>=0;i--){
            ans+=s3.charAt(i);
        }
    return ans;
}
}