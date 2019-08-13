import java.util.Scanner;
class Digitlen{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
int sq=n*n;
String s=Integer.toString(sq);
int len=s.length();
int m=len/2;
if(len%2!=0)
{
System.out.println("NO");
}
else
{
String s1=s.substring(0,m);
String s2=s.substring(m);
int m1=Integer.parseInt(s1);
int n1=Integer.parseInt(s2);
if(m1+n1==n)
{
System.out.println("Yes");
}
else
{
System.out.println("No");
}
}
}
}


