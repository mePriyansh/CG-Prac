import java.util.HashSet;
class PairWithGivenSum {
public boolean hasPairWithSum(int[] arr, int target) {
HashSet<Integer> set = new HashSet<>();
for (int num : arr) {
if (set.contains(target - num)) {
return true;
}
set.add(num);
}
return false;
}
}
