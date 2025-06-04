class A
{
final int a=10;
}
class Final_variable
{
public static void main(String args[])
{
A ob=new A();
ob.a=ob.a+1;
System.out.println("the values of a is:"+ob.a);
}
}