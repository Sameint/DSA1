package Loops;

public class BinarySort {

    static void binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                System.out.print(mid);
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.print(-1);
    }

    static void swap(int[] arr, int j, int i) {
        int tem = arr[i];
        arr[i] = arr[j];
        arr[j] = tem;
    }

    static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);

                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 3, 2, 4};

        for (int i = 0; i < arr.length - 1; i++) {
            sortArray(arr);
            System.out.print(arr[2]);
break;
        }
    }
}
