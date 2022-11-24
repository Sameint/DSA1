package shorting;

import java.util.Scanner;

// Mock Interview
public class bubble {

    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n-1];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int l=arr.length;
        int sum=(l+1)*(l+2)/2;
        for(int i=0;i<arr.length;i++){
            sum-=arr[i];

        }
        System.out.print(sum);
    }
}