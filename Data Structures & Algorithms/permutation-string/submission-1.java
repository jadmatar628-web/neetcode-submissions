class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1==null && s2 ==null) return true;
        if(s1== null) return true;
        if(s2==null) return false;
        Map<Character,Integer> map= new HashMap<>();
        for(int i=0;i<s1.length();i++){            map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
        }
        int left=0;
        int right=s1.length()-1;
        while(right<s2.length()){
            if(!map.containsKey(s2.charAt(left)) || map.get(s2.charAt(left))==0){
                left++;
                right++;
                continue;
            }
            for(int i=left;i<s1.length()+left;i++){
                if(map.containsKey(s2.charAt(i)) && map.get(s2.charAt(i))>0){
                    char current=s2.charAt(i);
                    int newValue=map.get(current);
                    newValue--;
                    map.put(s2.charAt(i),newValue);
                }
            }
            int sum = 0;
            for (int value : map.values()) {
                 sum += value;}
if(sum==0){
    return true;
}else{
    map.clear();
     left++;
     right++;
      for(int i=0;i<s1.length();i++){            map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
        }
}

        }
return false;
}}
