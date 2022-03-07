import java.util.Scanner;

class Node
{
    int length;
    int priority;
    Node next;
    Node(int length, int priority)
    {
        this.length=length;
        this.priority=priority;
        next=null;
    }
}
class PirorityQueue{
    Node rear;
    Node front;
    PirorityQueue()
    {
        rear=null;
        front=null;
    }
    public void enqueue(int length,int sum)
    {
        Node newnode = new Node(length,sum);
        if (front == null || newnode.priority < front.priority) {
            newnode.next = front;
            front = newnode;
        } else {
            Node temp = front;
            while (temp.next != null && temp.next.priority <= newnode.priority) {
                temp = temp.next;
            }
            newnode.next = temp.next;
            temp.next = newnode;

        }
    }
    public void display()
    {
        Node temp = front;
        while(temp != null)
        {
            System.out.println(temp.length + " " + temp.priority);
            temp = temp.next;
        }
    }
}

public class Que1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PirorityQueue enque = new PirorityQueue();
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) {
            a[i]=sc.nextInt();
        }
        int sum,length, j = 0,flag=0,temp=0;
        for(int i=0;i<n;i++)
        {
            flag=0;
            if(a[i]%2!=0)
            {
                flag=1;
                temp=1;
                length=0;sum=0;
                for(i=i;j<n && a[j]%2!=0;j++)
                {
                    length++;
                    sum+=a[j];
                }
                enque.enqueue(length, sum);
            }
            if(flag==1)
                i=j;
        }
        if(temp==0)
        {
            System.out.println("Can't perform operation...");
        }
        else
            enque.display();

    }
}
