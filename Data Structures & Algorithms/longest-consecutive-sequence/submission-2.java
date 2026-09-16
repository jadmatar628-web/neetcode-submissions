class Solution {
    public int longestConsecutive(int[] nums) {
        int max=0;
        Set<Integer> list=new HashSet<>();
        for(int i:nums){
            list.add(i);
        }
        for(int i:list){
            if(list.contains(i-1)){
                continue;
            }else{
                int count=1;
                int current=i;
                while(list.contains(current+1)){
                    count++;
                    current++;
                }
                if(count>max){
                    max=count;
                }
            }
        }
        return max;
    }
}
