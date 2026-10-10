class Solution {
    public int[] plusOne(int[] digits) {
        int last=digits.length-1;
        int[] answer=new int[last+2];
        if(digits[last]<9){
            digits[last]++;
            answer=digits;
            return answer;
        }
        while(last>=0 && digits[last]==9){
            digits[last]=0;
            last--;
        }
        if(last>=0 && digits[last]!=9){
            digits[last]++;
            answer=digits;
        }if(last==-1){
            answer[0]=1;
            for(int i=1;i<digits.length-1;i++){
                answer[i]=digits[i-1];
            }
        }
        return answer;
    }
}
