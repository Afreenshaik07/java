import java.util.Scanner;
class Arthematic
{
public static void main(String args[])
{
int n1,n2;
Scanner object=new Scanner(System.in);
System.out.print("enter number1:");
n1=object.nextInt();
System.out.print("enter number2:");
n2=object.nextInt();
System.out.print("Addition of two numbers:"+(n1+n2));
System.out.print("Subtraction of two numbers:"+(n1-n2));
System.out.print("Multiplication  of two numbers:"+(n1*n2));
System.out.print("Division of two numbers:"+(n1/n2));
System.out.print("Modulation of two numbers:"+(n1%n2));
}
}


