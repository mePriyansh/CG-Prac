public class PeakElement {
public static int findPeak(int[] arr) {
int left = 0;
int right = arr.length - 1;
while (left <= right) {
int mid = (left + right) / 2;
if (mid > 0 && mid < arr.length - 1) {
if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
return arr[mid]; // Peak element
} else if (arr[mid] < arr[mid - 1]) {
right = mid - 1;
} else {
left = mid + 1;
}
} else if (mid == 0 || mid == arr.length - 1) {
return arr[mid];
}
}
return -1;
}
}
