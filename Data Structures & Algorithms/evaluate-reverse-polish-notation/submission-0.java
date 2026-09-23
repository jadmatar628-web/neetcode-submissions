class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for(String current: tokens){
            if(current.equals("+")){
                if(!stack.isEmpty()){
                    int a=stack.pop();
                    int b=stack.pop();
                    stack.push(a+b);
                }
            } else if(current.equals("-")){
                if(!stack.isEmpty()){
                    int a=stack.pop();
                    int b=stack.pop();
                    stack.push(b-a);
                }
            } else if(current.equals("*")){
                if(!stack.isEmpty()){
                    int a=stack.pop();
                    int b=stack.pop();
                    stack.push(a*b);
                }
            } else if(current.equals("/")){
                if(!stack.isEmpty()){
                    int a=stack.pop();
                    int b=stack.pop();
                    stack.push(b/a);
                }  
            }else{
                int t=Integer.parseInt(current);
                stack.push(t);
            }
        }
        return stack.peek();
    }
}
