package Loops;

public class recursion {
    static void conquer(int[]a,int l,int m,int h) {
        int[] merged = new int[h-l+1];
        int index1 = l;
        int index2 = m+1;
        int x = 0;
        while (index1 <= m && index2 <= h) {
            if (a[index1] <= a[index2]) {
                merged[x++] = a[index1++];
            } else {
                merged[x++] = a[index2++];
            }
        }
        while (index1 <= m) {
            merged[x++] = a[index1++];
        }
        while (index2 <= h) {
            merged[x++] = a[index2++];
        }
        for(int i=0,j=l;i<merged.length;j++,i++){
            a[j]=merged[i];
        }
    }
    static void divide(int[]a,int l,int h){
        if(l>=h){
            return;
        }
        int m=l+(h-l)/2;
        divide(a,l,m);
        divide(a,m+1,h);
        conquer(a,l,m,h);
    }
    public static void main(String[] args) {
        int[]a={2,5,9,12,48,0,6,4};
        int n=a.length;
        divide(a,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }System.out.println();
    }
}
