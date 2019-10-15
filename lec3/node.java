public class node<T>{
    T data;
    node<T> lchild, rchild;

    public node(){
        lchild = null;
        rchild = null;
    }
    public node(T data){
        //this();
        this.data = data;
        lchild = null;
        rchild = null;
    }
    public node(T data, node<T> lchild, node<T> rchild){
        this.data = data;
        this.lchild = lchild;
        this.rchild = rchild;
    }
    public T getData(node<T> p){
        return p.data;
    }
}