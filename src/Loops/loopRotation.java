package Loops;

public class loopRotation {
    static void swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void rotation(int[]arr){
        int mid=arr.length/2;
        for(int i=0;i<mid+1;i++){
           if(arr[i]>arr[mid-2]) {

               swap(arr,i,i+1);
           }

           }
        }
        static void printArray(int[]arr) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
            }
        }
    public static void main(String[] args) {
        int[]arr=new int[]{1,2,3,4,5};
        rotation(arr);
        printArray(arr);
    }
}
