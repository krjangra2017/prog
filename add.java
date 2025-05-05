import java.util.Scanner;
class add 
{
public static void main(String arg[])
{
int a;
int r;
int n;
int add=0;
System.out.println("Enter a number for sum of its digits:"); 
Scanner obj=new Scanner(System.in);
n=obj.nextInt();
a=n;
while(a>0)
{
r=a%10;
add=add+r;
a=a-r;
a=a/10;
}
System.out.println("Sum of digits of "+n+ " is " + add);
}
}
