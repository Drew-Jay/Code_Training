package nowcoder;

import nowcoder.ListNode;

public class FindKthToTail {

	/**题目描述
	 * 输入一个链表，输出该链表中倒数第k个结点
	 */
	public ListNode findKthToTail(ListNode head,int k){		
		if(head == null)
			return null;
		int cnt=1;

		ListNode find = head;
		while(find.next != null){
			find = find.next;
			cnt++;
		}
			System.out.println(cnt);
			if(k>cnt)return null;
			find = head;
		for(int i=1 ; i<cnt-k+1 ; i++){
			find = find.next;
		}
		
		return find;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindKthToTail FKTT = new FindKthToTail();
		
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
		
		System.out.println(FKTT.findKthToTail(a, 2).val);
	}

}
