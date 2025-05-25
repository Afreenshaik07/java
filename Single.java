class A
{
void fact()
{
int fact=1,n=5;
for(int i=1;i<=5;i++)
{
fact=fact*i;
}
System.out.println("the factorial of a number is:"+fact);
}
}
class B extends A
{
void even_odd()
{
int n=9;
if(n%2==0)
System.out.println("the given number is even");
else
System.out.println("the given number is odd");
}
}
class Single
{
public static void main(String args[])
{
B obj=new B();
obj.fact();
obj.even_odd();
}
}