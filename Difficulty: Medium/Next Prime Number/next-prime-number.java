class Solution {
    public static int nextPrime(int n) {
       while(true){
           n++;
           int i;
           for(i=2;i<n;i++){
               if(n%i==0){
                   break;
               }
           }
       
          if(i==n){
               return n;
       
    }
       }
    }
}
