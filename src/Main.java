import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode();
        TreeNode.defaultGeneration(root);
        TreeNode root1 = new TreeNode(55);
        TreeNode.defaultGeneration(root1);
        //List<Integer> inOrderList = new LinkedList<>();
        //   for (Integer integer : inOrderList = TreeNode.inorderTraversal(root1)) {
        //       System.out.println(integer);
        //    }
        //for (Integer integer : inOrderList = TreeNode.inorderTraversal(root)) {
        //    System.out.println(integer);
        // }
        // List<Integer> preOrderList = new LinkedList<>();
        // for (Integer integer : preOrderList = TreeNode.preorderTraversal(root)) {
        //     System.out.println(integer);
        // }
         List<Integer> postOrderList = new LinkedList<>();
         for (Integer integer : postOrderList = TreeNode.postOrderTraversal(root)) {
             System.out.println(integer);
         }
    }
}
