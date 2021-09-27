public class LinkedList{

    public static void main(String[] args) {
        LL obj = new LL();
        obj.insertAtEnd(12);
        obj.insertAtEnd(34);
        obj.insertAtEnd(34);
        obj.insertAtEnd(12);
        obj.insertAtEnd(25);
        obj.insertAtBegin(25);
        //obj.insertAtAnyPosition(3,8);
        //obj.deleteAtEnd();
        //obj.deleteAtEnd();
        //obj.deleteAtBegin();
        //obj.deleteAtAnyPosition(1);
        obj.display();
        //obj.reverse();
        //obj.display();
        //System.out.println(obj.size());
        //System.out.println(obj.search(30));
        //System.out.println(obj.findMiddle());
        //System.out.println(obj.cycleExist());
        //System.out.println(obj.isPalindrome());
    }
}

class Node{
    int data;
    Node next;
}

class LL{

    Node head;

    public Node createNewNode(int value){
        Node newnode = new Node();
        newnode.data = value;
        newnode.next = null;
        return newnode;
    }
    public void insertAtEnd(int value){
        if(head == null){
            head = createNewNode(value);
        }
        else{
            Node n1 = head;
            while(n1.next!=null){
                n1 = n1.next;
            }
            n1.next = createNewNode(value);
        }
    }

    public void insertAtBegin(int value){
        Node newnode = createNewNode(value);
        newnode.next = head;
        head = newnode;

    }

    public Node insertAtAnyPosition(int pos, int value){
        if(pos<1){
            System.out.println("Not Valid");
        }
        if(head==null && pos>1){
            return head;
        }
        if(head == null && pos == 1){
            return createNewNode(value);
        }
        if(head != null && pos == 1){
            Node newnode = createNewNode(value);
            newnode.next = head;
            head = newnode;
        }
        if(pos>1){
            Node n1 = head;
            Node n2 = n1;
            Node newnode = createNewNode(value);
            while(head != null && pos > 1){
                n2 = n1;
                n1 = n1.next;
                pos--;
            }
            n2.next = newnode;
            newnode.next = n1;
        }
        return head;
    }

    public void deleteAtEnd(){
        if(head == null || head.next == null){
            return;
        }
        else{
            Node n = head;
            Node n1 = n;
            while (n.next != null){
                n1 = n;
                n = n.next;
            }
            n1.next = null;
        }
        //Node n = head;
        //while(n.next.next != null){
        //        n = n.next;
        //    }
        //    n.next = null;
    }

    public Node deleteAtBegin(){
        if(head == null){
            return null;
        }
        Node n = head;
        head = n.next;
        return head;
    }

    public void deleteAtAnyPosition(int pos){
        if(pos == 1){
            deleteAtBegin();
        }
        else{
            Node n = head;
            Node n1 = n;
            while(n.next!= null && pos >1){
                n1 = n;
                n = n.next;
                pos--;
            }
            n1.next = n.next;

        }
    }

    public int size(){
        int count =0;
        if(head == null){
            return 0;
        }
        Node n = head;
        while(n!=null){
            count++;
            n = n.next;
        }
        return count;
    }

    public boolean search(int value){
        if(head == null){
            return false;
        }
        Node n = head;
        while(n!=null){
            if(n.data == value){
                return true;
            }
            n = n.next;  
        }
        return false;
    }

    public void reverse(){
        Node past = null;
        Node present = head;
        Node future;

        while(present != null){
            future = present.next;
            present.next = past;

            past = present;
            present = future;
        }
        head = past;
    }

    public int findMiddle(){
        if(head == null){
            return 0;
        }
        Node n = head;
        Node n1 = n.next;
        while(n1!=null && n1.next!=null){
            n = n.next;
            n1 = n1.next.next;
        }
        return n.data;
    }

    public boolean cycleExist(){
        if(head==null)
            return false;
        Node n = head;
        Node n1 = n.next;
        while(n!=n1){
            if(n1==null || n1.next==null){
                return false;
            }
            n = n.next;
            n1=n1.next.next;
        }
        return true;
    }

    public boolean isPalindrome(){
        Node n = head;
        Node n1 = head;
        while(n1!=null && n1.next!=null){
            n = n.next;
            n1 = n1.next.next;
        }

        Node past = null;
        Node present = n;
        Node future;

        while(present!=null){
            future = present.next;
            present.next = past;

            past = present;
            present = future;
         }
        n1 = head;
        while(past!=null){
            if(n1.data!=past.data){
                return false;
            }
            n1 = n1.next;
            past = past.next;
        }
        return true;
    }

    public void display(){
        Node n = head;
        while(n.next!=null){
            System.out.print(n.data+ "->");
            n = n.next;
        }
        System.out.println(n.data);
    }
}