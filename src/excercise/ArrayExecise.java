package excercise;

public class ArrayExecise {
    /*
    static void swap(int[] a, int i, int j) {
        int tem = a[i];
        a[i] = a[j];
//        a[j] = tem;
//    }
//static void recursive_String(char []s,int l,int r){
//    if(l<r){
//        char t=s[l];
//s[r]=s[l];
//s[l]=t;
//        recursive_String(s,l+1,r-1);
//    }
//    }


        /*
        int[]a={2,5,30,26,100};// Insertion sort Practice
        for(int i=0;i<a.length;i++){
            int j=i-1;
            int key=a[i];
            while(j>=0 && a[j]>key){
                a[j+1]=a[j];
                j=j-1;
                }
            a[j+1]=key;

            }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        */
/*
        int[] a = {2, 5, 30, 26, 100}; // Bubble sort practice
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length - i; j++) {
                if (a[j] < a[j - 1]) {
                    swap(a, j, j - 1);
                }
                for ( i = 0; i < a.length; i++) {
                    System.out.print(a[i] + " ");
                }
            }
        }

 *//*
        int[] a = {2, 5, 30, 26, 100}; // Find Element at Index
        int flag=0;
        int ser=31;
        for(int i=0;i<a.length;i++){
            if(a[i]==ser){
                flag=1;
                System.out.println("Found No");
                break;
            }
        }
        if(flag==0){
            System.out.print("Not Found");
        }

        int[] a = {2, 5, 30, 26, 100}; //JAVA program to insert an element in an array at a specified index/location
    int no=57;
    int pos=3;
    int len=a.length;
    for(int i=len-1;i>=pos;i--){
        a[i]=a[i+1];
    }
    len=len+1;
    a[pos]=no;
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
            */

//String s="madam";
//for(int i=0;i>s.length();i++) {
//    char[] a=new char[s.length()];
//    recursive_String(a, 0, s.length());

//}


    public static void main(String[] args) {
//int arr1[]={2,3,4,8}; //Merge shot
//int arr2[]={9,10,11,12};
//    int k = 0;
//    int i = 0;
//    int j = 0;
//    int n = arr1.length;
//    int m = arr2.length;
//    int arr3[]=new int[n+m];
//    while (arr1[i] <n && arr2[j]<m){
//        if (arr1[i] <arr2[j]) {
//            arr3[k++] = arr1[i++];
//        } else {
//            arr3[k++] = arr2[j++];
//        }
//    }
//    while (i <n) {
//        arr3[k++] = arr1[i++];
//    }
//    while (j < m) {
//        arr3[k++] = arr2[j++];
//    }
//    for( i=0;i<arr3.length;i++){
//        System.out.print(arr3[i]+" ");
//    }System.out.println();
        int mat[][] = {{1, 0, 0, 1},
                {0, 0, 1, 0},
                {0, 0, 0, 0}};
    int flaf=0;
        for (int i = 0; i < mat.length; i++) {
       for (int j = 0; j < mat[0].length; j++) {
                if ( mat[i][j]==1 || i!=j) {
                    mat[i][j]=1;

                } else {
                    mat[i][j]=0;
                }
                System.out.print(mat[i][j]+ " ");
            }  System.out.println();
        }
//            for (int i = 0; i < mat.length; i++) {
//                for (int j = 0; j < mat[0].length; j++) {
//
//                }
//
//            }
        }
    }


