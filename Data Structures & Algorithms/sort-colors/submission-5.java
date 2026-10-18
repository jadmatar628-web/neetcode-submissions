class Solution {
    public void sortColors(int[] nums) {
        if(nums.length==1){
            return;
        }
        int countz=0;
        int counto=0;
        int countt=0;
        for(int i:nums){
            if(i==1){
                counto++;
            }else if(i==2){
                countt++;
            }else{
                countz++;
            }
        }
        for(int i=0;i<countz;i++){
            nums[i]=0;
        }
        for(int i=countz;i<countz+counto;i++){
            nums[i]=1;
        }
        for(int i=counto+countz;i<countt+counto+countz;i++){
            nums[i]=2;
        }
    }
}