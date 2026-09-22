class MinStack {
        Deque<Integer> stack =new ArrayDeque<>();
        Deque<Integer> minStack =new ArrayDeque<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty()){
            minStack.push(val);
        }else{
            if(val<=minStack.peek()){
                minStack.push(val);
            }else{
                return;
            }
        }
    }
    
    public void pop() {
         if(!stack.isEmpty()){
            if(stack.peek().equals(minStack.peek())){
                minStack.pop();
            }
            stack.pop();
            return;
         }
         return;
    }
    
    public int top() {
         if(!stack.isEmpty()){
            int c=stack.peek();
            return c;
         }
         return -1;
    }
    
    public int getMin() {
        return minStack.peek();
    }
}