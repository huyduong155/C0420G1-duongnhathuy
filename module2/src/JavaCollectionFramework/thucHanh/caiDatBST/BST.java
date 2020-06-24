package JavaCollectionFramework.thucHanh.caiDatBST;

public class BST<E extends Comparable<E>> extends AbstractTree<E>{
    protected TreeNode<E> root;
    protected int size=0;

    public BST() {
    }

    public BST(E[] object) {
        for (int i=0;i<object.length;i++){
            inSearch(object[i]);
        }
    }
    protected TreeNode<E> createNewNode(E e){
        return new TreeNode<>(e);
    }

    @Override
    public boolean inSearch(E e) {
        if (root==null){
            root=createNewNode(e);
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
                parent.left=createNewNode(e);
            }else
                parent.right=createNewNode(e);
        }
        size++;
        return true;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void inorder() {
        inorder(root);
    }
    protected void inorder(TreeNode<E> root){
        if (root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.element + " ");
        inorder(root.right);

    }

    @Override
    public boolean searchTree(E e) {
        TreeNode<E> curent=root;
        while (curent!=null){
            if (e.compareTo(curent.element)<0){
                curent=curent.left;
            }else if (e.compareTo(curent.element)>0){
                curent=curent.right;
            }else if (e.compareTo(curent.element)==0){
                return true;
            }
        }
        return false;
    }
}
