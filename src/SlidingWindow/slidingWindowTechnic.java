package SlidingWindow;
/*
first 2 consicutic=100+200=300
100+200=300
second 2 consicutic =200+300=500
300-100+300=500
third 3 consicutic =300+400=700
500-200+400=700
*

**/
public class slidingWindowTechnic {
    static int max_Sum(int[]arr,int k,int n){
        int Max_sum=Integer.MIN_VALUE;
        for(int i=0;i<n-k+1;i++){//5-2+1=4
            int sum=0;
            for(int j=0;j<k;j++){
                sum+=arr[i+j];
            }
            Max_sum=Math.max(Max_sum,sum);
        }
        return Max_sum;
    }
    public static void main(String[] args) {
        int[]arr={100,200,300,400};
        int k=2;
        int n=arr.length;
        System.out.println(max_Sum(arr,k,n));
    }
}
