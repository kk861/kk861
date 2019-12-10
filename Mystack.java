import java.util.LinkedList;
import java.util.Queue;
class Mystack {
    private Queue<Integer> a;//输入队列
    private Queue<Integer> b;//输出队列
    public Mystack() {
        a = new LinkedList<>();
        b = new LinkedList<>();
    }
    public void push(int x) {
        a.add(x);
        while(!b.isEmpty()){
            a.add(b.poll());
        }
        Queue temp = a;
        a = b;
        b = temp;
    }
    public int pop() {
        return b.poll();
    }
    public int top() {
        return b.peek();
    }
    public boolean empty() {
        return b.isEmpty();
    }
}
