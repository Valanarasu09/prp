import java.util.Scanner;
class Occ{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
int i,j=0,temp,r;
int arr[]=new int[n];
int arr1[]=new int[100];
for(i=0;i<n;i++)
{
 arr[i]=sc.nextInt();
 temp=arr[i];
while(temp!=0)
{
r=temp%10;
arr1[j]=r;
j=j+1;
temp=temp/10;
}
}
int co[] = new int[] {0,0,0,0,0,0,0,0,0,0};
for(i=0;i<j;i++)
{
co[arr1[i]]=co[arr1[i]]+1;
}
for(i=0;i<co.length;i++)
{
System.out.println(i+""+"Occurs " + co[i] +" times");
}
}
}
