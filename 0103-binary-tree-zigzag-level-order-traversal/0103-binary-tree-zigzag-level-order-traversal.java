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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> lst = new ArrayList<>();
        if(root == null){
            return lst;
        }
        

        Queue<TreeNode> que = new LinkedList<>();

        que.offer(root);

        boolean flag = true;

        while(!que.isEmpty()){
            int size = que.size();
            List<Integer> current = new ArrayList<>();
            for(int i = 0  ; i < size ; i++){
                TreeNode node = que.poll();

                current.add(node.val);

                if(node.left != null){
                    que.offer(node.left);
                }

                if(node.right != null){
                    que.offer(node.right);
                }
            }

            if(!flag){
                Collections.reverse(current);

            }

            lst.add(current);

            flag = !flag;
        }

        return lst;
    }
}