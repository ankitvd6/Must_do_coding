
import java.util.Scanner;
public class Array_Rotate1 
{
	void Rotate(int[]a,int r,int n)
	{
		 for (int i = 0; i < r; i++)
	            leftRotatebyOne(a, n);
	}
	
	 void leftRotatebyOne(int a[], int n) 
	    {
	        int i, temp;
	        temp = a[0];
	        for (i = 0; i < n - 1; i++)
	            a[i] = a[i + 1];
	        a[i] = temp;
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
		Array_Rotate1 array=new Array_Rotate1();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size,array,and number of rotations:");
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int r=sc.nextInt();
		array.Rotate(a, r, n);
		array.printArray(a, n);


	}

}
