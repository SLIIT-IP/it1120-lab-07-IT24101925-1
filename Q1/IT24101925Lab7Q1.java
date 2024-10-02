import java.util.Scanner;
public class IT24101925Lab7Q1{
public static void main(String[]args){
Scanner open=new Scanner(System.in);
int subject1,subject2,subject3,subject4;
double average;
System.out.println("Enter marks foor four subject:");
System.out.print("Enter Subject Mark 1:");
subject1=open.nextInt();
System.out.print("Enter Subject Mark 2:");
subject2=open.nextInt();
System.out.print("Enter Subject Mark 3:");
subject3=open.nextInt();
System.out.print("Enter Subject Mark 4:");
subject4=open.nextInt();
average=(subject1+subject2+subject3+subject4)/4.0;
System.out.println("Average is:"+average);
if(average>=75 && average<=100) {
System.out.println("Grade:Distinction");
}
else if (average>=50 && average<=74) {
System.out.println("Grade:Credit");
}
else if (average>=0 && average<=49) {
System.out.println("Grade:Fail");
}
else {
System.out.println("Invalid marks entered.");
}
open.close();
}
}