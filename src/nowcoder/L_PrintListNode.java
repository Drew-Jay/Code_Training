package nowcoder;

import java.util.ArrayList;
import nowcoder.ListNode;

public class L_PrintListNode {
	/**
	 * 题目描述
	 * 输入一个链表，从尾到头打印链表每个节点的值。
	 */
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		if(listNode == null){
			al.add(null);
			return al;
		}
		while(listNode.next != null){
			al.add(listNode.val);
			listNode = listNode.next;
		}
		al.add(listNode.val);
		for(int i = al.size()-1 ; i>=0 ; i--){
			al2.add(al.get(i));
		}
		return al2;
	}


}
