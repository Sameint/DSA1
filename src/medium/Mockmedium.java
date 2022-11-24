package medium;

import java.util.Arrays;
import java.util.HashMap;

public class Mockmedium {
    static void disticntNum(int[]arr){
        HashMap<Integer,Integer>hm=new HashMap<>();
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],0);
            if(!hm.containsKey(arr[i])){
               hm.getOrDefault(arr[i],0);
               cnt++;
            }
        }
        System.out.println(hm);
    }
    public static void main(String[] args) {
        int[]arr={2,1,3,2};
        int cnt=0;
        Arrays.sort(arr);//1,2,2,3 i=0 j=0 1=
        for(int i=0;i<arr.length-1;i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[i] != arr[j]) {
                    cnt += arr[i];

                }else{
                    continue;
                }
                System.out.println(cnt);
            }

        }

    }
}
