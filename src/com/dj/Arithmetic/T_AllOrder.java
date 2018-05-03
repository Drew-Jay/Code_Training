package com.dj.Arithmetic;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class T_AllOrder {

    /**
     * 前序遍历递归算法
     * @param root
     */
    public void PreOrder(TreeNode root){
        if(root == null)    return ;
        System.out.print(root.val + " ");
        PreOrder(root.left);
        PreOrder(root.right);
    }

    /**
     * 非递归前序遍历算法
     * @param root
     */
    public void PreOrderWithoutRecursion(TreeNode root){
        if(root == null)    return ;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;
        while(p!=null || !stack.isEmpty()){
            while(p!=null){
                System.out.print(p.val + " ");
                stack.push(p);
                p = p.left;
            }
            if(!stack.isEmpty()){
                p = stack.pop();
                p = p.right;
            }
        }
    }


    /**
     * 中序遍历递归算法
     * @param root
     */
    public void InOrder(TreeNode root){
        if(root == null)    return ;
        InOrder(root.left);
        System.out.print(root.val + " ");
        InOrder(root.right);
    }

    /**
     * 非递归中序遍历算法
     * @param root
     */
    public void InOrderWithoutRecursion(TreeNode root) {
        if(root == null)    return ;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode temp = root;
        while(temp!=null || !stack.isEmpty()){
            while(temp!=null){
                stack.push(temp);
                temp = temp.left;
            }
            if(!stack.isEmpty()){
                temp = stack.pop();
                System.out.print(temp.val + " ");
                temp = temp.right;
            }
        }
    }


    /**
     * 后序遍历递归算法
     * @param root
     */
    public void PostOrder(TreeNode root){
        if(root == null)    return ;
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(root.val + " ");
    }


    /**
     * 非递归后序遍历算法
     * @param root
     */
    public void PostOrderWithoutRecursion(TreeNode root){
        if(root == null)    return ;
        Stack<TreeNode> stack = new Stack<>();
        Stack<TreeNode> output = new Stack<>();
        TreeNode p = root;
        while(p != null || !stack.isEmpty()){
           if(p != null){
               stack.push(p);
               output.push(p);
               p = p.right;
           }
           else{
               p = stack.pop();
               p = p.left;
           }
        }

        while(!output.isEmpty()){
            System.out.print(output.pop().val + " ");
        }
    }

    /**
     *
     * 层序遍历非递归算法
     * @param root
     */
    public void SeqOrder(TreeNode root){
        if(root == null)    return ;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);

        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            System.out.print(temp.val + " ");
            if (temp.left != null)
                queue.offer(temp.left);
            if (temp.right != null)
                queue.offer(temp.right);
        }

    }

    public static void main(String[] args) {
        T_AllOrder ao = new T_AllOrder();

        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);

        a.left = b;
        a.right = d;

        b.right = c;

        d.right = e;

        e.left = f;


//        ao.PreOrder(a);
//        System.out.println();
//
//        ao.PreOrderWithoutRecursion(a);
//        System.out.println();

//        ao.InOrder(a);
//        System.out.println();
//
//        ao.InOrderWithoutRecursion(a);
//        System.out.println();

//        ao.PostOrder(a);
//        System.out.println();
        ao.PostOrderWithoutRecursion(a);
        System.out.println();
//
//        ao.SeqOrder(a);
//        System.out.println();
    }
}
