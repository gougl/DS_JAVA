public class MyLinkedStack<T> implements Stack<T> {
    private class node<T>{
        private T data;
        private node<T> next;

        public node(){

        }
        public node(T data){
            this.data = data;
            this.next = null;
        }
        public node(T data, node<T> next){
            this.data = data;
            this.next = next;
        }
        public T getData(node<T> p){
            return p.data;
        }
    }

    private node<T> top;
    private int size;

    public MyLinkedStack(){
        top = null;
    }

    public void push(T e){
        node<T> s = new node<>(e);
        if(top == null)
            top = s;
        else {
            s.next = top;
            top = s;
        }
    }

    public T pop(){
        T data = top.data;
        top = top.next;
        return data;
    }

    public boolean isEmpty(){
        if(top == null)
            return true;
        return false;
    }

    public T getTop(){
        return top.data;
    }
}
