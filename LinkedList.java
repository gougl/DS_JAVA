import java.util.Iterator;

class Node<T>{
    private T data;
    private Node<T> next;

    public Node(T data, Node<T> next){
        this.data = data;
        this.next = next;
    }
    public void setNode(T data, Node<T> next){
        this.data = data;
        this.next = next;
    }
    public T getData(){
        return this.data;
    }
    public Node<T> getNext(){return this.next;}

}

public class LinkedList<T> implements List<T>, Iterable<Node<T>>{


    private Node<T> Head;
    private Node<T> Tail;
    //private LinkedListIterator it;
    public LinkedList(){
        Head = null;
        Tail = Head;
    }
    public void addFirst(T data){
        Node<T> s = new Node<>(data, Head);
        if(Head == null)
            Tail = s;
        Head = s;
    }

    @Override
    public void addLast(T data) {
        Node<T> s = new Node<>(data, null);
        if (Tail == null){
            Head = s;
            Tail = s;
        }

        Tail.setNode(data,s);
        Tail = s;
    }

    public void display(){


        Node<T> p = Head;
        while(p!=null){
            System.out.println(p.getData());//p.data is ok
            p = p.getNext();
        }


        /*
        it = new LinkedListIterator();
        while(it.hasNext()){
            System.out.println(it.next().getData());

        }*/


    }

    private class LinkedListIterator implements Iterator<Node<T>> {
        Node<T> p ;
        LinkedListIterator(){
           p  = Head;
        }
        @Override
        public boolean hasNext() {
            return p != null;
        }

        @Override
        public Node<T> next() {
            Node<T> n = p;
            p = p.getNext();
            return n;
        }
    }
    // notice: the generic type of Iterator must be the same as the interface Iterable
    // now the generic type is Node<T>, which is also the type of the Iterable at the first line of this class
    public Iterator<Node<T>> iterator(){
        return new LinkedListIterator();
    }


}
