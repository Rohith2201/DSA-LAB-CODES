class LinkedList {
    Node head;
  
    // Create a node
    class Node {
      int data;
      Node next;
      
  
      Node(int d) {
        data = d;
        next = null;
      }
    }
  
    // Insert at the beginning
    public void insertAtBeginning(int new_data) {
      // insert the data
      Node new_node = new Node(new_data);
      new_node.next = head;
      head = new_node;
    }
  
    // Insert after a node
    public void insertAfter(Node prev_node, int new_data) {
      if (prev_node == null) {
        System.out.println("The given previous node cannot be null");
        return;
      }
      Node new_node = new Node(new_data);
      new_node.next = prev_node.next;
      prev_node.next = new_node;
    }
  
    // Insert at the end
    public void insertAtEnd(int new_data) {
      Node new_node = new Node(new_data);
  
      if (head == null) {
        head = new Node(new_data);
        return;
      }
  
      new_node.next = null;
  
      Node last = head;
      while (last.next != null)
        last = last.next;
  
      last.next = new_node;
      return;
    }
    void Pinsert(int pos, int data)     
    { 
        int i=1;            
        Node newNode = new Node(data);          
        Node ptr= head;
        if(pos>1)
        {
            while(i<pos-1)
            {
                if(ptr.next == null)                 
                {
                    System.out.println("Sufficient nodes aren't present");                  
                    return;                 
                } 
                else                
                {                     
                    ptr = ptr.next;                     
                    ++i;
                }              
            }             
            newNode.next = ptr.next;                    
            ptr.next = newNode;         
        } 
        else{
            newNode.next=head;            
            head=newNode;         
        }                     
    } 
  
    // Delete a node
    void deleteNode(int position) {
      if (head == null)
        return;
  
      Node temp = head;
  
      if (position == 0) {
        head = temp.next;
        return;
      }
      // Find the key to be deleted
      for (int i = 0; temp != null && i < position - 1; i++)
        temp = temp.next;
  
      // If the key is not present
      if (temp == null || temp.next == null)
        return;
  
      // Remove the node
      Node next = temp.next.next;
  
      temp.next = next;
    }
  
  
   
    // Print the linked list
    public void printList() {
      Node tnode = head;
      while (tnode != null) {
        System.out.print(tnode.data + " ");
        tnode = tnode.next;
      }
  
    }
  
    public static void main(String[] args) {
      LinkedList llist = new LinkedList();
  
      llist.insertAtEnd(1);
      llist.insertAtBeginning(2);
      llist.insertAtBeginning(3);
      llist.insertAtEnd(4);
      llist.insertAfter(llist.head.next, 5);
  
      System.out.println("Linked list: ");
      llist.printList();
      System.out.println("\ninserting at various index: ");
      llist.Pinsert(5,8);
      llist.printList();
  
      System.out.println("\nAfter deleting an element: ");
      llist.deleteNode(3);
      llist.printList();
  
      System.out.println("\nlinked list after deletion");
      llist.printList();
    }
  }