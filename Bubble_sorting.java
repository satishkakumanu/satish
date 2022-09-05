package sep5;

import java.util.Scanner;

public class Bubble_sorting 

{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter size of array ");
		int size=sc.nextInt();
		
		System.out.println("enter array elements :");
		int a[] = new int[size] ;
		   for (int i = 0; i < a.length; i++) 
	          {
	              int b=sc.nextInt();
	              a[i]=b;
	          }
		int n=a.length;
		System.out.println("before sorting the array elements :");
		for (int i=0 ; i<n;i++ ) 
		{
			
			System.out.print(a[i]+" ");
		}
		// implement the bubble sort 
		System.out.println();
		System.out.println("after sorting the array elements :");
		for(int i=0 ; i<n;i++)
		{
		for (int j=i+1 ;j<n;j++) 
			{
				if (a[j]<a[i]) 
				{
					int temp = a[i];
					a[i] =a[j];
					a[j]=temp ;	
				}	
			}
		System.out.print(a[i]+" ");
		}
		
		
		

	}

}
