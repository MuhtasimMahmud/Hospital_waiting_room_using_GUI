public class ListQueue implements Queue
{
    int size;
    Node front;
    Node rear;
    
    public ListQueue()
    {
        size = 0;
        front = null;
        rear = null;
    }
    
    public int size()
    {
        return size;
    }
    
    public boolean isEmpty()
    {
    	if(front == null) 
    	{
    		return true;
    	}
    	return false;
    }
    public boolean isFull() 
    {
    	return false;
    }
    public void enqueue(Object e) throws QueueOverflowException
    {
    	Node new_Node = new Node(e,null);
    	
    	if(front == null) 
    	{
    		front = new_Node;
    		rear = front;
    		size++;
    	}
    	else 
    	{
    		rear.next = new_Node;
    		rear = new_Node;
    		size++;
    	}
    }
    
    public Object dequeue() throws QueueUnderflowException
    {
    	if(isEmpty()) 
    	{
    		throw new QueueUnderflowException();
    	}
    	else 
    	{
    		Node temp = front;
    		front = front.next;
    		size --;
    		return temp.val;
    	}
    }
    
    public Object peek() throws QueueUnderflowException
    {
    	if(isEmpty()) 
    	{
    		throw new QueueUnderflowException();
    	}
    	else 
    	{
    		return front.val;
    	}
    }
    
    public String toString()
    {
    	String x = "\n";
    	for(Node n = front; n!=null; n=n.next) 
    	{
    		x = "\n"+x+n.val+"\n";
    	}
    	return x;
    }
    

    



}