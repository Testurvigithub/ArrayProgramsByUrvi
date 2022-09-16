
import java.util.Scanner;

public class minimumNumber 
{
	public static void main(String[] args) {
		
		int n,min;
		
		Scanner Sc=new Scanner(System.in);
		
		System.out.println("Enter the number of elements in an array:");
		
		n=Sc.nextInt();
		int a[]=new int[n];
		
		System.out.println("Enter the elements of array: ");
		
		for(int i=0;i<n;i++)
		{
			a[i]=Sc.nextInt();
		}
		min = a[0];
		
		for(int i=0; i<n; i++)
		{
			if(a[i] < min)
			{
				min = a[i];
			}
			
		}
		System.out.println("Minimum value="+ min);
	}
}
				
				
				
				
				
				
				
				
				
				
				
				
				
				