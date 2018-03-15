package nowcoder;

import java.util.ArrayList;
import java.util.LinkedList;

import nowcoder.ListNode;

public class MergeTwoListInOrder {

	/**
	 * 题目描述 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
	 */

	public ListNode Merge(ListNode list1, ListNode list2) {
		if (list1 == null && list2 == null)
			return null;
		if (list1 == null)
			return list2;
		if (list2 == null)
			return list1;

		java.util.Queue<ListNode> q = new java.util.LinkedList<ListNode>();

		while (list1 != null || list2 != null) {
			if(list1 == null){
				while(list2 != null){
					q.offer(list2);
					list2 = list2.next;
				}
				break ;
			}
			
			if(list2 == null){
				while(list1 != null){
					q.offer(list1);
					list2 = list1.next;
				}
				break ;
			}
			
			if (list1.val <= list2.val) {
				q.offer(list1);
				list1 = list1.next;
			} else {
				q.offer(list2);
				list2 = list2.next;
			}
		}

		list1 = q.poll();
		list2 = list1;
		while(!q.isEmpty()){
			list1.next = q.poll();
			list1 = list1.next;
		}
		list1.next = null;
		return list2;
	}

	public void Print(ListNode head) {
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeTwoListInOrder MTLIO = new MergeTwoListInOrder();
		
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(3);
		ListNode c = new ListNode(5);
		ListNode d = new ListNode(7);
		ListNode e = new ListNode(8);

		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = null;

		ListNode w = new ListNode(2);
		ListNode x = new ListNode(4);
		ListNode y = new ListNode(8);
		ListNode z = new ListNode(10);

		w.next = x;
		x.next = y;
		y.next = z;
		z.next = null;
		
		MTLIO.Print(a);
		MTLIO.Print(x);
		
		ListNode aa = MTLIO.Merge(a, x);
		
		MTLIO.Print(aa);
	}

}
