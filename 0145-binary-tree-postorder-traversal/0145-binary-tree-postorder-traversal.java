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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> lst = new ArrayList<>();

        PostOrder(root , lst);


        return lst;
    }

    public void PostOrder(TreeNode root , List<Integer> lst){
        if(root == null){
            return;
        }

        PostOrder(root.left , lst);
        PostOrder(root.right , lst);
        lst.add(root.val);

    }
}