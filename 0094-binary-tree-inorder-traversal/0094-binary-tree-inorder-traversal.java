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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> lst = new ArrayList<>();

        Inorder(root , lst);

        return lst;
        

        
    }
    
 public void Inorder(TreeNode root , List<Integer> lst){
        if(root == null){
            return;
        }

        Inorder(root.left , lst);

        lst.add(root.val);

        Inorder(root.right , lst);
}
}
