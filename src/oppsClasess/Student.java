package oppsClasess;

import java.sql.SQLOutput;

public class Student {
    String name;
    int rollNumber;
    char grade;
    int standerd;
  public  Student( String n,int r,char g,int s){
       name =n;
       rollNumber =r;
        grade= g;
       standerd =s;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Mohit", 1245, 'B',2);
      System.out.println("Person Details");
        System.out.println("Name="+s1.name);
System.out.println("RollNumber="+s1.rollNumber);
        System.out.println("Grade="+s1.grade);
        System.out.println("Standerd="+s1.standerd);
}
}