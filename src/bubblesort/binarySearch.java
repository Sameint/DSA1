package bubblesort;

import java.util.Arrays;

public class binarySearch {
    static int binarysearch(int[]arr,int ele){
        int low=0;
        int high=arr.length-1;
        while(low<=high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == ele) {
                return mid;
            } else if (arr[mid] > ele) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
            return -1;
    }
    public static void main(String[] args) {
        int[]arr={2,3,4,5,8,9};
        int t=9;
        Arrays.sort(arr);
System.out.print(binarysearch(arr,t));
        }

    }

