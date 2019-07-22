import java.util.Scanner;
class Palindrome{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
int n1,r,sum=0;
n1=n;
while(n>0)
{
r=n%10;
sum=sum*10+r;
n=n/10;
}
if(sum==n1)
{
System.out.println(n1+" "+"Palindrome");
}
else
{
System.out.println(n1+" "+"Not a Palindrome");
}
}
}
