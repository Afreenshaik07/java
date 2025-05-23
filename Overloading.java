import java.util.Scanner;
class Student
{
int count=0,n;
Student(int a)
{
for(int i=2;i<=n;i++)
{
if(n%i==0)
{
count=count+1;
}
}
if(count==2)
{
System.out.println("prime");
}
else
{
System.out.println("not prime");
}
}
Student(int a,int b)
{
System.out.println("addition :"+(a+b));
}
Student(int a,int b,int c)
{
System.out.println("Addition of the numbers:"+(a+b+c));
}
}
class Overloading
{
public static void main(String args[])
{
int a,b,c;
Scanner ob=new Scanner(System.in);
System.out.println("enter number");
a=ob.nextInt();
System.out.println("Enter number to check prime or not");
b=ob.nextInt();
System.out.println("enter another number");
c=ob.nextInt();
Student s1=new Student(b);
Student s2=new Student(a,b);
Student s3=new Student(a,b,c);
}
}