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
        Stack<TreeNode> stack = new Stack();
        TreeNode temp = root;
        List<Integer> list = new ArrayList<>();
        while (root != null || !stack.isEmpty()){

            while(root != null){
                stack.push(root);
                root = root.left;
            }
                root = stack.pop();
                list.add(root.val);
                root= root.right;
            
        }


        return list;
    }
}