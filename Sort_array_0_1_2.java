import java.util.*;
import java.lang.*;
import java.io.*;
public class Sort_array_0_1_2 
{
	
		public static void main (String[] args)
		{
		    int t,i,j,z,temp;
		    System.out.println("Enter number of test cases:");
		    Scanner sc=new Scanner(System.in);
		    t=sc.nextInt();
		    for(z=0;z<t;z++)
		    {
		    	System.out.println("Enter array size:");
		        int n=sc.nextInt();
		        int[] a=new int[n];
		        for(i=0;i<n;i++)
		        {
		            a[i]=sc.nextInt();
		        }
		    
		        for(i=0;i<n-1;i++)
		        {
		            for(j=0;j<n-i-1;j++)
		            {
		                if(a[j]>a[j+1])
		                {
		                     temp=a[j];
		                     a[j]=a[j+1];
		                     a[j+1]=temp;
		                }
		            }
		       
		        }
		        
		        for(j=0;j<n;j++)
		        {
		        	System.out.println(+a[j]);
		        }
		    }
		}
	}


