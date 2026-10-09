class Solution {
    public int reverse(int x) {
        String t=new StringBuilder(String.valueOf(x)).toString();
        char[] arr=new char[t.length()];
        arr=t.toCharArray();
        try{
            if(arr[0]=='-'){
            int left=1;
            int right=arr.length-1;
            while(left<right){
                char temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
            String s= new String(arr,1,arr.length-1);
            int jad=Integer.parseInt(s);
            return jad*-1;
        }else if(arr[0]!='-'){
            int left=0;
            int right=arr.length-1;
            while(left<right){
                char temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
            String s= new String(arr,0,arr.length);
            int jad=Integer.parseInt(s);
            return jad;
        }
        }
        catch(NumberFormatException e){
            return 0;
        }
        return 0;}
}
