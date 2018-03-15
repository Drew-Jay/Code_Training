package nowcoder;

import nowcoder.ListNode;
import java.util.Stack;

public class ReverseList {

	/**
	 * 题目描述
	 * 输入一个链表，反转链表后，输出链表的所有元素。
	 */
	
	public ListNode reverseList(ListNode head){
		if(head == null)
			return null;
		Stack<ListNode> stack = new Stack<ListNode>();
		ListNode find = head;
		while(find != null){
			stack.push(find);
			find = find.next;
		}
			find = stack.pop();
			head = find;
		while(!stack.isEmpty()){
			find.next = stack.pop();
			find = find.next;
			
		}
			find.next = null;
		return head;
	}
	
	public void Print(ListNode head){
		while(head != null){
			System.out.print(head.val + " ");
			head = head.next;
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseList RL = new ReverseList();
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		ListNode d = new ListNode(4);
		ListNode e = new ListNode(5);
		
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = null;
		
		RL.Print(a);
		
		ListNode aa = RL.reverseList(a);
		
		RL.Print(aa);
	}

}
