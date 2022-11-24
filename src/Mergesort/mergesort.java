package Mergesort;

public class mergesort {
    static void merge(int[]arr,int l,int m,int h){
        int[]mergeNew=new int[h-l+1];
        int index1=l;
        int index2=m+1;
        int x=0;
        while(index1<=m && index2<=h){
            if(arr[index1]<=arr[index2]){
                mergeNew[x++]=arr[index1++];
            }else{
                mergeNew[x++]=arr[index2++];
            }
        }
        while(index1<=m ){
            mergeNew[x++]=arr[index1++];
        }while(index2<=h){
            mergeNew[x++]=arr[index2++];
        }
        for(int i=0,j=l;i<mergeNew.length;i++,j++){
            arr[j]=mergeNew[i];
        }
    }
    static void divide(int[]arr,int l,int h){
        if(l>=h) {
            return;
        }
            int mid = l+(h-l)/2;
            divide(arr,l,mid);
            divide(arr,mid+1,h);
            merge(arr,l,mid,h);

    }
    static void print(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
    public static void main(String[] args) {
        int[]arr={2,6,8,0,34,5,1};
        int len=arr.length;
                divide(arr,0,len-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }

    }


