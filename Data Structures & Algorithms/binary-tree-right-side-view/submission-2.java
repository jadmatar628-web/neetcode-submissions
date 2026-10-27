class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null){ 
        List<Integer> anss= new ArrayList<>();
        return anss;}
        Queue<TreeNode> queue= new ArrayDeque<>();
        queue.offer(root);
        List<Integer> ans= new ArrayList<>();
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode temp=queue.poll();
                if(i==size-1){
                    ans.add(temp.val);
                }
                if(temp.left!=null){
                    queue.offer(temp.left);
                }
                if(temp.right!=null){
                    queue.offer(temp.right);
                }
            }
        }
        return ans;
    }
}