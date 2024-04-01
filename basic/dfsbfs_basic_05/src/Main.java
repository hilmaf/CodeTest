public class Main {
    class Node {
        int value;
        Node lt;
        Node rt;

        public Node(int value) {
            this.value = value;
            this.lt = null;
            this.rt = null;
        }
    }

    void Dfs(Node root) {
        if (root == null) {
            return;
        } else {
            System.out.print(root.value + " ");
            Dfs(root.lt);
            Dfs(root.rt);
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
        Node rootNode = m.new Node(1);
        rootNode.lt = m.new Node(2);
        rootNode.rt = m.new Node(3);
        rootNode.lt.lt = m.new Node(4);
        rootNode.lt.rt = m.new Node(5);
        rootNode.rt.lt = m.new Node(6);
        rootNode.rt.rt = m.new Node(7);

        m.Dfs(rootNode);
    }
}