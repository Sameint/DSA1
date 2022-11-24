package string;
import java.util.Scanner;
public class palindrome {

    static boolean isPalindrome(String str) {
        int ptr1 = 0, ptr2 = str.length() - 1;
        while (ptr1 < ptr2) {
            char a = str.charAt(ptr1);
            char b = str.charAt(ptr2);
            if (a == b) {
                ptr1++;
                ptr2--;
            } else {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       String n=sc.nextLine();
       System.out.print(isPalindrome(n));
        }
    }

