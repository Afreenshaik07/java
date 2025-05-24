import java.util.Scanner;
class Method
{
void add()
{
int a=10,b=20;
System.out.println("Addition of two numbers:"+(a+b));
}
int add(int a)
{
a=a*a;
return a;
}
float add(int a,float b)
{
b=b+a;
return b;
}
}
class Overloading_method
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Method m1=new Method();
m1.add();
System.out.print("Enter the number:");
int c=sc.nextInt();
System.out.println("Square of a number:"+m1.add(c));
System.out.println("addition of two different data types:"+m1.add(4,10.0f));
}
}
