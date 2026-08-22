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
        List<List<Integer>> lst = new ArrayList<>();

        Queue<TreeNode> que = new LinkedList<>();

        if(root == null){
            return lst;
        }

        que.offer(root);
        while(!que.isEmpty()){
            int level = que.size();
            List<Integer> currnode = new ArrayList<>();
            for(int i = 0 ; i < level ; i++){
                TreeNode curr = que.poll();
                currnode.add(curr.val);
                if(curr.left != null){
                    que.offer(curr.left);
                }   
                if(curr.right != null){
                    que.offer(curr.right);
                }
            }

            lst.add(currnode);

        }

        return lst;

        
    }
}