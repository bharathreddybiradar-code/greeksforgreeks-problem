class Solution {
    public void printPattern(int n) {
        for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
        if(i==0||j==0||i==n-1||j==i){
                System.out.print("* ");
        }else{
        System.out.print("  ");
        }
        }
        System.out.println();
}
}
}