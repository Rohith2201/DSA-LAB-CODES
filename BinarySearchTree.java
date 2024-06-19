import java.lang.ProcessHandle.Info;

public class BinarySearchTree  {   
    
    public class Node {             
        Node llink; 
        int info;           
        Node rlink;   
        public Node(int data)         
        {
            info = data;              
            llink = null;              
             rlink = null;           
            }   
    }    
        Node root;   
        public BinarySearchTree()      
         {   
            root = null;         
        }   
        void insert(int data){             
            Node newNode = new Node(data);  
            //Create a new node   
            if(root == null)  
            //Check whether tree is empty           
            {                 
                root = newNode;   
                return;             
            }   
            else {                   
                Node current = root;               
                Node parent = null;   
                while(current != null)        
                {                     
                    parent = current;   
                    if(data < current.info)                   
                     {                         
                        current = current.llink;   
                        if(current == null)                        
                        {                             
                            parent.llink = newNode;     
                            return;                        
                         }                     
                        } 
                        else                  
                        {                         
                            current = current.rlink;   
                            if(current == null)                        
                            {                             
                                parent.rlink = newNode;   
                                return;                         
                            }                     
                        }                 
                    }             
                }         
            }
        
            void inorderTraversal(Node node)        
            {   
                if(root == null)           
                {                 
                    System.out.println("Tree is empty");   
                    return;             
                }   
                else          
                {   
                    if(node.llink!= null)                     
                    inorderTraversal(node.llink);                 
                    System.out.print(node.info + " ");   
                    if(node.rlink!= null)                     
                    inorderTraversal(node.rlink);             
                }         
            }
            Node delete(Node root, int item) 
            // To delete an element from the Tree    
            { 
                if (root == null) 
                  return root; 
                if (item < root.info)            
                   root.llink = delete(root.llink, item); 
                else if (item > root.info)                 
                   root.rlink = delete(root.rlink, item); 
                else        
                { 
                    if (root.llink == null)   
                    // node with only one child or no child
                    return root.rlink; 
                    else if (root.rlink == null) 
                    return root.llink;             
                    root.info = minValue(root.rlink);             
                    root.rlink = delete(root.rlink, root.info);  // Delete the inorder successor        
                } 
                return root;     
            } 
            int minValue(Node root)  // Helps to find the Inorder successor(Lowest value in right sub tree)    
            { 
                int minv = root.info; 
                while (root.llink != null)          
                {             
                    Node ptr = root.llink;             
                    minv = ptr.info;             
                    root = root.llink;         
                } 
                return minv;     
            } 
    public static void main(String[] args) {             
        BinarySearchTree bst = new BinarySearchTree();   //Add nodes to the binary tree            
        bst.insert(50);             
        bst.insert(30);   
        bst.insert(17);             
        bst.insert(6);             
        bst.insert(2);             
        bst.insert(12);             
        bst.insert(10);            
        bst.insert(40);   //Displays the binary search tree                       
        System.out.print("\n\n\nThe Inorder Tree Traversal is: ");            
        bst.inorderTraversal(bst.root);                     
        bst.delete(bst.root,17);           
        System.out.print("\n\n\nAfter deletion the Tree is: ");            
        bst.inorderTraversal(bst.root);        
    } 
}    
        
