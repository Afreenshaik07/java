import java.util.Scanner;
class Student
{
String name;
void read()
{
System.out.println(name +"is reading");
}
}
class Example
{
public static void main(String args[])
{
Scanner ob=new Scanner(System.in);
System.out.print("enter the name:");
Student s1=new Student();
s1.name=ob.nextLine();
s1.read();
}
}