public class subtreeOfAnotherTree {
    //https://leetcode.com/problems/subtree-of-another-tree/description/

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


        public boolean isSubtree(TreeNode root, TreeNode subRoot) {
            if(root==null ){
                return true;
            }

            if(isEqual(root,subRoot)){
                return true;
            }
            return isEqual(root.left, subRoot) || isEqual(root.right, subRoot);
        }
        public boolean isEqual(TreeNode root, TreeNode subRoot){
            if(root == null && subRoot ==null){
                return true;
            }if(root == null || subRoot ==null){
                return false;
            }
            if(root.val != subRoot.val){
                return false;
            }
            return isEqual(root.left,subRoot.left) && isEqual(root.right, subRoot.right);

        }
}
