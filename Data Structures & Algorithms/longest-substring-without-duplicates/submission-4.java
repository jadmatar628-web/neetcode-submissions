class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int maxCount=0;
        int left=0;
        for(int i=0;i<s.length();i++){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
            }else{
                while(set.contains(s.charAt(i))){
                    set.remove(s.charAt(left));
                    left++;
                }
                set.add(s.charAt(i));
            }
            maxCount=Math.max(i-left+1,maxCount);
        }
        return maxCount;
    }
}
