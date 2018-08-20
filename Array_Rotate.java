import java.util.*;
public class Array_Rotate 
{
	void Rotate(int[]a,int r,int n)
	{
		int temp;
		while(r>0)
		{
			temp=a[n-1];			//choose constraints wisely;
			for(int i=n-1;i>0;i--)		//for rotate right;
			{	
				a[i]=a[i-1];
			}
			a[0]=temp;
			return;    //to return out of while loop;
		}
	}
	
	void printArray(int[]a,int n)
	{
		
		for(int i=0;i<n;i++)
		{
			
			System.out.print(" "+a[i]);
		}
	}

	public static void main(String[] args) 
	{
		Array_Rotate array=new Array_Rotate();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size,array,and number of rotations:");
		int n=sc.nextInt();int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int r=sc.nextInt();
		array.Rotate(a, r, n);
		array.printArray(a, n);


	}

}
