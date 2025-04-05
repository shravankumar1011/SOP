import java.util.*;
public static int main maxDepth(TreeNode root) {
    return (root == null) ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right));
