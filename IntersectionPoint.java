public class IntersectionPoint {
   
    public static void main(String[] args) {
        List obj = new List();
        Node1 head1=null;
        Node1 head2=null;
        obj.insertAtEnd(head1,1);
        obj.insertAtEnd(head1,3);
        obj.insertAtEnd(head1,4);
        obj.insertAtEnd(head1,2);
        obj.insertAtEnd(head1,5);
        obj.insertAtEnd(head1,6);
        obj.display(head1);
        obj.insertAtEnd(head2,9);
        obj.insertAtEnd(head2,10);
        obj.insertAtEnd(head2,5);
        obj.insertAtEnd(head2,6);
        obj.display(head2);
        System.out.println(obj.mergepoint(head1,head2)); 
    }

}

class Node1{
    int data;
    Node1 next;
}

class List{

    public Node1 createNewNode(int value){
        Node1 newnode = new Node1();
        newnode.data = value;
        newnode.next = null;
        return newnode;
    }
    public void insertAtEnd(Node1 head,int value){
        if(head == null){
            head = createNewNode(value);
        }
        else{
            Node1 n1 = head;
            while(n1.next!=null){
                n1 = n1.next;
            }
            n1.next = createNewNode(value);
        }
    }



    public Node1 mergepoint(Node1 head1,Node1 head2){
        if(head1==null || head1==null){
            return null;
        }
        Node1 Firstlist = head1;
        Node1 Secondlist = head2;
        while(Firstlist!=Secondlist){
            Firstlist = Firstlist==null? Secondlist:Firstlist.next;
            Secondlist = Secondlist==null? Firstlist:Secondlist.next;
        }
        return Firstlist;
    }

    public void display(Node1 head){
        Node1 n = head;
        while(n.next!=null){
            System.out.print(n.data+ "->");
            n = n.next;
        }
        System.out.println(n.data);
    }
}
