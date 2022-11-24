
package Loops;
import java.util.Arrays;
public class LinearBinarySerch {

    public static void main(String[] args) {

        int[][] arr = new int[][]{{3, 4}, {7, 6}};
        int row=0,col=arr.length;

        for (int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr.length; j++) {
                int tem = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = tem;
            }
            for ( i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i != j) {
                    int temp = arr[0][0];
                    arr[0][0] = arr[1][1];
                    arr[1][1] = temp;
                }
            }
            for (i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[j][i] + " ");
                } System.out.println();
            }

        }

        }
    }
