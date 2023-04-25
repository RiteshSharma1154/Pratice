package main.java;

public class SelectionSorttest
{
    void sort(int a[])
    {
        for( int i = 0; i < a.length-1; i ++)
        {
            for(int j = i+1; j < a.length ; j++)
            {
                if(a[j]<a[i])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    void printArray(int a[])
    {
        for(int i =0;i<a.length;i++)
        {
            System.out.println(a[i]+" ");
        }
    }
    public static void main(String []argc)
    {
        SelectionSorttest selectionsort = new SelectionSorttest();
        int a[] = {5434,45,45,4,46,5,53,46,56,34434,35};
        selectionsort.sort(a);
        selectionsort.printArray(a);

    }
}
