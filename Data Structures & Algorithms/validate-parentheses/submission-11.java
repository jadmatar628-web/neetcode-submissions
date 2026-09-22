class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack= new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='{' ||
            s.charAt(i)=='['||
            s.charAt(i)=='('){
                stack.push(s.charAt(i));
            }else{
                if(!stack.isEmpty()){
                    char c=stack.peek();
                    if(c=='(' && s.charAt(i)==')'){
                        stack.pop();
                    }
                    else if(c=='[' && s.charAt(i)==']'){
                        stack.pop();
                    }
                    else if(c=='{' && s.charAt(i)=='}'){
                        stack.pop();
                    }
                    else{
                        return false;
                    }
                }else{
                    return false;
                }
            }
        }
        if(stack.isEmpty()) {return true;}
        else {return false;}
    }
}
