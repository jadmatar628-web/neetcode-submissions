class Solution {

    public String encode(List<String> strs) {
        StringBuilder string= new StringBuilder();
        String delimiter="#";
        for(String i:strs){
            int size=i.length();
            string.append(size);
            string.append(delimiter);
            string.append(i);
        }
        return string.toString();
    }

    public List<String> decode(String str) {
    List<String> answer = new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int len=0;
            while(Character.isDigit(str.charAt(i))){
            len = len * 10 + Character.getNumericValue(str.charAt(i));
            i++;}
            i=i+1; // to skip the delimiter//
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<len;j++){
                sb.append(str.charAt(i));
                i++;
            }
            answer.add(sb.toString());
        }
        return answer;
    }
}
