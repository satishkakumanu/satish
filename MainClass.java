package sep5;

 class Queue {
	String Queue [] = new String[5];
	int size ;
	int front ;
	int rear ;
	public void enQueue (String data) {
		Queue[rear]= data ;
		rear=rear+1;
		size =size+1 ;
		
	}
	public String Dequeue () {
		String data= Queue[front];
		front=front+1;
		size=size-1;
		return data;
	}
	public void show ()
	{
		System.out.println("Queue elements  :");
		for (int i=0;i<size ; i++) {
			System.out.println(Queue[i]+ " ");
		}
	}
 }
	public class MainClass
	{
	public static void main(String[] args) {
		Queue q=new Queue();
		q.enQueue("satish");
		q.enQueue("nag");
		q.enQueue("anay");
		q.enQueue("anil");
		q.Dequeue();
		q.show();
		
		

	}

}
 
