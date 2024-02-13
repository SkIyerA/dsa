package Implementation;

public class DL {

    private int value;
    private Node prev;
    private Node next;







    public class Node{
        private int value;
        private Node prev;
        private Node next;

        public Node(int value, Node prev, Node next){
            this.value=value;
            this.prev=prev;
            this.next=next;
        }

        public Node(int value) {
            this.value = value;
        }

    }
}
