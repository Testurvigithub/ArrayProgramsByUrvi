
import java.util.Scanner;

public class maximumNumber 
{
	public static void main(String[] args) {
		
		int n,max;
		
		Scanner Sc=new Scanner(System.in);
		
		System.out.println("Enter the number of elements in an array:");
		
		n=Sc.nextInt();
		int a[]=new int[n];
		
		System.out.println("Enter the elements of array: ");
		
		for(int i=0;i<n;i++)
		{
			a[i]=Sc.nextInt();
		}
		max = a[0];
		
		for(int i=0; i<n; i++)
		{
			if(a[i] > max)
			{
				max = a[i];
			}
		}
		System.out.println(" Maximum value="+ max);
	}
}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		