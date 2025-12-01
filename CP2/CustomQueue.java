public class CustomQueue {

    private QueueNode _head;

    public CustomQueue() {
        _head = null;
    }

    public void enqueue(int index) {
        var node = new QueueNode(index);

         if (_head == null) {
            _head = node;
        } else {
            QueueNode temp = _head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(node);
        }
    }

    public int dequeue() {
        var index = -1;

        if (_head != null) {
            index = _head.getValue();
            _head = _head.getNext();
        }

        return index;
    }

    public int getSize() {
        var size = 0;

        QueueNode temp = _head;
        while (temp != null) {
            size++;
            temp = temp.getNext();
        }
        return size;
    }

    public String getIndexes() {
        var builder = new StringBuilder();
        for (var index = dequeue(); index > -1; index = dequeue()) {
            builder.append(" " + index);
        }
        return builder.toString();
    }
}
