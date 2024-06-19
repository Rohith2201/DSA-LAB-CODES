import java. util.*; 
public class Trial 
{ 
 int queue[]; 
 int front; 
 int rear; 
 int size; 
 Trial (int n) 
 { 
    queue = new int[n]; 
    front = -1; 
    rear = -1; 
    size = n-1; 
 } 
 void Insert ( int item ) 
 { 
    if ( rear == size ){ 
        System. out. println ( " QUEUE OVERFLOW "); 
        return ; 
    } 
    if ( front == 0 && rear == 0) 
    { 
        rear = rear + 1; 
        front = front + 1; 
        queue [rear] = item; 
    } 
    else
    { 
        rear = rear + 1; 
        queue [rear] = item; 
    } 
} 
void del() { 
    int item; 
    if ( front == -1) 
    {
        System. out. println ( "QUEUE UNDERFLOW" ); 
        return; 
    } 
    if ( front == rear) 
    { 
        item = queue [front]; 
        front = -1; 
    } 
    else
    { 
        item = queue [front]; 
        front = front + 1; 
    } 
    System. out. println ( " Deleted item is :" + item ); 
} 
void display() { 
    System. out. println ("The elements of the Queue are :"); 
    for ( int i = 0; i <= rear; i++) 
    { 
        System. out. println ( queue [i] ); 
    } 
} 
 public static void main ( String args[] ) { 
    int n; 
    System. out. println ( "Enter the size of the Queue" ); 
    Scanner sc = new Scanner (System.in); 
    n = sc. nextInt(); 
    Trial t1=new Trial (n); 
    System. out. println ("Enter some elements into the Queue"); 
    t1.Insert (12); 
    t1.Insert (25); 
    t1.Insert (36); 
    t1.Insert (48); 
    t1.Insert (59); 
    t1.display (); 
    t1.del (); 
    t1.del (); 
    t1.del (); 
    t1.del (); 
    t1.display (); 
 } 
}