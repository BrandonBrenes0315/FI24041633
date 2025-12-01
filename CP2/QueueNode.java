public class QueueNode {
    private int value;
    private QueueNode next;

    public QueueNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public QueueNode getNext() {
        return next;
    }

    public void setNext(QueueNode next) {
        this.next = next;
    }
}
