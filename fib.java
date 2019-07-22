import java.util.Scanner;
class Fib{
public static void main(String args[])
{
int a=0,b=1,c=0;
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
System.out.print(a+" "+b);
for(int i=2;i<+n;i++)
{
c=a+b;
a=b;
b=c;
System.out.print(" "+c);
}
}
}
