/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null){
            List<List<Integer>> t=new LinkedList();
            return t;
        }
        List<List<Integer>> ans=new LinkedList<>();
        Queue<TreeNode> queue=new ArrayDeque<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> temp=new LinkedList<>();
            for(int i=0;i<size;i++){
                TreeNode s=queue.poll();
                temp.add(s.val);
                if(s.left!=null) queue.offer(s.left);
                if(s.right!=null) queue.offer(s.right);
            }
            ans.add(temp);
        }
        return ans;
    }
}
