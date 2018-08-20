import java.util.Scanner;

/* we have two strings: abc and defgh output: adbecfgh
 * abc and def o/p: adbecf
 * abcxnz and def o/p:adbecfxnz
 */
public class String_Concat 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String a=sc.nextLine();
		System.out.println("Enter String");
		String b=sc.nextLine();
		
		Second o=new Second();
		String ans=o.MergeString(a, b);
		System.out.println(" "+ans);
	}
}

class Second
{
	
	public String MergeString(String  a,String b)
	{
		String c="";
		if(a.length()==b.length())
		{
			for(int i=0;i<a.length();i++)
			{
				c=c+a.charAt(i);
				c=c+b.charAt(i);
			}
		}
		
		if(a.length()<b.length())
		{
			for(int i=0;i<a.length();i++)
			{
				c=c+a.charAt(i);
				c=c+b.charAt(i);
			}
			c=c+b.substring(a.length());
		}
		
		if(a.length()>b.length())
		{
			for(int i=0;i<b.length();i++)
			{
				c=c+a.charAt(i);
				c=c+b.charAt(i);
			}
			c=c+a.substring(b.length());
		}
		
		return c;
		
	}
	
}
