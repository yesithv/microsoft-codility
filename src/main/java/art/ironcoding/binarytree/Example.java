package art.ironcoding.binarytree;

/**
 * https://www.baeldung.com/java-binary-tree
 */
public class Example {

    public static void main(String[] args) {
        var binaryTree = createBinaryTree();
        int search = 6;
        System.out.println("Contains " + search + " ? " + binaryTree.containsNode(search));
    }

    private static BinaryTree createBinaryTree() {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.add(6);
        binaryTree.add(4);
        binaryTree.add(8);
        binaryTree.add(3);
        binaryTree.add(5);
        binaryTree.add(7);
        binaryTree.add(9);
        return binaryTree;
    }
}
