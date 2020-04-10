// selectSort.java
// demonstrates selection sort

class ArraySel
{
    private long[] a;
    private int nElems;

    public ArraySel(int max)
    {
        a = new long[max];
        nElems = 0;
    }

    public void insert(long value)
    {
        a[nElems] = value;
        nElems++;
    }

    public void display()
    {
        for(int j=0; j<nElems; j++)
            System.out.print(a[j] + " ");
        System.out.println("");
    }

    public void selectionSort()
    {
        int out, in, min;

        for(out=0; out<nElems-1; out++)
        {
            min = out;
            for(in=out+1; in<nElems; in++)
                if(a[in] < a[min] )
                    min = in;
                    swap(out, min);
        }
    }


    private void swap(int one, int two)
    {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }

}



class SelectSort
{
    public static void main(String[] args)
    {
        int maxSize = 10;
        ArraySel arr;
        arr = new ArraySel(maxSize);


        arr.insert(11);
        arr.insert(2);
        arr.insert(13);
        arr.insert(4);
        arr.insert(59);
        arr.insert(6);
        arr.insert(47);
        arr.insert(18);
        arr.insert(9);
        arr.insert(100);


        arr.display();

        arr.selectionSort();

        arr.display();


    }
}
