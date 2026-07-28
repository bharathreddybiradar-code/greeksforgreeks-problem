class Solution {
    static String delAlternate(String s) {
        // code here
        String ans="";
        for(int i=0;i<s.length();i++){
              if(i%2==0){
                ans +=s.charAt(i);
            }
    }
    return ans;
}
}