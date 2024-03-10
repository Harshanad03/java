class stack{
    static int top=0,size=6;
    int[]st=new int [size];
    boolean ifFull(){
        return top==size;
    }
    void push(int d){
        if(ifFull()){
            System.out.println("stack full");
        }
        else{
            st[top]=d;
            top++;
        }
    }
    boolean isEmpty(){
        return top==0;
    }
    int pop(){
        int val=-1;
        if(isEmpty()){
            System.out.println("stack is empty");
        }
        else{
            top--;
            val=st[top];
        }
        return val;
    }
    
    void display() {
        if (top == 0) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Elements of the stack:");
        for (int i = top - 1; i >= 0; i--) {
            System.out.println(st[i]);
        }
    }
    
}


public class Main
{
	public static void main(String[] args) {
		stack s=new stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.display();
		s.pop();
		s.display();
	}
}
