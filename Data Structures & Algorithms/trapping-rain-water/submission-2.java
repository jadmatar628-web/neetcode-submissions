class Solution {
    public int trap(int[] height) {
        int left=0, right=height.length-1,maxLeft=height[0], maxRight=height[height.length-1];
        int ans=0;
        while(left<=right){
            if(maxLeft<maxRight){
                if(height[left]>=maxLeft){
                    maxLeft=height[left];
                }
            else{
                ans+=maxLeft-height[left];
            }
            left++;
        }else{
            if(maxRight<=height[right]){
                maxRight=height[right];
            }else{
                ans+=maxRight-height[right];
            }
            right--;
        }
    }
    return ans;
    }
}
