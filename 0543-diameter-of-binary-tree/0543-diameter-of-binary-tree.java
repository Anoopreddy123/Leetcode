class Solution {
    private int res = 0;  // Declare res as an instance variable

    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = height(root.left);
        int right = height(root.right);

        // Update the diameter if the current path is the longest found
        this.res = Math.max(this.res, left + right);

        // Return the height of the current node
        return 1 + Math.max(left, right);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        this.res = 0;  // Reset res each time diameterOfBinaryTree is called
        height(root);
        return this.res;
    }
}
