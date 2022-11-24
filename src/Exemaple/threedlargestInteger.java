package Exemaple;

public class threedlargestInteger {
static void find3rdLarjest(int[]arr,int n){
    if(n<3){
        return;
    }
    int max=arr[0];
    for(int i=0;i<arr.length;i++)
        if(arr[i]>max)
            max=arr[i];

    int sec=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++)
        if(arr[i]>sec && arr[i]<max)
            sec=arr[i];

    int thir=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++)
        if(arr[i]>thir && arr[i]<sec)
            thir=arr[i];

    System.out.print(thir);
}
    public static void main(String[] args) {
        int[]arr={10, 9, 15, 75, 67, 84, 4, 3, 100};
        find3rdLarjest(arr,arr.length-1);

    }
}
