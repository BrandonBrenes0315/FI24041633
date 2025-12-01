public class CustomStack {

    private StackNode _head;

    public CustomStack() {
        _head = null;
    }

    public void push(String word) {
        var node = new StackNode(word);

        node.setNext(_head); //se actualiza
        _head = node;
    }

    public String pop() {
        String word = null;

        if (_head != null) { //se actualiza
            word = _head.getValue();
            _head = _head.getNext();
        }

        return word;
    }

    public int size() {
        var length = 0;

        StackNode temp = _head; //se actualiza
        while (temp != null) {
            length++;
            temp = temp.getNext();
        }

        return length;
    }

    public String getWords() {
        var builder = new StringBuilder("(" + size() + ") [");
        for (var word = pop(); word != null; word = pop()) {
            builder.append(" " + word);
        }
        builder.append(" ]");
        return builder.toString();
    }
}