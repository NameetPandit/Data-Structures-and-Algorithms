public class SelectionSort {
    public void selection_sort(int array[]) {


        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }

    public static void main(String[] args) {
        int array[]={4,9,2,5,1,3,6,8,7};
        SelectionSort ss=new SelectionSort();
        ss.selection_sort(array);
        for(int i:array)
        {
            System.out.print(i+" ");
        }
    }


}
