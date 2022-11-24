package Loops;

public class InsetionSort {
    /*
        static void insersort1(int[]arr){
        for(int i=1;i<arr.length;i++){
            for(int j=i-1;j>=0;j--){
                if(isRight(arr,j,j+1)){
                    swap(arr,j,j+1);
                }

            }
        }
    }
    static void swap(int[]arr,int i,int j){
        int tem=arr[i];
        arr[i]=arr[j];
        arr[j]=tem;
    }
    static boolean isRight(int[]arr,int i,int j){
        if(arr[i]>arr[j]){
            return true;
        }else{
            return false;
        }
    }
    /*

     */
    static void inserTion2(int[]arr){
for(int i=0;i<arr.length;i++){
    int j=i-1;
    int key=arr[i];
    while(j>=0 && arr[j]>key){
        arr[j+1]=arr[j];
        j=j-1;
    }
    arr[j+1]=key;
}
    }

    static void printArray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int [] arr=new int[]{10,5,8,7,6,9,4,3,2,1};
        int [] arr1=new int[]{9,8,5,6,7,};
        InsetionSort  sc=new InsetionSort ();
        sc.inserTion2(arr);
        printArray(arr);
        System.out.println();
        sc.inserTion2(arr1);
        printArray(arr1);

    }
}
