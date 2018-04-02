package nowcoder;

import java.util.ArrayList;
import java.util.LinkedList;

public class T_GetSeqOrder {

    /*
    *题目描述
    * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
    * 层序遍历
    * */
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root){

        ArrayList<Integer> result = new ArrayList<Integer>();

        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();

        TreeNode current = null;

        queue.add(root);
        while(!queue.isEmpty()){
            current = queue.poll();
            result.add(current.val);
            if(current.left!=null){
                queue.offer(current.left);
            }
            if (current.right!= null){
                queue.offer(current.right);
            }

        }

        return result;
    }

    public static void main(String[] args) {

    }
}
