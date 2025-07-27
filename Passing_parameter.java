class A
{
void swap(int a,int b)
{
int temp=a;
a=b;
b=temp;
System.out.println("After swpping value of a and b is"+a+","+b);
}
}
class Passing_parameter
{
public static void main(String args[])
{
A ob=new A();
int a=10,b=20;
System.out.println("value of a and b is"+a+","+b);
ob.swap(a,b);
//System.out.println("After swpping value of a and b is"+a+","+b);
}
}
















