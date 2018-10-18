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
    
    /**
     * The push method will push a new element onto the stack.
     * The new element will become the head of the stack.
     * @param val The value to be contained in the new node.
     */
    private void push(String val)
    {
        // Create the new node.
        Node n = new Node(val);
        
        // If there is not an existing stack, the new node becomes
        // both head and tail.
        if (head == null)
        {
            head = n;
            tail = head;
        }
        // Else, the new node becomes the new head of the existing stack.
        else
        {
            n.next = head;
            head = n;
        } 
    }
    
    /**
     * The pop method will remove the head of the stack from the stack
     * and return that node.
     * @return The node that was removed from the stack.
     */
    private Node pop()
    {
        // Temp variable for returning the head of the stack.
        Node temp = head;
        // Remove the head from the stack by reassigning the reference 
        // to the next node.
        head = head.next;
        // Return the node that was removed.
        return temp;
    }
    
    /**
     * the display method will display the contents of the list.
     */
    private void display() 
    {
        // Create a new node for stepping through the list.
        Node pointer = head;
        // While the pointer exists, print out its value.
        while (pointer != null) 
        {
            System.out.print(pointer.value + " ");
            pointer = pointer.next; // Advance the pointer to the next node.
        } 
    }
    
    /**
     * The main method executes the program and test the functionality
     * of the mothods.
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // Create a new StackManager object to be the stack.
        StackManager sm = new StackManager();
        
        // Push a value to the stack and confirm it is there.
        System.out.print("Pushing a onto the stack\t");
        sm.push("a");
        System.out.print("Stack: ");
        sm.display();
        System.out.print("\t\tHead should be a: " + sm.head.value);
        System.out.print("\tTail should be a: " + sm.tail.value + "\n");
        
        // Push another element to the stack and confirm that
        // it was added as the head.
        System.out.print("Pushing b onto the stack\t");
        sm.push("b");
        System.out.print("Stack: ");
        sm.display();
        System.out.print("\t\tHead should be b: " + sm.head.value);
        System.out.print("\tTail should be a: " + sm.tail.value + "\n");
        
        // Push another element to the stack and confirm that
        // it was added as the head.
        System.out.print("Pushing c onto the stack\t");
        sm.push("c");
        System.out.print("Stack: ");
        sm.display();
        System.out.print("\t\tHead should be c: " + sm.head.value);
        System.out.print("\tTail should be a: " + sm.tail.value + "\n");
        
        // Push another element to the stack and confirm that
        // it was added as the head.
        System.out.print("Pushing d onto the stack\t");
        sm.push("d");
        System.out.print("Stack: ");
        sm.display();
        System.out.print("\t\tHead should be d: " + sm.head.value);
        System.out.print("\tTail should be a: " + sm.tail.value + "\n");
        
        // Pop an element from the stack and confirm that it was 
        // removed and head was reassigned.
        System.out.print("Popping " + sm.pop().value + " from the stack\t");
        System.out.print("Stack: ");
        sm.display();
        System.out.print("\t\tHead should be c: " + sm.head.value);
        System.out.print("\tTail should be a: " + sm.tail.value + "\n");
        
        // Pop another element from the stack and confirm that it was 
        // removed and head was reassigned.
        System.out.print("Popping " + sm.pop().value + " from the stack\t");
        System.out.print("Stack: ");
        sm.display();
        System.out.print("\t\tHead should be b: " + sm.head.value);
        System.out.print("\tTail should be a: " + sm.tail.value + "\n");
        
        // Push another element to the stack and confirm that
        // it was added as the head.
        System.out.print("Pushing c onto the stack\t");
        sm.push("c");
        System.out.print("Stack: ");
        sm.display();
        System.out.print("\t\tHead should be c: " + sm.head.value);
        System.out.print("\tTail should be a: " + sm.tail.value + "\n");
    }
    
}
