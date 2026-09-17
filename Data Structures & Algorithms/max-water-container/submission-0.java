class Solution {
    private int min(int a, int b){
        if(a>b) return b;
        return a;
    }
    public int maxArea(int[] heights) {
        int max=0;
        int left=0;
        int right=heights.length-1;
        while(left<right){
            int width=right-left;
            int min=min(heights[left],heights[right]);
            int res=min*width;
            if(res>max){
                max=res;
            }
            if(heights[left]<heights[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}
