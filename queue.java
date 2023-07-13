import java.util.*;
public class Queue {
    Scanner scanner = new Scanner(System.in);
    private int i;
    private int capacity = 5;
    int queue[] = new int[capacity];
    private int element;
    private int front;
    private int rear;

    Queue() {
        front = -1;
        rear = -1;
    }
//int[] queue=new int[capacity];


    //    private int arr[]=new int[capacity];
    public void enqueue() {
        if (is_full() == 1) {
            System.out.println("Queue overflow");
        } else {
            System.out.println("Enter the element:");
            element = scanner.nextInt();
            if (front == -1) {
                front = 0;
            }
                rear++;
                queue[rear] = element;

            }
        }


    public int is_full() {
        if (front == -0 && rear == capacity - 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public void dequeue() {
        if (is_empty() == 1) {
            System.out.println("Queue underflow:");
        } else {
            element = queue[front];
            if (front > rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }
            System.out.println("Element dequeued");

        }
    }

    public int is_empty() {
        if (front == -1) {
            return 1;
        } else {
            return 0;
        }
    }

    public void display() {
        int i;
        if (is_empty() == 1) {
            System.out.println("The queue is empty");
        } else {
            System.out.println("These are the elements of the queue");
            for (i = front; i <= rear; i++) {
                System.out.print(" " + queue[i % capacity]);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        
        Queue queue = new Queue();
        int choice;
        do {
        System.out.println("1.Enqueue");
        System.out.println("2.Dequeue");
        System.out.println("3.Display");
        System.out.println("4.Exit");
        System.out.println("Enter your choice:");
        choice=scanner.nextInt();

            switch (choice) {
                case 1: {
                    queue.enqueue();
                    break;
                }
                case 2: {
                    queue.dequeue();
                    break;
                }
                case 3: {
                    queue.display();
                    break;
                }
            }
        } while (choice != 4);
    }
}