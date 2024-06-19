class AVLTree {
    class Node {
        int key, height;
        Node left, right;
    
        Node(int d) {
            key = d;
            height = 1;
        }
    }
	Node root;
	int height(Node N) {
		if (N == null)
			return 0;

		return N.height;
	}
	int max(int a, int b) {
		return (a > b) ? a : b;
	}
	Node rightRotate(Node y) {
		Node x = y.left;
		Node T2 = x.right;
		x.right = y;
		y.left = T2;
		y.height = max(height(y.left), height(y.right)) + 1;
		x.height = max(height(x.left), height(x.right)) + 1;
		return x;
	}
	Node leftRotate(Node x) {
		Node y = x.right;
		Node T2 = y.left;
		y.left = x;
		x.right = T2;
		x.height = max(height(x.left), height(x.right)) + 1;
		y.height = max(height(y.left), height(y.right)) + 1;
		return y;
	}
	int getBalance(Node N) {
		if (N == null)
			return 0;

		return height(N.left) - height(N.right);
	}

	Node insert(Node node, int key) {
		if (node == null)
			return (new Node(key));

		if (key < node.key)
			node.left = insert(node.left, key);
		else if (key > node.key)
			node.right = insert(node.right, key);
		else 
			return node;
		node.height = 1 + max(height(node.left),
							height(node.right));
		int balance = getBalance(node);
        // Left Left
		if (balance > 1 && key < node.left.key)
			return rightRotate(node);

		// Right Right 
		if (balance < -1 && key > node.right.key)
			return leftRotate(node);

		// Left Right 
		if (balance > 1 && key > node.left.key) {
			node.left = leftRotate(node.left);
			return rightRotate(node);
		}

		// Right Left 
		if (balance < -1 && key < node.right.key) {
			node.right = rightRotate(node.right);
			return leftRotate(node);
		}

		/* return the (unchanged) node pointer */
		return node;
	}
	void preOrder(Node node) {
		if (node != null) {
			System.out.print(node.key + " ");
			preOrder(node.left);
			preOrder(node.right);
		}
	}

	public static void main(String[] args) {
		AVLTree tree = new AVLTree();
		tree.root = tree.insert(tree.root, 3);
		tree.root = tree.insert(tree.root, 2);
		tree.root = tree.insert(tree.root, 1);
		tree.root = tree.insert(tree.root, 4);
		tree.root = tree.insert(tree.root, 5);
		tree.root = tree.insert(tree.root, 6);
        tree.root = tree.insert(tree.root, 7);
        tree.root = tree.insert(tree.root, 8);
        tree.root = tree.insert(tree.root, 9);
		System.out.println("Preorder traversal" +
						" of constructed tree is : ");
		tree.preOrder(tree.root);
	}
}

