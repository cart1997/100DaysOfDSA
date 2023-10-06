

public class BST {

    public class TreeNode {
      int val;
      TreeNode previous;
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

    TreeNode prev;
    public boolean isValidBST(TreeNode root) {

        prev =null;
        return inorder(root);

    }
    private boolean inorder(TreeNode root){

        if(root == null) return true;
        if(inorder(root.left)==false)return false;
        if( prev != null && root.val <= prev.val) return false;

        prev = root;
        return inorder(root.right);

    }
    public static void main(String[] args) {

    }

}
