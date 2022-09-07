package sep5;

class Node {
	int data ;
	Node nextNode ;	
	
public Node(int data) {
	this.data=data;
	}
}

 class Single_Linked_List {
	Node head=null;
	Node tail=null;
	int size=0;
	
	public void insert (int data) {
		Node n=new Node(data);
		if(size==0) {
			head=n;
			size++;
		}
		else if (size > 0) {
            tail.nextNode = n;
        }
        tail=n;
        size++;
    }
	public void delete (int data) {
		if(size == 0) {
			System.out.println("list is empty");
			return ;	
		}
		else {

            if(head.data == data) {
                head = head.nextNode;
                return;
            }
            Node prevNode = null;
            Node curNode = head;

            while(curNode.nextNode != null) {
            	  if(curNode.data == data) {
                      prevNode.nextNode = curNode.nextNode;
                      size--;
                      return;
                  }
            	  else {
                      prevNode = curNode;
                      curNode = curNode.nextNode;
                  }
              }
            if(curNode.data == tail.data) {
                tail = prevNode;
                size--;
                if(size == 1) {
                    head.nextNode = null;
                }
            }

            }
		}
	 public void getHead(int data) {
	        if(size == 0) {
	            System.out.println("List is empty");
	            return;
	        }
	        else {

	            if(head.data == data) {
	                head = head.nextNode;
	                return;
	            }
	        
	        }    
	    }
	  public void getTail() {
	        System.out.println(tail.data);
	    }

	    public void getSize() {
	        System.out.println(size);
	    }
	
	
	  public void display() {
	        if(size > 0) {
	            Node curNode = head;
	            while(curNode.nextNode != null) {
	                System.out.print(curNode.data+" ");
	                curNode = curNode.nextNode;
	            }
	            System.out.println(curNode.data);
	        }else {
	            System.out.println("List is empty");
	        }

	    }
	  public void find(int data) {
	        if(size > 0) {

	            if(head.data == data || tail.data == data) {
	                System.out.println("exists");
	                return;
	            }

	            Node curNode = head;
	            while(true) {
	                if(curNode.data == data) {
	                    System.out.println("exists");
	                    return;
	                }
	               
	            
	            if(curNode.nextNode ==null) {
	            	System.out.println("not exists");
	            	break;
	            }
	            
	            else {
	            curNode =curNode.nextNode;
	            
	        }
	    }
	}
	  else {
		  System.out.println("list is empty"); 
	  }
 }
 }
	public class Linked_List {
		
	public static void main(String[] args) {
		Single_Linked_List s1=new Single_Linked_List();
		System.out.println("list elements ");
		s1.insert(5);
		s1.insert(8);
		s1.insert(6);
		s1.insert(4);
		s1.display();
    	s1.delete(5);
    	s1.display();
    	s1.getHead(8);
    	s1.getTail();
        s1.getSize();
		s1.find(8);
	}

}
 
 
