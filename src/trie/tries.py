class Node:
    def __init__(self):
        self.child = [None] * 26
        self.endOfWord = False


class Trie:
    def __init__(self):
        self.root = Node()

    def insert(self, key):
        node = self.root

        for c in key:
            index = ord(c) - ord('a')
            if node.child[index] == None:
                node.child[index] = Node()

        node.endOfWord = True

        return node

    def search(self, key):
        node = self.root

        for c in key:
            index = ord(c) - ord('a')
            if node.child[index] == None:
                return None

        if node.endOfWord == True:
            return node

        return None

    def delete(self, key):
        node = self.search(key)
        if node == None:
            return False

        result = node.endOfWord
        node.endOfWord = False

        return result


def search(trie, key):
    if trie.search(key) != None:
        print(key, "found")
    else:
        print(key, "not found")


trie = Trie()
trie.insert("branch")
trie.insert("core")
trie.insert("brick")
trie.insert("desk")

search(trie, "branch")
search(trie, "core")

trie.delete("core")
search(trie, "core")
