import java.util.Scanner;
class si
{
public static void main(String arg[])
{
float p,r,t,i;
Scanner obj=new Scanner(System.in);
System.out.println("Enter Principal:");
p=obj.nextFloat();
System.out.println("Enter Rate:");
r=obj.nextFloat();
System.out.println("Enter Time");
t=obj.nextFloat();
i=(p*r*t)/100;
System.out.println("Simple Interest is "+i);
}
}

