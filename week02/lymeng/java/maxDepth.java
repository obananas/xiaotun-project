import java.util.LinkedList;
import java.util.Queue;

public class maxDepth {
    public int maxDepth(TreeNode root) {
        if (root==null){
            return 0;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        int depth=0;
        while (!queue.isEmpty()){
            int size=queue.size();
            while (size>0){
                TreeNode node=queue.poll();
                if (node.left!=null){
                    queue.offer(node.left);
                }
                if (node.right!=null){
                    queue.offer(node.right);
                }
                size--;
            }
            depth++;
        }
        return depth;
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
