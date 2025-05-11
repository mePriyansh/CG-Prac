public class FirstLastOccurrence {
public static int[] findFirstAndLast(int[] arr, int target) {
int first = binarySearch(arr, target, true);
int last = binarySearch(arr, target, false);
if (first == -1) {
return new int[]{-1, -1};
}
return new int[]{first, last};
}
private static int binarySearch(int[] arr, int target, boolean
findFirst) {
int left = 0, right = arr.length - 1, result = -1;
while (left <= right) {
int mid = (left + right) / 2;
if (arr[mid] == target) {
result = mid;
if (findFirst) {
right = mid - 1;
} else {
left = mid + 1; }
} else if (arr[mid] < target) {
left = mid + 1;
} else {
right = mid - 1;
}
}
return result;
}
}
