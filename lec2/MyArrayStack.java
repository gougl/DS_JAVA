public class MyArrayStack<T> implements Stack<T> {
    T[] s;
    int top;
    int CAP = 100;

    public MyArrayStack(){
        s = (T[]) new Object[CAP];
        top = 0;
    }

    @Override
    public boolean isEmpty() {
        if(top == 0)
            return true;
        return false;
    }

    @Override
    public void push(T e) {
        s[top] = e;
        top++;
    }
    public T pop(){
        //top--;
        return s[--top];
    }
    public T getTop(){
        return s[top-1];
    }
}
