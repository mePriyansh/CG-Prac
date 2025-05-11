import java.util.Stack;
class StackSorter {
public void sort(Stack<Integer> stack) {
if (!stack.isEmpty()) {
int temp = stack.pop();
sort(stack);
insertSorted(stack, temp);
}
}
private void insertSorted(Stack<Integer> stack, int val) {
if (stack.isEmpty() || stack.peek() <= val) {
stack.push(val);
} else {
int temp = stack.pop();
insertSorted(stack, val);
stack.push(temp);
}
}
}