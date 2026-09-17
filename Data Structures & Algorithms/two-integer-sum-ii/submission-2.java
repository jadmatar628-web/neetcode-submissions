class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans=new int[2];
        int left=0;
        int right=(numbers.length)-1;
        while(left<right){
            if(numbers[left]+numbers[right]>target){
                right--;
                continue;
            }
            else if(numbers[left]+numbers[right]<target){
                left++;
                continue;
            }
            else {
    return new int[]{left + 1, right + 1};
}
        }
        throw new IllegalStateException("No valid solution");
    }
}
