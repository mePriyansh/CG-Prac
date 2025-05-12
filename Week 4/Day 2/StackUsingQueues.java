import java.util.LinkedList;
import java.util.Queue;
public class StackUsingQueues {
private Queue<Integer> queue1 = new LinkedList<>();
private Queue<Integer> queue2 = new LinkedList<>();
public void push(int x) {
queue1.add(x);
}
public int pop() {
if (queue1.isEmpty()) {
return -1;
12
}
while (queue1.size() > 1) {
queue2.add(queue1.poll());
}
int top = queue1.poll();
Queue<Integer> temp = queue1;
queue1 = queue2;
queue2 = temp;
return top;
}
public int top() {
if (queue1.isEmpty()) {
return -1;
}
while (queue1.size() > 1) {
queue2.add(queue1.poll());
}
int top = queue1.peek();
queue2.add(queue1.poll());
Queue<Integer> temp = queue1;
queue1 = queue2;
queue2 = temp;
return top;
}
public static void main(String[] args) {
StackUsingQueues stack = new StackUsingQueues();
stack.push(1);
stack.push(2);
stack.push(3);
System.out.println("Top of stack: " + stack.top());
System.out.println("Popped: " + stack.pop());
System.out.println("Top of stack: " + stack.top());
13
}
}