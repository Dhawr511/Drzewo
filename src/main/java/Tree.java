public class Tree {
        Node root;
    private Node add(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }
        if (value < current.value) {
            current.left = add(current.left, value);
        } else if (value > current.value) {
            current.right = add(current.right, value);
        } else {
            return current;
        }

        return current;
    }
        public void add(int value) {
            root = add(root, value);
        }

    private boolean contains(Node current, int value) {
        if (current == null) {
            return false;
        }
        if (value == current.value) {
            return true;
        }
        return value < current.value
                ? contains(current.left, value)
                : contains(current.right, value);
    }



}
