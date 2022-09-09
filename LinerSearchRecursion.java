package sep5;

public class LinerSearchRecursion {

	public static void main(String[] args) {
		int arr[]= {2,3,4,10,40};
		int x=5;
		int result=search(arr , x,0);
		if(result==-1) {
			System.out.println(x+"element is present in array");
			
			
		}
		else {
			System.out.println(result);
		}

	}

	private static int search(int[] arr, int searchvalue, int index) {
		if(arr.length>index) {
			
			if(arr[index]== searchvalue) {
				return index;
				
			}
			return search (arr,searchvalue,index + 1);
			
		}
		else {
			return-1;
		}
		
	}

}
