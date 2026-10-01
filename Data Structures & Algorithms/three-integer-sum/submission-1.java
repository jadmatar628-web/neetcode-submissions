class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();

        for (int fixed = 0; fixed < nums.length - 2; fixed++) {

            // skip duplicate fixed values
            if (fixed > 0 && nums[fixed] == nums[fixed - 1]) {
                continue;
            }

            int left = fixed + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[fixed] + nums[left] + nums[right];

                if (sum == 0) {
                    ans.add(Arrays.asList(
                        nums[fixed],
                        nums[left],
                        nums[right]
                    ));

                    left++;
                    right--;

                    // skip duplicate left values
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }

                    // skip duplicate right values
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }

                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return ans;
    }
}