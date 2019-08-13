import java.util.Scanner;
class Kaprekar{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
int sq=n*n;
System.out.println(sq);
String s=Integer.toString(sq);
int len=s.length();
int m=len/2;
String s1=s.substring(0,m);
System.out.println(s1);
String s2=s.substring(m);
System.out.println(s2);
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
