class Node{
    int data;
    Node next;
    public Node(int d){
        data=d;
        next=null;
    }
}
class likedlist
  {
    Node head=null;
    static int size = 0;
    void insert_end(int d){
        Node node = new Node(d);
        if(head == null){
            head = node;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
        }
        size++;
    }
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    void insert_first(int d){
        
        Node node=new Node(d);
        if(head==null){
            head=node;
        }
        else{
            node.next=head;
            head=node;
        }
    }
    void insert_index(int d,int index)
    {
        if(index==0)
        {
            insert_first(d);
        }
                else if(index>=size)
                {
                    insert_end(d);
                }
                else
                {
                    int i=1;
                    Node temp = head;
                    Node node=new Node(d);
                    while(i<index&&temp.next!=null)
                    {
                        i++;
                        temp=temp.next;
                    }
                    node.next=temp.next;
                    temp.next=node;
                    size++;
                }
            }
            
    void delete_first(){
        if(head!=null){
            head=head.next;
            size--;
            
        }
    }
    void delete_last(){
        if(head!=null){
            if(head.next==null){
                delete_first();
            }}
            else{
                Node temp = head;
                while(temp.next!=null && temp.next.next!=null){
                    temp=temp.next;
                    temp.next=null;
                    size--;
                }
            
        }
    }
                
            
    }
    public class Main
{
	public static void main(String[] args) {
		likedlist ll = new likedlist();
		ll.insert_end(10);
		ll.insert_end(20);
		ll.insert_end(30);
		ll.insert_first(100);
		ll.insert_index(17,2);
		ll.display();
		ll.delete_last();
		ll.display();
	}
}
