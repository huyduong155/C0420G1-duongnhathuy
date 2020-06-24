package JavaCollectionFramework.baiTap.duyetPostorder_Preorder;

public class BST<E extends Comparable<E>> extends AbstractTree<E> {
    protected TreeNode<E> root;
    protected int size=0;

    public BST() {
    }

    public BST(E[] Object) {
        for (int i=0;i<Object.length;i++){
            inSearch(Object[i]);
        }
    }
    protected TreeNode<E> createTreenode(E e){
        return new TreeNode<>(e);
    }

    @Override
    public boolean inSearch(E e) {
        if (root==null){
            root=createTreenode(e);
        }else {
            TreeNode<E> parent=null;
            TreeNode<E> curent=root;
            while (curent!=null){
                if (e.compareTo(curent.element)<0){
                    parent=curent;
                    curent=curent.left;
                }else if (e.compareTo(curent.element)>0){
                    parent=curent;
                    curent=curent.right;
                }else
                    return false;
            }
            if (e.compareTo(parent.element)<0){
                parent.left=createTreenode(e);
            }else
            parent.right=createTreenode(e);
        }
        size++;
        return true;
    }


    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void postorder() {
        postorder(root);
    }
    protected void postorder(TreeNode<E> root){
        if (root==null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.element+"\t");
    }


    public void preorder(TreeNode<E> root ) {
        if (root==null){
            return;
        }
        System.out.print(root.element+"\t");
        postorder(root.left);
        postorder(root.right);
    }
    @Override
        public void preorder(){
        preorder(root);
    }



}
