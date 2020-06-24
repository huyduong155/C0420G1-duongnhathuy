package JavaCollectionFramework.baiTap;

import java.util.Scanner;

public class Test {
    static class Node
    {
        public int key;
        public Node left;
        public Node right;
        public Node(int item)
        {
            key = item;
            left = right = null;
        }
        public Node()
        {
            //do nothing
        }
    }
    static class Tree
    {
        public Node root;

        public void add(int key)
        {
            Node temp=root;
            if(root==null)
            {
                root=new Node(key);
            }
            else
            {
                while(temp!=null)
                {
                    if(temp.key==key) return;
                    if(temp.key>key)
                    {
                        if(temp.left==null)
                        {
                            temp.left=new Node(key);
                            return;
                        }
                        temp=temp.left;
                    }
                    else
                    {
                        if(temp.right==null)
                        {
                            temp.right=new Node(key);
                            return;
                        }
                        temp=temp.right;
                    }
                }
            }
        }
        public void remove(int key) {
            this.root=deleteNode(root,key);
        }

        public Node deleteNode(Node root, int key) {
            if(root==null)
                return null;
            if(root.key>key) {
                root.left=deleteNode(root.left,key);
            } else {
                if(root.key<key) {
                    root.right=deleteNode(root.right,key);
                } else {
                    //if same
                    if(root.left==null)
                        return root.right;
                    if(root.right==null)
                        return root.left;
                    //ortherwise, find min at right subtree
                    Node temp=root.right;
                    while(temp!=null) {
                        if(temp.left==null)
                            break;
                        temp=temp.left;
                    }
                    int min_at_right=temp.key;
                    root.key=min_at_right;
                    root.right = deleteNode(root.right,min_at_right);
                }
            }
            return root;
        }
        void show(Node root)
        {
            if(root!=null)
            {
                System.out.print(root.key + " ");
                show(root.left);
                show(root.right);
            }
        }
    }
    static class Solution
    {
        public static void main(String args[])
        {
            Scanner in=new Scanner(System.in);
            Tree t=new Tree();
            int x=9;
            while(x!=0)
            {
                x=in.nextInt();
                if(x!=0)
                {
                    t.add(x);
                }
            }
            t.show(t.root);
            t.remove(100);
            System.out.println();
            t.show(t.root);
        }
    }
}
