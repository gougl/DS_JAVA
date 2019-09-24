public class MyLinkedList<T>{
    private node<T> header;

    // constructor
    public MyLinkedList(){
        header = new node<T>();
    }
    // operations
    public void addFirst(T data){
        node<T> s = new node<T>();
        s.data = data;
        s.next = header.next;
        header.next = s;
    }

    public void display(){
        node<T> p = header.next;
        while(p!=null){
            System.out.println(p.data);
            p = p.next;
        }
    }

    public node<T> delFirst(){
        node<T> p = header.next;
        header.next = header.next.next;
        return p;
    }

}