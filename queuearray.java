class queue{
    static int size=7,front=0,rear=0;
    int q[]=new int[size];
    boolean isFull(){
        return rear==size;
    }
    void enqueue(int d){
        if(isFull()){
            System.out.println("Queue is full");
        }
        else{
            q[rear]=d;
            rear++;
        }
    }
    void display(){
        for(int i=0;i<rear;i++){
            System.out.print(q[i] + " ");
        }
        System.out.println( );
    }
 boolean isEmpty(){
     return rear==0;
 }
 int dequeue(){
     if(isEmpty()){
         System.out.println("queue is empty");
         return -1;
     }
 
 int val = q[front];
 for(int i=1;i<=rear-1;i++){
     q[i-1]=q[i];
 }
 rear--;
 q[rear]=0;
 return val;
}
}

public class  Main{
    public static void main(String[] args){
        queue que=new queue();
        que.enqueue(10);
        que.enqueue(20);
        que.enqueue(30);
        que.enqueue(40);
        que.display();
        que.dequeue();
        que.display();
    }
}