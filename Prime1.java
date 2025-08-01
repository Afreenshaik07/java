import java.util.Scanner;
class Prime1
{
public static void main(String args[])
{
Scanner object=new Scanner(System.in);
int a,i,j,count=0;
System.out.println("enter a number ");
a=object.nextInt();
for(i=1;i<=a;i++)
{
count=0;
for(j=1 .;j<=a;j++)
{
if(i%j==0)
{
count++;
}
}
if(count==2)
{
System.out.println(i);
}
}
}
}















