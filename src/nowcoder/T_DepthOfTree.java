package nowcoder;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class T_DepthOfTree {
    /**
     *输入一棵二叉树，求该树的深度。
     *从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
     */
    public int TreeDepth(TreeNode root) {
        if(root==null) return 0;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        int depth = 0;
        int count = 0;
        int nextCount = 1;                  //记录本层节点的数目，根节点只有1
        while(!queue.isEmpty()){
            TreeNode p = queue.poll();
            count++;
            if(p.left!=null){
                queue.offer(p.left);
            }
            if(p.right!=null){
                queue.offer(p.right);
            }
            if(count==nextCount){           //当出队列的个数等于本层节点的数目，队列中存在的是下一层节点数
                nextCount = queue.size();   //更新本层的节点数
                depth++;                    //切换层数
                count = 0;
            }
        }
        return depth;
    }

    public static void main(String[] args) {

    }
}
