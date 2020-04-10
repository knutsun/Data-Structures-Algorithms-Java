// demonstrates queue

public class Queue {

    private int maxSize;
    private long[] queArray;
    private int front, rear, nItems;

    public Queue(int s)
    {
        maxSize = s;
        queArray = new long[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(long j)  // put item at rear of queue
    {
        if(rear == maxSize-1)   // deal w/ wraparound
        {
            rear = -1;
        }
        queArray[++rear] = j;
        nItems++;
    }

    public long remove()       //take item from front of queue
    {
        long temp = queArray[front++];  // get value and incr front
        if(front == maxSize)            // deal w/ wraparound
            front = 0;
        nItems--;
        return temp;
    }

    public long peekFront()
    {
        return queArray[front];
    }

    public boolean isEmpty()    // true if queue is empty
    {
        return(nItems == 0);
    }

    public boolean isFull()
    {
        return(nItems == maxSize);
    }

    public int size()
    {
        return nItems;
    }
}
////////////////////////////////////////////////////////////////////////////////
class QueueApp
{
    public static void main(String[] args)
    {
        Queue theQueue = new Queue(5);

        theQueue.insert(10);
        theQueue.insert(20);
        theQueue.insert(30);
        theQueue.insert(40);

        theQueue.remove();
        theQueue.remove();
        theQueue.remove();

        theQueue.insert(50);
        theQueue.insert(60);
        theQueue.insert(70);
        theQueue.insert(80);

        while( !theQueue.isEmpty())
        {
            long n = theQueue.remove();
            System.out.print(n);
            System.out.print(" ");
        }
        System.out.println("");
    }
}
