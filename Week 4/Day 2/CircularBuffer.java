import java.util.LinkedList;
import java.util.Queue;
public class CircularBuffer {
private int size;
private Queue<Integer> buffer;
public CircularBuffer(int size) {
this.size = size;
this.buffer = new LinkedList<>();
}
public void insert(int value) {
if (buffer.size() == size) {
buffer.poll();
}
buffer.add(value);
}
public void displayBuffer() {
System.out.println(buffer);
}
public static void main(String[] args) {
CircularBuffer buffer = new CircularBuffer(3);
14
buffer.insert(1);
buffer.insert(2);
buffer.insert(3);
buffer.displayBuffer();
buffer.insert(4);
buffer.displayBuffer();
}
}
