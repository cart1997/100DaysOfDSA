import javax.swing.tree.TreeNode;

public class BST {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
    }
    public boolean isValidBST(TreeNode root) {

        inorder(root);
        return true;
    }
    private void inorder(TreeNode root){
        if(root == null) return;

        inorder(root.left);

        inorder(root.right);

    }
    public static void main(String[] args) {

    }

}
