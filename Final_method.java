class A
{
final void show()
{
System.out.println("welcome");
}
}
class B extends A
{
{
void show()
{
super.show();
System.out.println("bye");
}
}
}
class  Final_method
{
public static void main(String args[])
{
B ob=new B();
ob.show();
}
}