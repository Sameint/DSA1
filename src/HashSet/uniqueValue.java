package HashSet;
import java.util.*;
import java.util.HashMap;
import java.util.Scanner;
public class uniqueValue {
    /*
    static int uniqueStrings(String[] arr){
        HashSet<String> hs = new HashSet<>();

        // Pushing each element to the set, to remove duplicates.
        for(int i=0; i<arr.length;i++){
            hs.add(arr[i]);
        }

        System.out.println(hs);

        return hs.size();
    }
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];

        for(int i=0; i<n;i++){
            arr[i] =  sc.next();
        }
        //int ans = uniqueStrings(arr);
      //  System.out.println(ans);
    }
}