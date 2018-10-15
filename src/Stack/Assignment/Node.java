/*
 * Create a Node class that will be used to create objects containing a
 * String field for a value and a Node field for the next node. 
 */
package Stack.Assignment;

/**
 * The Node Class will create a Node.
 * @author Karl
 */
public class Node 
{
    String value;       // String value to be held in the object.
    Node next;          // Object reference variable that points to
                                // the next object in the stack.    
    /**
     * Constructor.
     * @param input The string to be stored as the node value. 
     */
    Node(String input)
    {
        this.value = input;
    }  
}
