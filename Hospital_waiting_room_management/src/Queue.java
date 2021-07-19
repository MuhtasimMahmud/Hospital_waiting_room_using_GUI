public interface Queue {
    int size();
    boolean isEmpty();
    void enqueue(Object o) throws QueueOverflowException;
    Object dequeue() throws QueueUnderflowException;
    Object peek() throws QueueUnderflowException;
    String toString();
}