public class DoublyList {
    public Node head;

    public DoublyList(int[] a){
        boolean flag = false;
        if(a.length == 0){
            System.out.println("Array can not be empty.");
            flag = true;
        }
        if(flag != true){
            head = new Node(0,null,null);
            Node tail = head;
            for(int i=0; i<a.length; i++){
                Node temp = new Node(a[i],null,null);
                tail.next = temp;
                temp.previous = tail;
                temp.next = head;
                head.previous = temp;
                tail = temp;
            }
        }
    }
}

//2

public static void showList(Node head){
        boolean flag = false;
        if(head.next == head){
            System.out.print("Empty List");
            flag = true;
        }
        if(flag == false) {
            Node n = head.next;
            while (n.element != null) {
                System.out.print(n.element + "\t");
                n = n.next;
            }
        }
}

//3

public void insert(Node head, Node newElement){
        boolean flag = false;
        Node n = head.next;
        while (n.element != 0){
            if(n.element == newElement.element){
                n.previous.next = n.next;
                n.next.previous = n.previous;
                head.previous.next = n;
                n.previous = head.previous;
                n.next = head;
                head.previous = n;
                flag = true;
            }
            n = n.next;
        }
        if(flag == false){
            head.previous.next = newElement;
            newElement.previous = head.previous;
            newElement.next = head;
            head.previous = newElement;
        }
}

//4

public static void insert(Node head, int newElement, int index){
        boolean flag = false;
        //Finding out the length of the node.
        int length = 0;
        Node c = head.next;
        while (c.element != 0){
            length++;
            c = c.next;
        }
        //Finding out if the given index is valid or not.
        if(index < 0 || index > length){
            System.out.print("Invalid Index");
            flag = true;
        }
        //Inserting the element to it's desire index or repositioning the existing one to the last.
        if(flag = false){
            boolean flag2 = false;
            Node n = head.next;
            while (n.element != 0){
                if(n.element == newElement){
                    n.previous.next = n.next;
                    n.next.previous = n.previous;
                    head.previous.next = n;
                    n.previous = head.previous;
                    n.next = head;
                    head.previous = n;
                    flag2 = true;
                }
                n = n.next;
            }
            if(flag2 == false){
                Node insert = new Node(newElement,null,null);
                boolean flag3 = false;
                if(index == length){
                    head.previous.next = insert;
                    insert.next = head;
                    insert.previous = head.previous;
                    head.previous = insert;
                    flag3 = true;
                }
                if(index == 0){
                    insert.next = head.next;
                    insert.previous = head;
                    head.next.previous = insert;
                    head.next = insert;
                    flag3 = true;
                }
                if(flag3 == false){
                    int x = 0;
                    Node m = head.next;
                    while (m.element != 0){
                        if(x == index)
                            break;
                        m = m.next;
                        x++;
                    }
                    insert.next = m;
                    insert.previous = m.previous;
                    insert.previous.next = insert;
                    m.previous = insert;
                }
            }
        }
 
}

//5

public void remove(Node head, int index){
        boolean flag = false;
        //Finding out the length of the node.
        int length = 0;
        Node c = head.next;
        while (c.element != 0){
            length++;
            c = c.next;
        }
        //Finding out if the given index is valid or not.
        if(index < 0 || index > length-1){
            System.out.println("Invalid Index");
            flag = true;
        }
        if(flag == false){
            boolean anotherFlag = false;
            if(index == 0){
                head.next = head.next.next;
                head.next.next.previous = head;
                anotherFlag = true;
            }
            if(index == length-1){
                head.previous.previous.next = head;
                head.previous = head.previous.previous;
                anotherFlag = true;
            }
            if(anotherFlag == false){
                int idt = 0;
                Node n = head.next;
                while (n.element != 0){
                    if(idt==index){break;}
                    n = n.next;
                    idt++;
                }
                n.previous.next = n.next;
                n.next.previous = n.previous;
            }
        }
}

//6

public int removeKey(Node head, int deletkey) {
        if(head.next == head){
            System.out.println("List can not be empty.");
        }
        int returnValue = -1;
        Node n = head.next;
        while(n.element != 0){
            if(n.element == deletkey){
                returnValue = n.element;
                n.previous.next = n.next;
                n.next.previous = n.previous;
            }
            n = n.next;
        }
        return returnValue;
}