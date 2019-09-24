public class node<T> {
    // data fields
    T data;
    node<T> next;

    // constructors
    public node(){
        next = null;
    }
    public node(T data){
        this.data = data;
        next = null;//this();
    }
    public node(T data, node<T> next){
        this.data = data;
        this.next = next;
    }

    // set methods
    public void setData(node<T> p, T data){
        p.data = data;
    }
    public void setNode(node<T> p, T data, node<T> next){
        p.data = data;
        p.next = next;
    }

    // get methods
    public T getData(node<T> p){
        return p.data;
    }
    public node<T> getNext(node<T> p){
        return p.next;
    }
}
