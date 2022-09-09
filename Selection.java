package sep5;

import java.util.Scanner;

public class Selection {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter a size of the array ");
		int size= sc.nextInt();
		System.out.println("enter a array of the elements ");
		int arr[]=new int[size];
		for (int i= 0; i < size; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("sorting using selection sort technique");
		for(int i=0;i<size;i++) {
			for (int j = i+1; j < size; j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		
		}
		System.out.println("after sorting the array");
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]+" ");
			
		}
		

	}

}
