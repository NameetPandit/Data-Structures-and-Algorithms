import java.util.*;
public class LinearSearch {
    Scanner scanner=new Scanner(System.in);
    int array[]={45,30,75,15};
    int i;
    int element;
public void linear_search()
{
    System.out.println("Enter the element you want to search:");
    element=scanner.nextInt();
    for(i=0;i<4;i++)
    {
        if(array[i]==element)
        {
            System.out.println("Element found at:" + i + "th location");
            break;

        }
        else
        {
            System.out.println("Element not found!");
            break;
        }
    }
}
    public static void main(String[] args) {
    LinearSearch ls=new LinearSearch();
    ls.linear_search();

    }
}


