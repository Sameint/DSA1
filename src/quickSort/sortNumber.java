package quickSort;

public class sortNumber {
    public static void swap(int[] arr, int i, int j){
        int tem=arr[i];
        arr[i]=arr[j];
        arr[j]=tem;
    }
    public static int partition(int[] arr, int low, int high){
        int pivot=arr[high];
        int i=(low-1);
        for(int j=low;j<=high-1;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return (i+1);
    }
    public static void sort(int[] arr, int low, int high){
        if(low<=high){
            int pi=partition(arr,low,high);
            sort(arr,0,pi-1);
            sort(arr,pi+1,high);
        }
    }
    public static void print(int[] arr,int size){
    for(int i=0;i<=size;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {10, 50, 20, 60, 70, 40, 30, 80};
        int len=arr.length-1;
sort(arr,0,len);
        print(arr,len);

    }
}
