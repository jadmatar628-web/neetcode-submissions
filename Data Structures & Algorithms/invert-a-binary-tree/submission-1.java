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
    public TreeNode invertTree(TreeNode root) {
        Queue<TreeNode> queue= new ArrayDeque<>();
        if(root==null){
            return root;
        }
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode d=queue.poll();
            if(d.right!=null){
                queue.offer(d.right);
            }
            if(d.left!=null){
                queue.offer(d.left);
            }
            TreeNode temp=d.left;
            d.left=d.right;
            d.right=temp;

        }
        return root;
    }
}
