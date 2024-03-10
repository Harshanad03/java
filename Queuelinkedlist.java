class Node{
    int data;
    Node next;

public Node(int d){
    data = d;
    next=null;
    }
}
class Queue{
    Node front = null,rear=null;
    static int size=0;
    void enqueue(int d){
        Node node=new Node(d);
        if(front==null){
            front=node;
            rear=node;
        }
        else{
            rear.next=node;
            rear=rear.next;
        }
        size++;
    }
    void display(){
        Node temp=front;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println( );
    }
    boolean isEmpty(){
        return front==null;
    }
    int deQueue(){
        if(isEmpty()){
            return -1;
        }
        int val = front.data;
        front=front.next;
        size--;
        return val;
    }
}    
    



public class Main
{
	public static void main(String[] args) {
	Queue que=new Queue();
	que.enqueue(10);
	que.enqueue(20);
	que.enqueue(30);
	que.enqueue(40);
	que.display();
System.out.println("Removed data " + que.deQueue() );
	que.display();
	
	}
}
