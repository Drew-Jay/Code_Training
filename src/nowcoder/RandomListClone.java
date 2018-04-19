package nowcoder;

import java.util.HashMap;

public class RandomListClone {
    public static RandomListNode Clone(RandomListNode pHead) {
        if(pHead == null)   return null;
        HashMap<RandomListNode,RandomListNode> map = new HashMap<RandomListNode,RandomListNode>();

        RandomListNode current = pHead;
        RandomListNode temp = new RandomListNode(current.label);
        RandomListNode result  = temp;
        RandomListNode p = result;
        map.put(current,temp);
        current = current.next;

        while(current != null){
            temp = new RandomListNode(current.label);
            p.next = temp;
            map.put(current,temp);
            current = current.next;
            p = p.next;
        }
        p.next = null;

        current = result;
        while(pHead != null){
            if(pHead.random!=null) {
                temp = map.get(pHead.random);
                current.random = temp;
            }
            pHead = pHead.next;
            current = current.next;
        }

        return result;
    }

    public static void main(String[] args) {
        RandomListNode a = new RandomListNode(1);
        RandomListNode b = new RandomListNode(2);
        RandomListNode c = new RandomListNode(3);
        RandomListNode d = new RandomListNode(4);
        RandomListNode e = new RandomListNode(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;

        a.random = d;
        c.random = e;

        RandomListNode result = Clone(a);
    }
}
