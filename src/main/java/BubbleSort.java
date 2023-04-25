package main.java;

public class BubbleSort
{
    void bubblesort(int a[])
    {
        for(int i = 0; i<a.length;i++)
        {
            for(int j=0;j<a.length-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
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
        BubbleSort bubblesort1 = new BubbleSort();
        int [] a = {343,5,53,24,353,243,53,53};
        bubblesort1.bubblesort(a);
        bubblesort1.printArray(a);
    }
}
