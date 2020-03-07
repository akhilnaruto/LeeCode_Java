package Medium;

public class BinaryTree {
	TreeNode root;
    void insert(int key) { 
        root = insertRec(root, key); 
     } 
       
     /* A recursive function to insert a new key in BST */
     public TreeNode insertRec(TreeNode root, int key) { 
   
         /* If the tree is empty, return a new node */
         if (root == null) { 
             root = new TreeNode(key); 
             return root; 
         } 
   
         /* Otherwise, recur down the tree */
         if (key < root.val) 
             root.left = insertRec(root.left, key); 
         else if (key >= root.val) 
             root.right = insertRec(root.right, key); 
   
         /* return the (unchanged) node pointer */
         return root; 
     } 
   

}
