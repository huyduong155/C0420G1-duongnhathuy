package JavaCollectionFramework.thucHanh.caiDatBST;

public class TreeNode<E> {
    protected E element;
    protected TreeNode<E> left;
    protected TreeNode<E> right;

    public TreeNode(E e) {
        this.element = e;
    }
    public interface Tree<E>{
        public boolean inSearch(E e);
        public void inorder();
        public int getSize();
        public boolean searchTree(E e);
    }
}
