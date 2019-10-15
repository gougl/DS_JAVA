public class ArrayBinaryTree<T> {
    T[] arr;
    int size;
    int CAP = 100;

    public ArrayBinaryTree(){
        arr = (T[]) new Object[CAP];
        size = 0;
    }

    public void create_binarytree(int n, T[] arr){
        for(int i=0;i<n;i++)
            this.arr[++size] = arr[i];

    }

    public void preorder(int i){
        if(i<=size){
            if(arr[i]!="")
                System.out.println(arr[i]);
            preorder(2*i);
            preorder(2*i+1);
        }
    }
}
