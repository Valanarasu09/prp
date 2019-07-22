import java.util.Scanner;
class Encode{
public static void main(String args[]){
int a[]={35,32,62,68,35,90,132,75,119,168,150,136,127,148,170,137,63,19};
int m= a.length;
int n=a[m-1];
int n1=a[m-2]-n;
int f=0,sum=0;
sum=n+n1;
for(int i=m-3;i>=0;i--)
{
n1=a[i]-n1;
sum=sum+n1;
}
System.out.println(sum);
System.out.println(n1);
}
}
