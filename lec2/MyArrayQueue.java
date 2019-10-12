import static java.lang.System.exit;

public class MyArrayQueue<T> implements Queue<T> {
    private T[] arr;
    private int size;
    private int CAP = 100;
    private int front, rear;

    public MyArrayQueue(){
        arr = (T[]) new Object[CAP];
        size = 0;
        front = 0;
        rear = front;
    }

    public void enqueue(T e){
        if(rear >= CAP) {
            //System.out.println("the queue is full");
            //return;
            T[] newSpace = (T[]) new Object[CAP*2];
            CAP *= 2;
            for(int i=front;i<rear;i++)
                newSpace[i] = arr[i];
            arr = newSpace;
        }
        arr[rear] = e;
        rear++;
    }

    public T outqueue(){
        if(isEmpty()==true)
            exit(0);

        T data = arr[front];
        front++;
        return data;
    }

    @Override
    public boolean isEmpty() {
        if(front == rear)
            return true;
        return false;
    }
    /*
    public void display(){
        for(int i=front;i<rear;i++)
            System.out.println(arr[i]);
    }*/
}
