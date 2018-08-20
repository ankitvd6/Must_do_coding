import java.util.Scanner;

public class LinearSearch 
{
	public static int main(String args[]) 
	{
		int size;
		int flag=0;
		int i=0;
		int arr[]=new int[100];
		Scanner sc=new Scanner(System.in);
		
		size=sc.nextInt();
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int num=sc.nextInt();
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==num)
			{
				flag=1;
				return(i);
			}
		}
		if(flag==0)
			return -1;
		return 0;
		
		
		
	}
}
