package src;

public class symmetricTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public void  main(String args[]){
    TreeNode node = new TreeNode(1);
    boolean result = isSymmetric(node);
        System.out.println(result);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return true;

        return isMirror(root.left, root.right);


    }

    public static boolean isMirror(TreeNode leftNode, TreeNode rightNode){
        if(leftNode==null && rightNode== null){
            return true;
        }
        if(leftNode== null || rightNode==null){
            return false;
        }
        return leftNode.val==rightNode.val && isMirror(leftNode.left , rightNode.right) && isMirror(leftNode.right, rightNode.left);



    }


}
