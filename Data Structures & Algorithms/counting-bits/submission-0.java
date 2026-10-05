class Solution {
    public int[] countBits(int n) {
        int[] answer= new int[n+1];
        for(int i=0;i<=n;i++){
            int count=0;
            int number=i;
            for(int j=0;j<32;j++){
                if((number&1)==1){
                    count++;
                }
                number>>=1;
            }
            answer[i]=count;
            count=0;
        }
        return answer;
    }
}
