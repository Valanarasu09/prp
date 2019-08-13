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
int temp1,k;
for(i=0;i<j;i++)
{
for(k=i+1;k<j;k++)
{
if(arr1[i]<arr1[k])
{
temp1=arr1[i];
arr1[i]=arr1[k];
arr1[k]=temp1;
}
}
}

int visit=-1;
int co[]=new int[50];
for(i=0;i<j;i++)
{
int count=1;
for(k=i+1;k<j;k++)
{
if(arr1[i]==arr1[k])
{
  co[k]=visit;
count++;
}
}
if(co[i]!=visit)
{
co[i]=count;
}
}

 for(i=j-1;i>=0;i--)
{
if(co[i]!=visit)
{
System.out.println(arr1[i]+"||"+co[i]);
}
}
}
}
