package string;

public class LeetcodeIsSubsequence {
    public static boolean isSubsequence(String s, String t) {

        int n = s.length();
        int m = t.length();

        int ptr1 = 0;
        int ptr2 =0;

        while(ptr1<m && ptr2<n){
            char cs = s.charAt(ptr2);
            char ct = t.charAt(ptr1);

            if(cs==ct){
                ptr1++;
                ptr2++;
            }
            else{
                ptr1++;
            }
        }

        return ptr2==n;
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc","ahbgdc"));
        System.out.println(isSubsequence("adg", "ahbgdc"));
    }
}