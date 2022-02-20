import java.util.Scanner;

class Node{
    public int data;
    Node next;
    Node previous;
}
public class DoublyLinkedList
{
    Node Start;
    DoublyLinkedList()
    {
        Start=null;
    }
    void InsertFirst()
    {
        System.out.println("Enter data to insert: ");
        Scanner sc = new Scanner(System.in);
        Node newnode=new Node();
        newnode.data=sc.nextInt();
        newnode.next=null;
        newnode.previous=null;
        if(Start==null)
        {
            Start=newnode;
        }
        else
        {
            newnode.next=Start;
            Start.previous=newnode;
            Start=newnode;
            System.out.println("-----Node inserted at First-----");
        }
    }
    void InsertTail()
    {
        System.out.println("Enter data to insert: ");
        Scanner sc = new Scanner(System.in);
        Node newnode=new Node();
        newnode.data=sc.nextInt();
        newnode.next=null;
        newnode.previous=null;
        if(Start==null)
        {
            Start=newnode;
        }
        else
        {
            Node current=Start;
            while(current.next!=null)
            {
                current=current.next;
            }
            current.next=newnode;
            newnode.previous=current;
        }
        System.out.println("----Node inserted at tail----");
    }
    void DeleteTail()
    {
        if(Start==null)
        {
            System.out.println("List is empty");
        }
        else
        {
            Node current=Start;
            if(Start.next==null)
            {
                Start=null;
            }
            else
            {
                while(current.next!=null)
                {
                    current=current.next;
                }
                current=current.previous;
                current.next=null;
            }
            System.out.println("---Node deleted from the Tail---");
        }
    }
    void DeleteFirst()
    {
        if(Start==null)
        {
            System.out.println("Empty List");
        }
        else
        {
            if(Start.next==null)
            {
                Start=null;
            }
            else
            {
                Start=Start.next;
                Start.previous=null;
            }
            System.out.println("---Node deleted from Front---");
        }
    }
    void TraverseForward()
    {
        if(Start==null)
        {
            System.out.println("Empty Linked List");
        }
        else
        {
            System.out.println("---Elements of linked list in order are---\n");
            Node current = Start;
            for (current = Start; current != null; current = current.next)
            {
                System.out.print(" " + current.data);
            }
        }
    }
    void TraverseReverse()
    {
        if(Start==null)
        {
            System.out.println("Empty Linked List");
        }
        else
        {
            System.out.println("---Elements of linked list in Reverse order are---\n");
            Node current = Start;
            Node last=null;
            for (current = Start; current != null; current = current.next)
            {
                last=current;
                current=current.next;
            }
            while(last!=null)
            {
                System.out.println(" "+last.data);
                last=last.previous;
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        DoublyLinkedList obj = new DoublyLinkedList();
        while(true)
        {
            System.out.println("\nEnter 1 to Insert at Tail");
            System.out.println("Enter 2 to Insert at First");
            System.out.println("Enter 3 to Delete from Tail");
            System.out.println("Enter 4 to Delete from First");
            System.out.println("Enter 5 to Traverse in forward Direction ");
            System.out.println("Enter 6 to Traverse in Reverse Direction");
            System.out.println("Enter 7 to exit");
            int choice=sc.nextInt();
            switch (choice) {
                case 1 -> obj.InsertTail();
                case 2 -> obj.InsertFirst();
                case 3 -> obj.DeleteTail();
                case 4 -> obj.DeleteFirst();
                case 5 -> obj.TraverseForward();
                case 6 -> obj.TraverseReverse();
                case 7 -> System.exit(0);
                default -> System.out.println("Invalid choice");
            }
        }
    }
}
