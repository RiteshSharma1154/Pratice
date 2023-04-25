package main.java;

public class SelectionSort
{
    void sort(int a[])
    {
        for(int i = 0 ; i< a.length-1; i++)
        {
            int min_val = i;
            for(int j = i+1; j<a.length; j++)
            {
                if(a[j]<a[min_val])
                {
                    min_val=j;
                }
                int temp = a[min_val];
                a[min_val] = a[i];
                a[i]= temp;
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
        SelectionSort selectionsort = new SelectionSort();
        int a[] = {5434,45,45,4,46,5,53,46,56,34434,35};
        selectionsort.sort(a);
        selectionsort.printArray(a);

    }
}