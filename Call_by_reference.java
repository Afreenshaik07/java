class A
{
void swap(B ob)
{
int temp=ob.a;
 ob.b=ob.a;
 ob.a=temp;
}
}
class B
{
int a,b;
}
class Call_by_reference
{
public static void main(String args[])
{
B ob=new B();
A ob1=new A();
ob.a=60,ob.b=20;
System.out.println("Before swapping value of a and b is"+ob.a+","+ob.b);
ob1.swap(a,b);
System.out.println("After swapping value of a and b is"+ob.a+","+ob.b);
}
}


