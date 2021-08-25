import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    private int value;
    private TreeNode leftNode;
    private TreeNode rightNode;

    TreeNode() {

    }

    TreeNode(int value) {
        this.value = value;
    }

    TreeNode(int value, TreeNode leftNode, TreeNode rightNode) {
        this.value = value;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    static void defaultGeneration(TreeNode root) {
        if ((root != null) && (root.leftNode == null) && (root.rightNode == null)) {
            root.leftNode = new TreeNode(1,
                    new TreeNode(2,                 //   ������������� ���������� ������ ����:
                            new TreeNode(4),        //                root
                            new TreeNode(5)),       //              /     \
                    new TreeNode(3,                 //             1       8
                            new TreeNode(6),        //           /  \      /  \
                            new TreeNode(7)));      //          2   3     9     10
            root.rightNode = new TreeNode(8,        //        / \   / \   /  \   / \
                    new TreeNode(9,                 //       4   5  6  7   11 12 13 14
                            new TreeNode(11),       //
                            new TreeNode(12)),
                    new TreeNode(10,
                            new TreeNode(13),
                            new TreeNode(14)));
        }

        if (root.value == 0) {                                //   ������������� ���������� ������ ����:
            root.value = 1;                                //               1
            root.leftNode = new TreeNode(2,          //             /   \
                    new TreeNode(4),                 //            2     3
                    new TreeNode(5));                //          /  \   /  \
            root.rightNode = new TreeNode(3,         //         4    5 6    7
                    new TreeNode(6),                 //
                    new TreeNode(7));
        }
    }

    static List<Integer> inorderTraversal(TreeNode root) {
        //�������������� ��� ������ (Inorder traversal)
        // ������� �������� ��� ���� � ����� ���������
        // ����� �������� ����
        // �������� ��� ���� � ������ ���������
        List<Integer> res = new ArrayList<>();
        helperInorderTraversal(root, res);
        return res;
    }

    private static void helperInorderTraversal(TreeNode root, List<Integer> res) {
        if (root != null) {
            if (root.leftNode != null) {
                helperInorderTraversal(root.leftNode, res);
            }
            res.add(root.value);
            if (root.rightNode != null) {
                helperInorderTraversal(root.rightNode, res);
            }
        }
    }

    static List<Integer> preorderTraversal(TreeNode root){
        //������ ��� ������ (Pre-order traversal)
        // �������� ������
        // ������ ����� ���������
        // ������ ������ ���������
        List<Integer> res = new ArrayList<>();
        helperPreorderTraversal(root, res);
        return res;

    }
    private static void helperPreorderTraversal(TreeNode root, List<Integer> res) {
        if (root != null) {
            res.add(root.value);
            if (root.leftNode != null) {
                helperPreorderTraversal(root.leftNode, res);
            }

            if (root.rightNode != null) {
                helperPreorderTraversal(root.rightNode, res);
            }
        }
    }
}
