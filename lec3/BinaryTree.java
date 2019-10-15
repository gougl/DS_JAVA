public class BinaryTree<T> {


    private node<T> root;

    public BinaryTree(){
        root = null;
    }
    public BinaryTree(T data){
        root = new node<>(data);
    }
    public BinaryTree(T data, node<T> lchild, node<T> rchild){
        root = new node<>(data,lchild,rchild);
    }
    public node<T> insert_lchild(node<T> p, T e){
        node<T> s = new node<>(e);
        p.lchild = s;
        return s;
    }
    public node<T> insert_rchild(node<T> p, T e){
        node<T> s = new node<>(e);
        p.rchild = s;
        return s;
    }

    public void preOrder(node<T> root){
        if(root!=null){
            System.out.println(root.data);
            preOrder(root.lchild);
            preOrder(root.rchild);
        }
    }

    public void inOrder(node<T> root){
        if(root!=null){

            inOrder(root.lchild);
            System.out.println(root.data);
            inOrder(root.rchild);
        }
    }
    public void postOrder(node<T> root){
        if(root!=null){

            postOrder(root.lchild);

            postOrder(root.rchild);
            System.out.println(root.data);
        }
    }

    public node<T> getRoot(){
        return root;
    }








}
