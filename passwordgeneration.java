import java.util.Scanner;
class Uid{
static String toggle(String s)
{
String s1="";
for(int i=0;i<s.length();i++)
{
if(Character.isUpperCase(s.charAt(i)))
{
s1=s1+Character.toLowerCase(s.charAt(i));
}
else
{
s1=s1+Character.toUpperCase(s.charAt(i));
}
}
return s1;
}
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
String s1 = sc.nextLine();
String s2 = sc.nextLine();
int n1 = sc.nextInt();
int n2 = sc.nextInt();
int s1len=s1.length();
int s2len=s2.length();
String s3="",s4="";
String pin=Integer.toString(n1);
char c=pin.charAt(n2-1);
StringBuffer sb=new StringBuffer(pin);
s4=s4+sb.reverse();
char c1=s4.charAt(n2-1);
if(s1len>s2len)
{
s3=s3+s1.substring(0,1)+s2+c+c1;
System.out.println(toggle(s3));
}
else
{
s3=s3+s2.substring(0,1)+s1+c+c1;
System.out.println(toggle(s3));
}
}
}
