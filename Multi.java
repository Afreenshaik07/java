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
class C extends B
{
void prime()
{
int count=0;
int n=7;
for(int i=1;i<=n;i++)
{
if(n%i==0)
count++;
}
if(count==2)
System.out.println("the given number is prime");
else
System.out.println("the given number is not prime");
}
}
class Multi
{
public static void main(String args[])
{
C ob=new C();
ob.fact();
ob.even_odd();
ob.prime();
}
}