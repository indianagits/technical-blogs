package trie;

class Node {
    public Node[] child;
    public boolean endOfWord;

    public Node() {
        this.child = new Node[26];
        this.endOfWord = false;
    }
}

class Trie {
    private Node root = new Node();

    public void insert(String s) {
        Node node = root;

        for (char c : s.toCharArray()) {
            int index = c - 'a';
            if (node.child[index] == null) {
                node.child[index] = new Node();
            }
            node = node.child[index];
        }

        node.endOfWord = true;
    }

    public Node search(String s) {
        Node node = root;

        for (char c : s.toCharArray()) {
            int index = c - 'a';
            if (node.child[index] == null) {
                return null;
            }
            node = node.child[index];
        }

        if (node.endOfWord) {
            return node;
        }
        return null;
    }

    public boolean delete(String s) {
        Node node = search(s);
        if (node == null) {
            return false;
        }

        boolean result = node.endOfWord;
        node.endOfWord = false;

        return result;
    }

    public void print() {
        System.out.print("The contents of trie are: ");
        print(root);
    }

    private void print(Node node) {
        if (root == null) {
            return;
        }
        for (int i = 0; i < 26; ++i) {
            if (node.child[i] != null) {
                System.out.print('a' + i + " ");
                print(node.child[i]);
            }
        }
    }
}

public class Tries {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("branch");
        trie.insert("core");
        trie.insert("brick");
        trie.insert("desk");

        search(trie, "branch");
        search(trie, "core");

        trie.delete("core");
        search(trie, "core");
    }

    private static void search(Trie trie, String s) {
        Node result = trie.search(s);
        if (result != null && result.endOfWord) {
            System.out.println(s + " found");
        } else {
            System.out.println(s + " not found");
        }
    }
}
