class Solution {
    public int singleNumber(int[] nums) {
        int runningValue=nums[0];
        for(int i=1;i<nums.length;i++){
            runningValue=(runningValue)^(nums[i]);
        }
        if(runningValue==0){
            return 0;
        }
        return runningValue;
    }
}
