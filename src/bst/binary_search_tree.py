class Node:
    def __init__(self, key):
        self.key = key
        self.left = None
        self.right = None


class BST:
    def __init__(self):
        self.root = None

    def insert(self, key):
        self.root = self.__insert__(self.root, key)

    def __insert__(self, node, key):
        if node is None:
            return Node(key)

        if key <= node.key:
            node.left = self.__insert__(node.left, key)

        else:
            node.right = self.__insert__(node.right, key)

        return node

    def search(self, key):
        return self.__search__(self.root, key)

    def __search__(self, node, key):
        if node is None or node.key == key:
            return node

        if key <= node.key:
            return self.__search__(node.left, key)

        return self.__search__(node.right, key)

    def inOrder(self):
        print("The inOrder traversal is: ", end=" ")
        self.__inOrder__(self.root)
        print()

    def __inOrder__(self, node):
        if node == None:
            return

        self.__inOrder__(node.left)
        print(node.key, end=" ")
        self.__inOrder__(node.right)

    def preOrder(self):
        print("The preOrder traversal is: ", end=" ")
        self.__preOrder__(self.root)
        print()

    def __preOrder__(self, node):
        if node == None:
            return

        print(node.key, end=" ")
        self.__preOrder__(node.left)
        self.__preOrder__(node.right)

    def postOrder(self):
        print("The preOrder traversal is: ", end=" ")
        self.__postOrder__(self.root)
        print()

    def __postOrder__(self, node):
        if node == None:
            return

        self.__postOrder__(node.left)
        self.__postOrder__(node.right)
        print(node.key, end=" ")


def search(bst, key):
    if bst.search(key) != None:
        print(key, "found")
    else:
        print(key, "not found")


bst = BST()
bst.insert(10)
bst.insert(15)
bst.insert(5)
bst.insert(8)
bst.insert(18)
bst.insert(12)
bst.insert(10)

bst.preOrder()
bst.inOrder()
bst.postOrder()

search(bst, 12)
search(bst, 9)
