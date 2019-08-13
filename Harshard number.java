import java.util.Scanner;
class Harshard{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int n1;
int sum=0,r;
n1=n;
while(n!=0)
{
r=n%10;
sum=sum+r;
n=n/10;
}
if(n1<=9 || n1%sum==0)
{
System.out.println("Harshad Number");
}
else
{
System.out.println("Not a harshad Number");
}
}
}
