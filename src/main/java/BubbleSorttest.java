package main.java;

public class BubbleSorttest
{
    void sort(int a[])
    {
        for (int i = 0 ; i < a.length; i ++ )
        {
            for(int j = i+1 ; j<a.length ; j++)
            {
                if(a[i]>a[j])
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
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]+" ");
        }
    }
    public static void main(String [] argc)
    {
        BubbleSorttest bubblesort1 = new BubbleSorttest();
        int [] a = {343,5,53,24,353,243,53,53};
        bubblesort1.sort(a);
        bubblesort1.printArray(a);
    }
}
