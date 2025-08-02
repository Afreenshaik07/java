import java.util.Scanner;
class Logical
{
public static void main(String args[])
{
int n1,n2,n3;
Scanner object=new Scanner(System.in);
System.out.print("Enter number1");
n1=object.nextInt();
System.out.print("enter number2");
n2=object.nextInt();
System.out.println("enter number3");
n3=object.nextInt();
if((n1>n2)&&(n1>n3))
System.out.print("largest number is n1:"+n1);
if((n1==0)||(n1%2==0))
System.out.println("n1 is a even number"+n1);
System.out.println(!(n1>n2));
}
}