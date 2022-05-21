#include <iostream>
using namespace std;

#define SIZE 26

class Node
{
public:
    Node *child[SIZE];
    bool endOfWord;

    Node()
    {
        for (int i = 0; i < SIZE; ++i)
        {
            child[i] = nullptr;
        }
        this->endOfWord = false;
    }
};

class Trie
{
private:
    Node *root;

public:
    Trie()
    {
        this->root = new Node();
    }

    void insert(string s)
    {
        Node *node = root;

        for (int i = 0; i < s.length(); ++i)
        {
            int index = s[i] - 'a';
            if (node->child[index] == nullptr)
            {
                node->child[index] = new Node();
            }
            node = node->child[index];
        }

        node->endOfWord = true;
    }

    Node *search(string s)
    {
        Node *node = root;

        for (int i = 0; i < s.length(); ++i)
        {
            int index = s[i] - 'a';
            if (node->child[index] == nullptr)
            {
                return nullptr;
            }
            node = node->child[index];
        }

        if (node->endOfWord)
        {
            return node;
        }
        return nullptr;
    }

    bool _delete(string s)
    {
        Node *node = search(s);
        if (node == nullptr)
        {
            return false;
        }

        bool result = node->endOfWord;
        node->endOfWord = false;

        return result;
    }
};

static void search(Trie trie, string s)
{
    if (trie.search(s) != nullptr)
    {
        cout << s << " found\n";
    }
    else
    {
        cout << s << " not found\n";
    }
}

int main()
{
    Trie trie;
    trie.insert("branch");
    trie.insert("core");
    trie.insert("brick");
    trie.insert("desk");

    search(trie, "branch");
    search(trie, "core");

    trie._delete("core");
    search(trie, "core");
}