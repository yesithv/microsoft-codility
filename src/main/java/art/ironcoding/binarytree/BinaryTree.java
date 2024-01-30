package art.ironcoding.binarytree;

public class BinaryTree {

    Node root;


    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }
        if (value < current.getValue()) {
            current.setLeft(addRecursive(current.getLeft(), value));
        }
        if (value >= current.getValue()) {
            current.setRight(addRecursive(current.getRight(), value));
        }
        return current;
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }

    private boolean containsNodeRecursive(Node current, int value) {
        if (current == null) {
            return false;
        }
        if (current.getValue() == value) {
            return true;
        }
        return value < current.getValue() ? containsNodeRecursive(current.getLeft(), value)
                : containsNodeRecursive(current.getRight(), value);
    }

    public boolean containsNode(int value) {
        return containsNodeRecursive(root, value);
    }
}
