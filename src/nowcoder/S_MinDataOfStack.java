package nowcoder;

import java.util.Stack;

public class S_MinDataOfStack {
    /**
     * 题目描述
     * 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
     */
    //store min in every push
    public Stack<Integer> minNum;
    //store real data
    public Stack<Integer> data;

    public void push(int node) {
        data.push(node);
        if (minNum.size() == 0 || node <= minNum.peek().intValue()) {
            minNum.push(node);
        } else {
            minNum.push(minNum.peek().intValue());
        }

    }

    public void pop() {
        if (minNum.size() > 0 && data.size() > 0) {
            minNum.pop();
            data.pop();
        }
    }

    public int top() {

        return minNum.peek().intValue();
    }

    public int min() {
        return minNum.peek().intValue();
    }
}
