class Solution {
    private int recursive(int[] nums, int target, int index){
        if(index==nums.length) return -1;
        if(nums[index]==target) return index;
        int newindex=index+1;
        return recursive(nums,target,newindex);
    }
    public int search(int[] nums, int target) {
        return recursive(nums,target,0);
    }
}
