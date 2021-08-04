#include <iostream>
using namespace std;

class Node
{
public:
    int key;
    Node *left;
    Node *right;

    Node(int key)
    {
        this->key = key;
        this->left = this->right = NULL;
    }
};

class BST
{
private:
    Node *root;

    Node *insert(Node *node, int key)
    {
        if (node == NULL)
        {
            return new Node(key);
        }
        if (key <= node->key)
        {
            node->left = insert(node->left, key);
        }
        else
        {
            node->right = insert(node->right, key);
        }
        return node;
    }

    Node *search(Node *node, int key)
    {
        if (node == NULL || node->key == key)
        {
            return node;
        }
        if (key < node->key)
        {
            return search(node->left, key);
        }
        return search(node->right, key);
    }

    void inOrder(Node *node)
    {
        if (node == NULL)
        {
            return;
        }
        inOrder(node->left);
        cout << node->key << " ";
        inOrder(node->right);
    }

    void preOrder(Node *node)
    {
        if (node == NULL)
        {
            return;
        }
        cout << node->key << " ";
        preOrder(node->left);
        preOrder(node->right);
    }

    void postOrder(Node *node)
    {
        if (node == NULL)
        {
            return;
        }
        postOrder(node->left);
        postOrder(node->right);
        cout << node->key << " ";
    }

public:
    BST()
    {
        this->root = NULL;
    }

    void insert(int key)
    {
        root = insert(root, key);
    }

    Node *search(int key)
    {
        return search(root, key);
    }

    void inOrder()
    {
        cout << "The inOrder traversal is: ";
        inOrder(root);
        cout << "\n";
    }

    void preOrder()
    {
        cout << "The preOrder traversal is: ";
        preOrder(root);
        cout << "\n";
    }

    void postOrder()
    {
        cout << "The postOrder traversal is: ";
        postOrder(root);
        cout << "\n";
    }
};

static void search(BST bst, int key)
{
    if (bst.search(key) != NULL)
    {
        cout << key << " found\n";
    }
    else
    {
        cout << key << " not found\n";
    }
}

int main()
{
    BST bst;
    bst.insert(10);
    bst.insert(15);
    bst.insert(5);
    bst.insert(8);
    bst.insert(18);
    bst.insert(12);
    bst.insert(10);

    bst.preOrder();
    bst.inOrder();
    bst.postOrder();

    search(bst, 12);
    search(bst, 9);
}