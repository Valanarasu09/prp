import java.util.Scanner;
import java.lang.Math;
class Amstrong{
public static void main(String args[])
{
int n,n1,sum=0,r,n2;
Scanner sc= new Scanner(System.in);
n=sc.nextInt();
n2=n;
n1=(int)(Math.floor(Math.log10(Math.abs(n))))+1;
while(n>0)
{
r=n%10;
sum=sum+(int)(Math.pow(r,n1));
n=n/10;
}
if(sum==n2)
{
System.out.println(n2+" "+"Amstrong number");
}
else
{
System.out.println(n2+" "+"Not Amstrong number");
}
}
}
