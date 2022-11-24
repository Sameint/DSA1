package Mock1;

import java.util.HashMap;

public class mock1 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
       int b=nums[i]-target;
       if(hm.containsKey(b)){
           hm.put(i,i-1);
         }else{
           hm.put(nums[i],0);
        }
        }
        for(int i:hm.keySet()){
            System.out.print(i);
        }

    }
}
