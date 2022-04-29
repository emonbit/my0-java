public class Node {
    public int element;
    public Node next;
    public Node previous;
    public Node(int element, Node next, Node previous){
        this.element = element;
        this.next = next;
        this.previous = previous;
    }
}