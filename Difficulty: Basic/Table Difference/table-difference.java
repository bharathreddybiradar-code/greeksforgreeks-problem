class Solution {
    public static void difference(int n1, int n2) {

        // Write your code here
        int n3=0;
        if(n1>n2){
            n3=n1-n2;
        }
        int mul=0;
         for(int i=1;i<=10;i++){
             mul=n3*i;
         System.out.print(mul+" ");

         }
    }
}