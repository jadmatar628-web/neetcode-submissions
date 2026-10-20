class Solution {
    private boolean equals(Map<Character,Integer> need,Map<Character,Integer>have) {

    for (Character c:need.keySet()) {
        if (have.getOrDefault(c,0)<need.get(c)){
            return false;
        }
    }
    return true;
}

    public String minWindow(String s, String t) {
        if(t.length()>s.length()){
            return "";
        }
        Map<Character,Integer> need= new HashMap<>();
        Map<Character,Integer> have= new HashMap<>();
        for(int i=0;i<t.length();i++){
            need.put(t.charAt(i),need.getOrDefault(t.charAt(i),0)+1);
        }
        int left=0;
        int right=0;
        int bestStart=0;
        int minL=0;
        int min=Integer.MAX_VALUE;
        while(right<s.length()){
            have.put(s.charAt(right),have.getOrDefault(s.charAt(right),0)+1);
            while(equals(need,have)){
                int current=right-left+1;
                if(current<min){
                    min=current;
                     minL=current;
                bestStart=left;
                }
               
                have.put(s.charAt(left),have.get(s.charAt(left))-1);
                left++;
            }
            right++;
        }
        return s.substring(bestStart,bestStart+minL);
    }
}
