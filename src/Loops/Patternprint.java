package Loops;

public class Patternprint {


        static void printPattern(int n){
            printForword(n);
            printReverce(n-1);


        }
        static void printForword(int n){
            for(int i=1;i<=n;i++){
                System.out.print(i+" ");
            }
        }
        static void printReverce(int n){
            for(int i=n;i>=1;i--){
                System.out.print(i+" ");
            }
        }


        public static void main(String[] args) {

           printPattern(6);
        }
    }




