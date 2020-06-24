package JavaCollectionFramework.baiTap.duyetPostorder_Preorder;

public class TestBST {
    public static void main(String[] args) {
        BST<Integer> tree=new BST<>();
        tree.inSearch(60);
        tree.inSearch(55);
        tree.inSearch(100);
        tree.inSearch(45);
        tree.inSearch(57);
        tree.inSearch(59);
        tree.inSearch(67);
        tree.inSearch(107);
        tree.inSearch(101);
        System.out.println("Postorder (sorted): ");
        tree.postorder();
        System.out.println(" ");
        tree.preorder();
        System.out.println(" ");
        System.out.println(tree.getSize());

    }
}
