import javax.swing.*;
import java.util.*;
public class CQueue {
    Scanner scanner=new Scanner(System.in);
    private int i;
    private int front;
    private int rear;
    private int capacity=10;
    private int element;
    int cqueue[]=new int[capacity];
CQueue()
{
    front=-1;
    rear=-1;

}
public void enqueue()
{
    if(is_full()==1)
    {
        System.out.println("Queue is overflow!");


    }
    else
    {
        System.out.println("Enter the element to be inserted:");
        element=scanner.nextInt();
        if(front==-1)
        {
            front=0;}
            rear=(rear+1)%capacity;
            cqueue[rear]=element;
//           rear++;
        }
    }

public int is_full()
{
    if(front==0 && rear==capacity-1)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}
public void dequeue()
{
    if(is_empty()==1)
    {
        System.out.println("Queue is empty");
    }
    else
    {
        element=cqueue[front];
        if(front==rear)
        {
            front=-1;
            rear=-1;
        }
        else
        {
            front=(front+1)%capacity;


        }

        System.out.println("Element deleted");
    }


}
public int is_empty()
{
    if(front==-1&&rear==-1)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}
public void display()
{
    if(is_empty()==1)
    {
        System.out.println("The queue is empty");
    }
    else {
        System.out.println("These are the elements of the queue");
        for(i=front;i!=rear;i=(i+1)%capacity)
        {

            System.out.println(cqueue[i]);
        }
        System.out.println(cqueue[rear]);
    }
}
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CQueue cq = new CQueue();
        int choice;
        do {
            System.out.println("1.Enqueue");
            System.out.println("2.Dequeue");
            System.out.println("3.Display");
            System.out.println("4.Exit");
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    if (choice == 1) {
                        cq.enqueue();
                        break;
                    }
                }
                case 2: {
                    if (choice == 2) {
                        cq.dequeue();
                        break;
                    }
                }
                case 3: {
                    if (choice == 3) {
                        cq.display();
                        break;
                    }
                }

            }
        } while (choice != 4);
    }
}