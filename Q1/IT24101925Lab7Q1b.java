import java.util.Scanner;
public class IT24101925Lab7Q1b{
public static void main(String[]args){
Scanner open=new Scanner(System.in);
for(int student=1; student<=3; student++){
System.out.println("Student"+student);
System.out.print("Enter marks:");
String input =open.nextLine();
String[] marksArray=input.split(" ");
int subject1=Integer.parseInt(marksArray[0]);
int subject2=Integer.parseInt(marksArray[1]);
int subject3=Integer.parseInt(marksArray[2]);
int subject4=Integer.parseInt(marksArray[3]);
double average=(subject1+subject2+subject3+subject4)/4.0;
System.out.println("Average marks for student"+student+ ":" +average);
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
System.out.println();
}
open.close();
}
}