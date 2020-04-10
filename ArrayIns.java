public class ArrayIns {
    private long[] a;
    private int nElems;

    public ArrayIns(int max)
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

    public void insertionSort()
    {
        int in, out;

        for(out=1; out<nElems; out++)
        {
            long temp = a[out];
            in = out;
            while(in>0 && a[in-1] >= temp)
            {
                a[in] = a[in-1];
                --in;
            }
            a[in] = temp;
        }
    }
}

class InsertSort
{
    public static void main(String[] args)
    {
        int maxSize = 10;
        ArrayIns arr;
        arr = new ArrayIns(maxSize);

        arr.insert(8);
        arr.insert(70);
        arr.insert(2);
        arr.insert(56);
        arr.insert(92);
        arr.insert(12);
        arr.insert(46);
        arr.insert(7);
        arr.insert(23);
        arr.insert(75);


        arr.display();

        arr.insertionSort();

        arr.display();
    }
}