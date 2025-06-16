class A
{
void show()
{
System.out.println("I am parent class");
}
}
class B extends A
{
void show()
{
super.show();
System.out.println("I am a child class");
}
}
class Overiding
{
public static void main(String args[])
{
B ob=new B();
ob.show();
}
}