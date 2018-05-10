package nowcoder;
public class T_IsBalanced {
    public boolean IsBalanced_Solution(TreeNode root) {
        if(root ==null)
            return true;
        int left = getDepth(root.left);
        int right = getDepth(root.left);
        if(left -right>1 || left -right<-1){
            return false;
        }

        return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
    }

    public int getDepth(TreeNode root){
        if(root ==null)
            return 0;
        else
            return Math.max(getDepth(root.left),getDepth(root.right))+1;

    }
    public static void main(String[] args) {

    }
}
