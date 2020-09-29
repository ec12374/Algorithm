import java.util.*;
import java.util.LinkedList;

public class VerticalOrderTraversal {

	public void printVerticalTree(TreeNode root) {

		// LinkedList<Integer> list = new LinkedList<>();
		TreeMap<Integer, LinkedList<Integer>> map = new TreeMap<>();

		addNodeAccToLevelInMap(root, 0, map);
		System.out.println(map);

		Set<Integer> levels = map.keySet();

		for (Integer level : levels) {

			LinkedList<Integer> list = map.get(level);
			for (Integer value : list) {

				System.out.print(value + " ");
			}
			System.out.println();
		}

	}

	public void addNodeAccToLevelInMap(TreeNode root, int level, TreeMap<Integer, LinkedList<Integer>> map) {
		if (root == null)
			return;

		LinkedList<Integer> list = map.get(level);
		if (list == null) {
			list = new LinkedList<>();
			list.add(root.data);
		} else
			list.add(root.data);

		map.put(level, list);

		addNodeAccToLevelInMap(root.left, level - 1, map);
		addNodeAccToLevelInMap(root.right, level + 1, map);
	}

	public static void main(String[] args) {

		VerticalOrderTraversal vot = new VerticalOrderTraversal();
		BinaryTreeUtility bt = new BinaryTreeUtility();
		TreeNode root = bt.createBT(10);
		BinaryTreeUtility.print(root);
		vot.printVerticalTree(root);

	}

}
