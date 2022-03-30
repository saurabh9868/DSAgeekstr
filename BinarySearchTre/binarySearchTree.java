package DsaGeekster.BinarySearchTre;

import DsaGeekster.Tree.Binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class binarySearchTree {
    private treeNode root;
    private static class treeNode {
        private int data;
        private treeNode left;
        private treeNode right;
        public treeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    // method for inserting the data or node into  the binary tree
    public void insert(int data) {
        root=insert(root,data);
    }
    public static treeNode insert(treeNode root,int data){
        if(root==null){
            root=new treeNode(data);
            return root;
        }
        if(root.data==data){
            return root;
        }
        if(root.data>data){
            root.left=insert(root.left,data);
        }
        if(root.data<data){
            root.right=insert(root.right,data);
        }
        return root;
    }
    // method for merge the two trees data
    public static void mergeTree(treeNode root,int arr[]){
        for(int i=0;i< arr.length;i++){
            insert( root,arr[i]);
        }
    }
    // inorder traversal of the binary search tree
    public static void inorder(treeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    // method for adding the all node in queue so we can used that method in others
    public static void addNodeInQueue(treeNode root, Queue<Integer> q){
        if(root==null){
            return;
        }
        Stack<treeNode> stack=new Stack<>();
        treeNode temp=root;
        while(!stack.isEmpty() || temp!=null){
            if(temp!=null){
                stack.push(temp);
                temp=temp.left;
            }
            else{
                temp=stack.pop();
                q.add(temp.data);
                temp=temp.right;
            }
        }
    }

    // kth smallest node into the tree
    public static int kthSmallest(treeNode root,int k,Queue<Integer> q ){
        addNodeInQueue(root,q);
        int element=0;
        for(int i=0;i<k;i++){
            element= q.poll();
        }
        return element;
    }
    // making an increasing order binary search tree by an normal bst  using addNodeInqueue method which i made previously
    public static void increasingOrderBST(treeNode root,Queue<Integer> q){
        addNodeInQueue(root,q);
        while (!q.isEmpty()){
            System.out.print(q.poll()+" ");
        }
    }
    // check weather the tree is valid binary search tree or not
    public static boolean isValid(treeNode root){
        return isvalid( root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    public static boolean isvalid(treeNode root,int min,int max){
        if(root==null){
            return true;
        }
        if(root.data>=min && root.data<=max){
            return true;
        }
        boolean left=isvalid(root.left,min,root.data);
        if(left){
            return isvalid(root.right, root.data,max);
        }
        return false;
    }
    // calculate the sum of those node which are equal to the range  or between the given range
    public static int rangeSumBst(treeNode root,int low,int high){
        if(root==null){
            return 0;
        }
        if(root.data>high){
            return rangeSumBst(root.left,low,high);
        }
        if(root.data<low){
            return rangeSumBst(root.right,low,high);
        }
        return root.data+rangeSumBst(root.left,low,high)+rangeSumBst(root.right,low,high);
    }
    // finding the lowest node which is common ancestor of both p and q node
    public static treeNode lowestCommonAncestor(treeNode root,treeNode q,treeNode p){
        if(root.data>p.data && root.data> q.data){
            return lowestCommonAncestor(root.left,q,p);
        }
        else if(root.data<p.data && root.data< q.data){
            return lowestCommonAncestor(root.right,q,p);
        }
        else {
            return root;
        }
    }
    // find the predecessor and sucessor of an binary search tree
    public static int [] InorderSuccessorPredecessor(treeNode root ,int value,int[] arr ){
        if(root==null){
            return arr;
        }
        if(root!=null) {
            if (root.data == value) {
                // find the Successor

                if (root.right != null) {
                    treeNode t = root.right;

                    while (t.left != null) {
                        t = t.left;
                    }
                    arr[0]=t.data;
                }

                // predecessor of the tree
                if (root.left != null) {
                    treeNode t = root.left;

                    while (t.right != null) {
                        t = t.right;
                    }
                    arr[1]=t.data;
                }
            } else if (root.data > value) {

                arr[0] = root.data;
                InorderSuccessorPredecessor(root.left, value,arr);
            } else if (root.data < value) {

                arr[1] = root.data;
                InorderSuccessorPredecessor(root.right, value,arr);
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        binarySearchTree bst=new binarySearchTree();
        bst.insert(25);
        bst.insert(15);
        bst.insert(40);
        bst.insert(10);
        bst.insert(18);
        bst.insert(5);
        bst.insert(19);
        bst.insert(20);
        bst.insert(35);
        bst.insert(45);
        bst.insert(44);
        bst.insert(49);

        inorder(bst.root);
        System.out.println();
        int arr[]=new int[2];
       InorderSuccessorPredecessor(bst.root,15,arr);

        System.out.println("sucessor is "+arr[0]+" & predecessor is "+arr[1]);
    }
}
