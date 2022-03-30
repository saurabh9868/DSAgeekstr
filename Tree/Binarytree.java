package DsaGeekster.Tree;

import java.util.*;

public class Binarytree {
    private  treeNode root;
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
    //inorder traversal using recursion
    public static  void inorder(treeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    // preorder traversal using recursion
    public static  void preorder(treeNode root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    // postorder traversal using recursion
    public static  void postorder(treeNode root){
        if(root==null){
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    // height of a tree
    public static int height(treeNode root){
        if(root==null){
            return 0;
        }
        int leftheight=height(root.left);
        int rightheight=height(root.right);

        if(leftheight>rightheight){
            return leftheight+1;
        }
        else if(rightheight>=leftheight){
            return rightheight+1;
        }
        return -1;
    }
   // count the node in the binary tree
    public static int countNode(treeNode root){
        if(root==null){
            return 0;
        }
        int count=1;
        int left=countNode(root.left);
        int right=countNode(root.right);
        count=count+left+right;
        return count;
    }
    // print the leaf node of the binary tree
    public static void PrintLeafNodes(treeNode root){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            System.out.print(root.data+" ");
        }
        PrintLeafNodes(root.left);
        PrintLeafNodes(root.right);
    }
   // sum of the all nodes data
    public static int  sumOfNodes(treeNode root){
        if(root==null){
            return 0;
        }
        int sum= root.data;
        int leftSum=sumOfNodes(root.left);
        int rightsum=sumOfNodes(root.right);
        sum=sum+leftSum+rightsum;
        return sum;
    }
    // print the kth level of a binary tree
    public static void printKthLevel(treeNode root,int level){
        if (root==null){
            System.out.println("tree is empty enable to print");
        }
        Queue<treeNode> q=new LinkedList<>();
        q.add(root);
        int kthlevel=0;
        while(!q.isEmpty() && kthlevel!=level){
            int k= q.size();
            for(int i=0;i<k;i++){
                treeNode temp= q.poll();
                if(temp.left!=null){
                q.add(temp.left);
                }
                if(temp.right!=null){
                q.add(temp.right);
                }
            }
            kthlevel++;
        }
        while (!q.isEmpty()){
            treeNode temp=q.poll();
            System.out.print(temp.data+" ");
        }
    }
    // print the right view of a tree
    public static void rightNodes(treeNode root){
        if (root==null){
            System.out.println("tree is empty enable to print");
        }
        Queue<treeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int k= q.size();
            for(int i=0;i<k;i++){
                treeNode temp= q.poll();
                if(i==k-1){
                    System.out.print(temp.data+" ");
                }
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
        }
    }
    // recursive approach of levelorder traversal
    public static void levelOrder(treeNode root){
        if(root==null){
            return;
        }
        Queue<treeNode> q=new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            int size= q.size();
            for (int i=0;i<size;i++){
                treeNode temp= q.poll();
                System.out.print(temp.data+" ");
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
        }
    }
    // recursive approach of level order traversal
    public static void levelOrderRecursive(treeNode root ,int level){
        if(root==null){
            return;
        }
        for (int i=0;i<=level;i++){
            printKthLevel(root ,i);
        }
    }
    // check wheather the target sum is exist or not
    public static  boolean hasPathSum(treeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        if(root.data==targetSum && root.left==null && root.right==null){
            return true;
        }

        int sum=root.data;   // 5
        if(hasPathSum(root.left,targetSum-sum)){
            return true;
        }
        if(hasPathSum(root.right,targetSum-sum)){
            return true;
        }

        return false;
    }
    // calculate the average of tree levelwise
    public static int[] average(treeNode root){
        if(root==null){
            System.out.println("empty tree not any average is possible");
        }
        Queue<treeNode> q=new LinkedList<>();
        q.add(root);
        int arr[]=new int[height(root)];
        int z=0;
        while(!q.isEmpty()){
            int k= q.size();
            int sum=0;
            for(int i=0;i<k;i++){
                treeNode temp= q.poll();
                sum+= temp.data;
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
            arr[z++]=sum/k;
        }
     return arr;
    }
    // check wheather the leaf node of both trees are same or not
    public  static boolean leafSimilar(treeNode root1, treeNode root2) {
        ArrayList ls1 = new ArrayList<>();
        ArrayList ls2 = new ArrayList<>();
        helper(root1, ls1);
        helper(root2, ls2);
        int i = 0;
        if (ls1.size() != ls2.size()) {
            return false;
        }
        while (i < ls1.size()) {
            if(ls1.get(i) != ls2.get(i)) {
                return false;
            }
            i++;
        }
        return true;
    }
    // helper method for checking the leaf node same or not of both binary trees
    public static void helper(treeNode root, ArrayList list) {
        if (root == null) {
            return;
        }
        if (root.right == null && root.left == null) {
            list.add(root.data);
        }
        helper(root.left, list);
        helper(root.right, list);
    }
    // method for finding the level whose sum is maximum
    public static int MaximumLevelSum(treeNode root){
        if(root==null){
            return 0;
        }
        int max=Integer.MIN_VALUE;
        int level=-1;
        Queue<treeNode> q=new LinkedList<>();
        q.add(root);
        int count=0;
        while (!q.isEmpty()){
            int k=q.size();
            count++;
            int sum=0;
            for(int i=0;i<k;i++){
                treeNode temp=q.poll();
                if(temp.left!=null){
                q.add(temp.left);
                }
                if(temp.right!=null){
                q.add(temp.right);
                }
                sum+= temp.data;
            }
            if(max<sum){
                max=sum;
                level=count;
            }
        }
        return level;
    }

    // print the tree in a spiral mode
    public static void printSpiralTree(treeNode root){
        int height=height(root);
        boolean ltr=false;
        for (int i=1;i<=height;i++){
            printlevel(root,i,ltr);

            ltr=!ltr;
        }
    }

    // helping method for printing the  tree in a spiral manner
    public static void printlevel(treeNode root,int level,boolean itr){
        if(root==null){
            return;
        }
        if(level==1){
            System.out.print(root.data+" ");
        }
        else if(level>1){
            if(itr){
                printlevel(root.left,level-1,itr);
                printlevel(root.right,level-1,itr);
            }
            else{
                printlevel(root.right,level-1,itr);
                printlevel(root.left,level-1,itr);
            }
        }
    }
    public static void main(String[] args) {
        Binarytree bt=new Binarytree();
        treeNode t1=new treeNode(1);
        treeNode t2=new treeNode(2);
        treeNode t3=new treeNode(3);
        treeNode t4=new treeNode(4);
        treeNode t5=new treeNode(5);
        treeNode t6=new treeNode(6);
        treeNode t7=new treeNode(7);
        treeNode t8=new treeNode(8);
        treeNode t9=new treeNode(9);
        bt.root=t1;
        bt.root.left=t2;
        bt.root.right=t3;
        bt.root.left.left=t4;
        bt.root.left.right=t5;
        bt.root.right.left=t6;
        bt.root.right.left.right=t7;
        bt.root.left.left.left=t8;
        bt.root.left.left.left.left=t9;
        inorder(bt.root);
        System.out.println();
        preorder(bt.root);
        System.out.println();
        postorder(bt.root);
        System.out.println();
        System.out.println(height(bt.root));
        System.out.println(countNode(bt.root));
        PrintLeafNodes(bt.root);
        System.out.println();
        System.out.println(sumOfNodes(bt.root));
        printKthLevel(bt.root,2);
        System.out.println();
        rightNodes(bt.root);
        System.out.println();
        levelOrder(bt.root);
        System.out.println();
        levelOrderRecursive(bt.root,4);
        System.out.println();
        System.out.println(hasPathSum(bt.root,17));
        System.out.println(Arrays.toString(average(bt.root)));
        System.out.println(MaximumLevelSum(bt.root));
        printSpiralTree(bt.root);
    }
}
/*    1
   2,     3
 4,  5, 6
8         7
9
* */