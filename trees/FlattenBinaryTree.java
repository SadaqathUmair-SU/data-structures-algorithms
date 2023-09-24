//1) We've to point all the nodes to the right (similar to LinkedList) and all the nodes left as null and also it should be in preorder traversal
//2) Do the recursive of all the right first
//3) Then do the recursive of all the left;
//4) Maitain the node which should store prev node while traversing the tree right and left side
//5)Note that when we traverse first right and then left, our prev wiil have the latest node which is on the left side that is what we need to point our first root's right
//6) Hence likewise, it will point all the nodes to the right in the order of preorder traversal
 

class FlattenBinaryTree{

  TreeNode prev = null;
  public void flattenBT(TreeNode root){
if(root == null)return;
   flattenBT(root.right);
    flatterBT(root.left);
    root.right = prev;
    root.left = null;
    prev = root;
    
  }


  
}
