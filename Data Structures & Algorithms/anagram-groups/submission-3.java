class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> list=new HashMap<>();
        for(String str:strs){
            char[] temp=str.toCharArray();
            Arrays.sort(temp);
            String key= new String(temp);
            if(list.get(key)!=null){
                list.get(key).add(str);
            }else{
                list.put(key, new ArrayList<>());
                list.get(key).add(str);
            }
        }
        return new ArrayList<>(list.values());
    }
}
