package Implementation;

import java.util.LinkedList;

public class SinglyLL {
    public static void main(String[] args) {
      LL list = new LL();
      list.insertAt(32,4);
      System.out.println(list.deleteElement(32));
      list.deleteFirst();
      list.insertLast(12);
      list.insertFirst(4);
      list.insertFirst(5);
      list.insertFirst(6);
      list.insertLast(43);
      list.deleteFirst();
      list.insertLast(99);
      list.deleteLast();
      list.insertAt(55,1);
      System.out.println("List before reversing");
      list.display();
      list.reverse();
      System.out.println("List after reversing");
      list.display();
      System.out.print("\nThe element which was deleted was at :");
      System.out.println(list.deleteElement(55));
      list.display();
      list.insertionSort();
      //list.display();
    }
}
