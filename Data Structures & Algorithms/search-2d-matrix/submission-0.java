class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int top=0;
        int bottom=matrix.length-1;
        while(top<=bottom){
            int mid=(int)(top+bottom)/2;
            if(matrix[mid][matrix[mid].length-1]<target){
                top=mid+1;
            }
            else if(matrix[mid][0]>target){
                bottom=mid-1;
            }
            else{
                int left = 0;
                int right=matrix[mid].length-1;
                while(left<=right){
                        int midd=(left+right)/2;
                        if(matrix[mid][midd]==target){
                            return true;
                        }else if(matrix[mid][midd]>target){
                            right=midd-1;
                        }else{
                            left=midd+1;
                        }
                    }
                    return false;
                }
            }
        return false;
    }
}
