import java.util.LinkedList;
import java.util.Queue;
public class ReverseQueue {
public static void reverseQueue(Queue<Integer> queue) {
if (queue.isEmpty()) {
return;
}
int front = queue.poll();
reverseQueue(queue);
queue.add(front);
}
9
public static void main(String[] args) {
Queue<Integer> queue = new LinkedList<>();
queue.add(10);
queue.add(20);
queue.add(30);
System.out.println("Original Queue: " + queue);
reverseQueue(queue);
System.out.println("Reversed Queue: " + queue);
}
}
