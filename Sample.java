package sep5;

 class Stack {
	String st[];
	int top;
	int size;

	public  Stack(int size) {
		st = new String[size];
		top = -1;
		this.size = size;
	}
	public Stack() {
		st = new String[10];
		top = -1;
		size = 10;
	}
	public boolean push(String val) {
		if (isEmpty()) {
			top += 1;
			st[top] = val;
			return true ;
		} else {
			if (!isFull()) {
				top += 1;
				st[top] = val;
				return true ;

			} else {
				System.out.println("stack is full ");
				return false ;
			}			
		}
	}
	public boolean isEmpty() {
		if (top == -1) {
			return true;
		} else {
			if (size > top) {
				return false;
			} else {
				return true;
			}
		}
	}
	public boolean isFull() {
		if (top<size) {
			return false;
		} else {
			return true;
		}
	}
	public String  pop() {
		if (isEmpty()) {
		System.out.println("satck is empty");
		return null ; 
		}
		 else {
	            String val;
	            val = st[top];
	            top = top - 1;
	            return val;
	        }	
		}
	public String peek () {
		if (top ==-1) {
			System.out.println("stack is empty ");
			return null ;
		}
		else
        {
            String val = st[top];
            System.out.println("Stack is not empty ");
            return val;
        }	
	}
}
    public class Sample {
	public static void main(String[] args) {
		Stack s1=new Stack();
		System.out.println(s1.push("satish"));
		System.out.println(s1.push("nag"));
		System.out.println(s1.push("anay"));
		System.out.println(s1.pop());
		System.out.println(s1.peek());
	}

	}


