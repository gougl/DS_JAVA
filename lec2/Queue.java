public interface Queue<T> {
    void enqueue(T e);
    T outqueue();
    boolean isEmpty();
}
