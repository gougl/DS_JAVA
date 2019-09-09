import java.util.Iterator;

public class LinkedListIterable<T> implements Iterable<T>{

    // node inner class
    private class Node<T>{
        private T data;
        private Node<T> next;
        public Node(T data){
            this.data = data;
            this.next = null;
        }
        public T getData(){
            return this.data;
        }
        public Node<T> getNext(){
            return this.next;
        }
        public void setData(T data){
            this.data = data;
        }
        public void setNext(Node<T> next){
            this.next = next;
        }

    }// end of inner class

    private Node<T> head, tail;
    private int size;
    public LinkedListIterable(){
        head = null;
        tail = head;
        size = 0;
    }

    public void addFirst(T data){
        Node<T> newElem = new Node<T>(data);
        newElem.next = head;
        head = newElem;
        size = size + 1;
    }

    public void display(){
        Node<T> p = head;
        while(p!=null){
            System.out.println(p.data);
            p = p.getNext();
        }
    }

    // in order to implement Iterable interface
    // firstly implement Iterate interface
    // inner class to implement Iterate
    private class LinkedIterator implements Iterator<T>{
        //the Iterator has two methods, hasNext(), next() should be implemented
        //notice the type T must be the same in the method

        private Node<T> p;
        public LinkedIterator(){
            p = head;
        }

        @Override
        public boolean hasNext() {
            return p!=null;
        }
        public T next(){
            T data = p.getData();
            p = p.getNext();
            return data;
        }
    }// end of inner class of implementation of Iterator

    public void display_iterator(){
        LinkedIterator iterator = new LinkedIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    //implement the Iterable interface
    //only the following method should be implemented
    public Iterator<T> iterator(){
        return new LinkedIterator();
    }

    private T[] iterableFiled;
    public T[] getiterableFiled(){
        iterableFiled = (T[]) new Object[size];
        LinkedIterator iter = new LinkedIterator();
        int i = 0;
        while(iter.hasNext()){
            iterableFiled[i] = iter.next();
            i++;
        }
        return iterableFiled;
    }
    public void display_foreach(){
        for (T i : this.getiterableFiled()){
            System.out.println(i);
        }
    }
}
