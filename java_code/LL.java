public class Node {
    int data;
    Node next;
    Node(int value)
    {
        this.data=value;
        this.next=null;
    }
}


class LL{

  public static void main(String[] args)
  {
      insert_beg(10);
      insert_beg(20);
      insert_beg(30);
      insert_beg(40);
      print_val();

  }
 Node head;
 LL()
 {
    this.head= null;
 }
public static void insert_beg(int value)
{
    Node newNode = new Node(value);

        newNode.next=head;
        head=newNode;
    
}

public static void delete_beg()
{
    if(head==null)
    {
        System.out.println("Empty List");
        
    }
    else{
        head=head.next;
    }
}

public static void print_val()
{
    Node node= head;
    while(node!=null)
    {
        System.out.print(node.data + " ");
        node= node.next;
    }
}

static Node InsertPos(int pos, int value) {
    Node newNode = new Node(value);
    if(head==null)
    System.out.println("Empty list");
    if (pos < 0)
        System.out.print("Invalid position");

        if (pos == 1) {
            
            newNode.next = head;
            head = newNode;
        } 
        else
        {      for(int i=0;i<pos;i++)
            {
                head=head.next;
            }
               
               newNode.next=head.next;
               head.next=newNode;
            
            }
        }

 static Node Deletepos(int pos)
 { Node temp=head;
     if(head==null)
     System.out.println("Empty List");
     
     for(int i=0;i<pos-1;i++)
     {
       temp=temp.next;
     }
    temp= temp.next.next;


 }

}