class Solution {
    static ArrayList<Integer> getSum(int N) {
        // code here
        int odsum=0;
        int evsum=0;
        for(int i=0;i<=N;i++){
            if(i%2==0){
                evsum+=i;
            }else{
                odsum+=i;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(evsum);
        ans.add(odsum);

        return ans;
    }
}