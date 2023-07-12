import java.util.*;


public class Stack {
   private int element;
   private int capacity;
Stack(int size)
{
    stack= new int[size];
    capacity=size;
    top=-1;
}


   private int top;
    int[] stack = new int[capacity];

   Scanner scanner=new Scanner(System.in);

public void push()
{
    if(is_full()==1)
    {
        System.out.println("Stack overflow");
    }
    else
    {
        System.out.println("Enter the element you want to enter:");
        element=scanner.nextInt();
        stack[top+1]=element;
        top++;

    }
}
public int is_full() {
    if (top == capacity-1) {
        return 1;
    } else
    {
        return 0;
    }
}
public void pop()
{
    if(is_empty()==1)
    {
        System.out.println("Stack underflow:");

    }
    else {
        System.out.println("Element popped:");
        top--;

    }
}
public int is_empty()
{
    if(top==-1)
    {
        return 1;
    }
    else {
        return 0;
    }
}
public void display()
{
    if(is_empty()==1)
    {
        System.out.println("Stack empty:");

    }
   else
    {
        System.out.println("Stack elements are:");
        for(int i=top;i>=0;i--)
        {
            System.out.println(" " + stack[i]);
        }
    }
}
}
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack stack = new Stack(20);
        int choice;
        do {
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Display");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    if (choice == 1) {
                        stack.push();
                        break;
                    }
                }
                case 2: {
                    if (choice == 2) {
                        stack.pop();
                    }
                }
                case 3: {
                    if (choice == 3) {
                        stack.display();
                    }
                }


            }

        } while (choice != 4) ;
    }
}
