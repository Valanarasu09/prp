import java.util.Scanner;
class Digitlen{
static int single(int a)
{
int sum=0,r;
while(a!=0)
{
r=a%10;
sum+=r;
a=a/10;
}
return sum;
}
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
while(n>9)
{
n=single(n);
}
System.out.println(n);
}
}

