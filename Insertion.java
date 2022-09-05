package sep5;

import java.util.Scanner;

public class Insertion {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter  size of the array");
		int size =sc.nextInt();
		System.out.print("enter array elements");
		int a[]=new int[size];
		for (int i=0 ; i<a.length;i++) {
			 int b=sc.nextInt();
             a[i]=b;
		}
		 int i, j, temp;  
		    int n = a.length;  
		    System.out.print("before sorting array elements ");
		    

		    for (i = 0; i < n; i++) {
		        temp = a[i]; 
		        j = i - 1;
		        System.out.println();
		        System.out.println(a[i] + " ");
			   
		        while(j>=0 && temp <= a[j])  /* Move the elements greater than temp to one position ahead from their current position*/  
		        {    
		            a[j+1] = a[j];     
		            j = j-1;    
		        }    
		        a[j+1] = temp;    
		    }  
		
		
		    System.out.println("after sorting array elements");
		     
		    for (i = 0; i < n; i++)  
		    System.out.print(a[i] + " ");  
		}  
		  

	}

