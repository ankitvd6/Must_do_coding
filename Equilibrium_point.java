import java.util.*;
public class Equilibrium_point
{

	public static void main(String[] args)
	{
		int z,t,i,l,r;	int neg=-1;
		int sumL=0;
		int sumR=0;
		int flag=0;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		for(z=0;z<t;z++)
		{
			int size=sc.nextInt();
			int[] a=new int[size];
			for(i=0;i<size;i++)
			{
				a[i]=sc.nextInt();
			}
			
			if(size==1)
			{
				System.out.println(+a[0]);
			}
			else
			{
				for(i=1;i<size-1;i++)
				{
					for(l=0;l<i-1;l++)
					{
						sumL=sumL+a[l];
					}
				
					for(r=i+1;r<size;r++)
					{
						sumR=sumR+a[r];
					}
				
							if(sumL==sumR)
							{
								System.out.println("Executed"+a[i+1]);
								
							}
				}
				
				
			}
			
		}

	}

}
