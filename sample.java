import java.util.Scanner;
public class Main
{
    static String rev(String s3)
    {
        StringBuffer sbf = new StringBuffer(s3);
        return sbf.reverse()+"";
    }
    
	static String fun(String s)
	{
	    int l=s.length();
	    int m=l/2;
	    String s1="";
	    if(l%2==0)
	    {
	        s1=rev(s.substring(0,m))+(s.substring(m));
	    }
	    else{
	        s1=rev(s.substring(0,m+1))+(s.substring(m));
	    }
	    return s1;
	}
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s1= sc.nextLine();
    int n=sc.nextInt();
    String s3="";
    String s2[]=s1.split(" ");
    while(n!=0)
    {
        int r= n%10;
        s3=fun(s2[r-1])+" "+s3;
        n=n/10;
    }
	System.out.println(s3);
	}
}
