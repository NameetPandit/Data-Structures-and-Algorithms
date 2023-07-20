public class BubbleSort {

    public void bubble_sort(int array[])
    {
        int i;
        int j;
//        int temp;
        for(i=0;i<array.length-1;i++)
        {
            for(j=0;j<array.length-i-1;j++)
            {
                if(array[j]>array[j+1])
                {
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;


                }
            }
        }
    }

    public static void main(String[] args) {
        int array[]={4,9,2,5,1,3,6,8,7};
        BubbleSort bs=new BubbleSort();
        bs.bubble_sort(array);
        for(int i:array)
        {
            System.out.print(i+" ");
        }
    }
}
