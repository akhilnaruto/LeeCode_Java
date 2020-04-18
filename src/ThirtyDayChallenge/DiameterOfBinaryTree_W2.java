package ThirtyDayChallenge;

public class DiameterOfBinaryTree_W2 {

	public int diameterOfBinaryTree(TreeNode root) {
		int leftHeight = 0;
		int rightHeight = 0;
		if (root == null)
			return 0;
		leftHeight = getLength(root.left, 0);
		rightHeight = getLength(root.right, 0);
		return leftHeight + rightHeight + 1;
	}

	public int getLength(TreeNode node, int height) {
		if (node == null)
			return height;
		height++;
		int ans = Math.max(getLength(node.left, height), getLength(node.right, height));
		return ans;
	}
}

abstract class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}
