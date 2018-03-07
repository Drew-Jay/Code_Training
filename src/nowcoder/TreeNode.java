package nowcoder;

import java.util.LinkedList;

public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) {
		val = x;
	}
	
	public void getSeqOrder(){
		
		LinkedList<TreeNode> queue = new LinkedList<TreeNode>();  
	      TreeNode current = null;  
	      queue.offer(this);//将根节点入队  
	      while(!queue.isEmpty())  
	      {  
	          current = queue.poll();//出队队头元素并访问  
	          System.out.println(current.val);  
	          if(current.left != null)//如果当前节点的左节点不为空入队  
	          {  
	              queue.offer(current.left);  
	          }  
	          if(current.right != null)//如果当前节点的右节点不为空，把右节点入队  
	          {  
	              queue.offer(current.right);  
	          }  
	      
		}
	}
}
