class Solution {

    int maxi = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        MaxPath(root);
        return maxi;
    }

    public int MaxPath(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left =  Math.max(0 , MaxPath(node.left));
        int right = Math.max(0 , MaxPath(node.right));

        
        maxi = Math.max(maxi, node.val + left + right);

        
        return node.val + Math.max(left, right);
    }
}