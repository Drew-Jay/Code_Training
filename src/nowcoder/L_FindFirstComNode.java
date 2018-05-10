package nowcoder;

import java.util.HashMap;

public class L_FindFirstComNode {

    /**
     * 输入两个链表，找出它们的第一个公共结点。
     */

    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null) return null;

        HashMap map = new HashMap();
        ListNode temp = pHead1;
        while (temp != null) {
            map.put(temp.val, temp);
            temp = temp.next;
        }
        temp = pHead2;
        while (temp != null) {
            int val = temp.val;
            if (map.get(val) == temp)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    public static void main(String[] args) {
        L_FindFirstComNode main = new L_FindFirstComNode();

        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        ListNode f = new ListNode(6);
        ListNode g = new ListNode(7);
        ListNode h = new ListNode(8);
        ListNode i = new ListNode(9);
        ListNode j = new ListNode(10);


        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;

        j.next = i;
        i.next = h;
        h.next = g;
        g.next = e;

        ListNode result = main.FindFirstCommonNode(a, j);
        if (result == null)
            System.out.println("null");
        else
            System.out.println(result.val);
    }
}
