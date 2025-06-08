interface A
{
void show();
}
interface B extends A
{
void display();
}
class C implements B
{
public void show()
{
System.out.println("i am a show ");
}
public void display()
{
System.out.println("i am a display");
}
}
class Inheritance_of_interface
{
public static void main(String args[])
{
C ob=new C();
ob.show();
ob.display();
}
}