package Implementation;
//can't directly access the index
//list will end when we reach the last
//important to know how to traverse without the tail
public class LL {
    private Node head; //reference variables pointing to the first and last nodes respectively
    private Node tail;
    private int size;

    public void insertFirst(int value){    //happens in constant time
        Node node = new Node(value);
        node.next=head;
        head = node;
        if(tail==null){
            tail=head;
        }

        size+=1;
    }


    public void insertLast(int value){   //constant time if tail is used
        Node node= new Node(value);
        Node temp=head;
        if(head==null){
            head=node;
            tail=head;
            //OR insertFirst(value);
        }else{
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
            tail=node;
        }
        size+=1;
    }

    public void insertAt(int value, int position){
         int count=0;
         Node node=new Node(value);
         Node temp=head;
          if(head==null){
              System.out.println("List is Empty");
              insertFirst(value);
          }else{
              if(position==1){
                  node.next=head;
                  head=node;
              }else{
                  while(temp!=null){
                      count++;
                      temp=temp.next;
                  }
                  if(count+1>=position){
                      Node temp2= head;
                      while(position>2){
                          temp2=temp2.next;
                          position--;
                      }
                      node.next=temp2.next;
                      temp2.next=node;
                  }
              }
              size+=1;

          }

       System.out.println(size);
    }


    public void deleteFirst(){
        if(head==null){
            System.out.println("The list is empty");
        }else{
            head=head.next;
            size--;
            if(head==null){
                tail=null;
            }
        }
    }

    public void deleteLast(){
        if(head==null){
            System.out.println("The list is empty");
        }
        Node temp=head;
        Node prev=null;
        while(temp.next!=null){
            prev=temp;
            temp=temp.next;
        }
        prev.next=null;
        size--;
    }


    public int deleteElement(int element){
        if(head==null){
            System.out.println("The list is empty."+element+" cannot be deleted.");
        }
        if(head.next==null){
            head=null;
            System.out.println("You have deleted the only element in the list");
            size--;
            return -1;

        }
        int count=0;
        Node temp=head;
        Node prev=null;
        while(temp!=null){
            count++;
            if(temp.value==element){
                prev.next=temp.next;
                temp.next=null;
                size--;
                return count;
            }else{
                prev=temp;
                temp=temp.next;

            }

        }
        System.out.println(element+" not found in the list");
        return -1;
    }

    public void reverse(){
        Node prev=null;
        Node next;
        Node current= head;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;

    }

    public void insertionSort(){
        while(head==null||head.next==null){
            System.out.println();
        }
        Node sorted = null;
        Node current =head;
        while(current!=null){
            Node next=current.next;
            sorted=insert(sorted,current);
            current=next;

        }
        head=sorted;
    }

    public Node insert(Node sorted, Node insertingElement){
        if(sorted==null){
            sorted=insertingElement;
            return sorted;
        }

        if(sorted.value>=insertingElement.value){
            insertingElement.next=sorted;
            sorted=insertingElement;
            return sorted;
        }
        Node temp=sorted;

        while(temp.next!=null&&temp.next.value<insertingElement.value){
                temp=temp.next;
        }
        insertingElement.next=temp.next;
        temp.next=insertingElement;
        return sorted;
    }




    public void display(){
        Node temp=head;   //here temp is pointing to the same object that head is pointing to.
        while(temp!=null){
            System.out.print(temp.value+"->");   //here changing temp won't change the linked list.
            temp=temp.next;
        }
        System.out.print("end");
    }


    //No parameter constructor
    public LL(){
        this.size=0;
    }
    class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }

        public Node(Node next, int value){
            this.next=next;
            this.value=value;
        }
    }



}

