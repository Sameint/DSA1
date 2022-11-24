package string;
import java.util.Arrays;
public class leetcodeTheFindedifferent {

    static char charChange(String s,String t){
 char[]arr1=s.toCharArray();
        char[]arr2=t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                return arr2[i];
            }

        }
        return arr2[arr2.length-1];
    }
    static char finddiffrence(String s,String t){
        int sum1=computeString(s);
        int sum2=computeString(t);
        int diff=sum1-sum2;
        return (char)diff;
    }
    static int computeString(String s){
        int sum=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            sum+=c;
        }
        return sum;
    }
    public static void main(String[] args) {
        String s = "abdc";
        String t = "abcde";
System.out.println(charChange(s,t));
    }
}