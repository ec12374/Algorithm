import java.util.Random;

public class BinaryTreeUtility {

	TreeNode root;
	static int i;

	public static TreeNode createBT(int nodes) {

		if (nodes < 1)
			return null;
		else if (nodes == 1)
			return new TreeNode(++i);
		else {

			TreeNode root = new TreeNode(i++);
			for (int j = 1; j < nodes; ++j) {

				TreeNode newNode = new TreeNode(i++);
				BinaryTreeUtility.addNode(root, newNode);
			}
			return root;
		}

	}

	public static void addNode(TreeNode root, TreeNode givenNode) {

		Random r = new Random();
		TreeNode currentNode = root;
		while (true) {

			if (r.nextInt(2) == 0) {
				if (currentNode.left != null) {

					currentNode = currentNode.left;
				} else {
					currentNode.left = givenNode;
					break;

				}

			} else {

				if (currentNode.right != null) {

					currentNode = currentNode.right;
				}

				else {
					currentNode.right = givenNode;
					break;
				}

			}

		}

	}

	// TC:O(n ^ 2)
	// SC:O(n)
	public static void print(TreeNode root) {
		printHelper(root, 0, "root");
	}

	private static void printHelper(TreeNode root, int nspaces, String type) {
		if (root == null)
			return;
		for (int i = 0; i < nspaces; ++i)
			System.out.print(' ');
		System.out.println(root.data + "(" + type + ")");
		printHelper(root.left, nspaces + 4, "L");
		printHelper(root.right, nspaces + 4, "R");
	}

}
