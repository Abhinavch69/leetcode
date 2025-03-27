import java.util.*;

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        boolean rev = false;
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currLevel = new ArrayList<>(levelSize);

            for (int i = 0; i < levelSize; i++) {
                if (!rev) {
                    TreeNode currNode = queue.pollFirst();
                    currLevel.add(currNode.val);
                    if (currNode.left != null) {
                        queue.addLast(currNode.left);
                    }
                    if (currNode.right != null) {
                        queue.addLast(currNode.right);
                    }
                } else {
                    TreeNode currNode = queue.pollLast();
                    currLevel.add(currNode.val);
                    // Fix: Ensure correct order of insertion (right first, then left)
                    if (currNode.right != null) {
                        queue.addFirst(currNode.right);
                    }
                    if (currNode.left != null) {
                        queue.addFirst(currNode.left);
                    }
                }
            }
            rev = !rev;
            result.add(currLevel);
        }
        return result;
    }
}
