import java.util.*;
class SlidingWindowMax {
public int[] maxSlidingWindow(int[] nums, int k) {
Deque<Integer> deque = new ArrayDeque<>();
int[] res = new int[nums.length - k + 1];
int ri = 0;
for (int i = 0; i < nums.length; i++) {
while (!deque.isEmpty() && deque.peek() < i - k + 1)
deque.poll();
while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i])
deque.pollLast();
deque.offer(i);
if (i >= k - 1)
res[ri++] = nums[deque.peek()];
}
return res;
}
}