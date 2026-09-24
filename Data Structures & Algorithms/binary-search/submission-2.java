class Solution {
    public int search(int[] nums, int target) {
        if(target==nums[nums.length/2]){
            return nums.length/2;
        }
        if(target>nums[nums.length/2]){
            for(int i=nums.length/2;i<nums.length;i++){
                if(nums[i]==target){
                    return i;
                }
            }
        }else{
            for(int i=0;i<=nums.length/2;i++){
                if(target==nums[i]){
                    return i;
                }
            }
        }
        return -1;
    }
}
