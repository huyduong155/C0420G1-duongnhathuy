package JavaCollectionFramework.baiTap.duyetPostorder_Preorder;

public class TreeNode<E> {
    protected E element;
    protected TreeNode<E> left;
    protected TreeNode<E> right;

    public TreeNode(E e) {
        this.element = e;
    }
    public interface Tree<E>{
        public boolean inSearch(E e);
        public void postorder();
        public int getSize ();
        public void preorder();
    }
}
