public class MyArray<T> {
    // sequence structure
    private T[] arr;
    private int length;
    private int CAPACTIY = 100;

    // operations
    MyArray(){
        //arr = new T[CAPACTIY];
        arr = (T[]) new Object[CAPACTIY];
        length = 0;
    }

    // move the elem backward from last one to the position
    public void insert(int pos, T e){
        for(int j = length; j>=pos; j--){
            arr[j+1] = arr[j];
        }
        arr[pos] = e;
        length++;
    }

    //move the elem forward from position+1 to the last one
    public T delete(int pos){
        T e = arr[pos];
        for(int i=pos; i<length; i++)
            arr[i] = arr[i+1];
        length--;
        return e;
    }

    // traverse
    public void display(){
        for(int i=0; i<length; i++)
            System.out.println(arr[i]);
    }

}
