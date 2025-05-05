import java.util.Scanner;
class table
{
public static void main(String arg[])
{
int n,cnt;
System.out.println("Enter a number of which to print table");
Scanner obj=new Scanner(System.in);
n=obj.nextInt();
for(cnt=1;cnt<=10;cnt++)
{
System.out.println(cnt*n);
}}}