import java.util.Scanner;
class Pro{
static String split(String m){
String temp[] = m.split(" ");
String s1 ="";
int r,sum=0,c;
for(String w:temp)
{
c = w.length();
if(c>9){
while(c!=0)
{
r=c%10;
sum=sum+r;
c=c/10;
}
s1=s1+sum;
}
else{
s1=s1+c;
}
}
return s1;
}
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
String s = sc.nextLine();
System.out.println(split(s));
}
}
