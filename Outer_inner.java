class Outerclass
{
void display()
{
System.out.println("this is outer class");
}
class Inner_class
{
void show()
{
System.out.println("this is inner class");
}
}
}
class Outer_inner
{
public static void main(String args[])
{
Outerclass ob=new Outerclass();
ob.display();
Outerclass.Inner_class ob1=ob.new Innner_class();
ob1.show();
}
}