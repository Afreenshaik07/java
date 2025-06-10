interface A
{
void show();
}
interface B
{
void display();
}
class C implements A,B
{
public void show()
{
System.out.println("i am a show method from interface");
}
public void display()
{
System.out.println("i am a display method from interface");
}
}
class Minterface
{
public static void main(String args[])
{
C ob=new C();
ob.show();
ob.display();
}
}