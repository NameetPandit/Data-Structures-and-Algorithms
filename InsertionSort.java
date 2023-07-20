public class InsertionSort {
    public void insertion_sort(int array[])
    {
        for(int i=1;i< array.length;i++)
        {
            int temp=array[i];
            int j=i-1;
                    while(j>=0 && array[j]>temp)
                    {
                        array[j+1]=array[j];
                        j--;
                    }
                    array[j+1]=temp;
        }
    }
    public static void main(String[] args) {
        int array[]={4,9,2,5,1,3,6,8,7};
        InsertionSort is=new InsertionSort();
        is.insertion_sort(array);
        for(int i:array)
        {
            System.out.print(i+" ");
        }
    }

}
