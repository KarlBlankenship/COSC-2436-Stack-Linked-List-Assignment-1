/*
 * Create StackManager class that uses linked list to push, pop, 
 * and display its contents utilizing the Node Class.
 */
package Stack.Assignment;

/**
 * The StackManager Class will create and manage nodes using single linked 
 * list concepts and will allow elements to be added the beginning of the 
 * list via push, pulled from the beginning of the list via pop and will have 
 * a display method. This will be a LIFO model.
 * @author Karl
 */
public class StackManager 
{
    Node head;      // Always the last element pushed into the list.
    Node tail;      // Always the first element pushed into the list.
    
    private void push(String value)
    {
        Node n = new Node(value);
        if (head == null)
        {
            head = n;
            tail = head;
        }
        else
        {
            n.next = head;
            head = n;
        } 
        
    }
    
    private void pop()
    {
        
            head = head.next;   
        
    }
    
    private void display() 
    {
        Node node = head;
        while (node != null) 
        {
            System.out.print(node.value + " ");
            node = node.next;
        } 
        System.out.println();
    }
    
    
    /**
     * The main method executes the program.
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        StackManager sm = new StackManager();
        
        sm.push("to");
        System.out.print("Stack: ");
        sm.display();
        
        sm.push("be");
        System.out.print("Stack: ");
        sm.display();
        
        System.out.println("head: " + sm.head.value);
        System.out.println("tail: " + sm.tail.value);
        
        sm.push("or");
        System.out.print("Stack: ");
        sm.display();
        
        sm.push("not");
        System.out.print("Stack: ");
        sm.display();
        
        sm.push("to");
        System.out.print("Stack: ");
        sm.display();
        
        sm.pop();
        System.out.print("Stack: ");
        sm.display();
        
        sm.push("be");
        System.out.print("Stack: ");
        sm.display();
        
        sm.pop();
        System.out.print("Stack: ");
        sm.display();
        
        sm.pop();
        System.out.print("Stack: ");
        sm.display();
        
        sm.push("that");
        System.out.print("Stack: ");
        sm.display();
        
        sm.pop();
        System.out.print("Stack: ");
        sm.display();
        
        sm.pop();
        System.out.print("Stack: ");
        sm.display();
        
        sm.pop();
        System.out.print("Stack: ");
        sm.display();
        
        sm.push("is");
        System.out.print("Stack: ");
        sm.display();
        
    }
    
}
