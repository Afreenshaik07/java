interface A
{
void show();
void display();
}
class B implements A
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
class Interface123
{
public static void main(String args[])
{
B ob=new B();
ob.show();
ob.display();
}
}