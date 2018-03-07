package nowcoder;

import nowcoder.TreeNode;

public class GetPostorderTree {
	/**
	 * 题目描述 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
	 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}， 则重建二叉树并返回。
	 * */
	public TreeNode reConstructBinaryTree(int[] pre, int[] in) {

		if (in.length == 0)
			return null;

		TreeNode TN = new TreeNode(pre[0]);
		int pos = 0;

		for (int j = 0; j < in.length; j++) {// 找到根节点位置
			if (pre[0] == in[j]) {
				pos = j;
			}
		}

		int[] left_pre = new int[pos];
		int[] left_in = new int[pos];
		int[] right_pre = new int[in.length - pos - 1];
		int[] right_in = new int[in.length - pos - 1];

		for (int i = 0; i < pos; i++) {// 根节点左子树
			left_pre[i] = pre[i + 1];
			left_in[i] = in[i];
		}

		for (int i = 0; i < in.length - pos - 1; i++) {// 根节点左子树
			right_pre[i] = pre[i + pos+1];
			right_in[i] = in[i + pos+1];
		}

		TN.left = reConstructBinaryTree(left_pre, left_in);
		TN.right = reConstructBinaryTree(right_pre, right_in);

		return TN;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetPostorderTree GPT = new GetPostorderTree();
		 int []pre = {1,2,4,7,3,5,6,8};
		 int []in = {4,7,2,1,5,3,8,6};
//		int[] pre = { 1, 2, 3 };
//		int[] in = { 2, 1, 3 };
		GPT.reConstructBinaryTree(pre, in).getSeqOrder();
	}

}
