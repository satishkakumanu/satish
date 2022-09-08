package sep5;

import java.util.Scanner;

public class Search {
	

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in); 
		System.out.println("enter a size of the array");
		int size=sc.nextInt();
		System.out.println("enter array elements ");
		int arr[]=new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter a search value ");
		int value=sc.nextInt();
		
		//int arr[]= {10,20,40,30,50,100,60};
		//int value =50;
		int a=arr.length;
		boolean imp=false;
		for (int i=0 ;i<a; i++ ) {
			if (arr[i]==value) {
				imp=true;
				System.out.println("element value is found in location  :"+i);
			}
			
		}
		if (!imp ) {
			System.out.println("element value is not found in location  ");
			
		}
		
		

	}

}
