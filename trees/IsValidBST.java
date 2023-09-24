//The common iterative inorder traversal concept using Stack which can be used to solve multiple Trees problems such as Binary Tree Inorder Traversal, 
// Kth Smallest Element in a BST, isValidBST etc..
//Note Point: For any BST, to pring in Ascending order, user inorder traversal concept

class TreeNode{

  TreeNode left;
  TreeNode right;
  int val;

  public TreeNode(TreeNode left, TreeNode right, int val){
   this.left = left;
    this.right = right;
    this.val = val;
    
  }

}

class IsValidBST{

  public boolean isValidBST(TreeNode node){

    Stack<TreeNode> st = new Stack<>();
  ListNode prev = null
    while(node != null || !st.isEmpty()){

      while(node != null){
   st.push(node);
        node = node.left;
        
      }

      node = st.pop();
      if(prev != null && root.val <= prev.val)return false;
    prev = root;
    root = root.right;
      
    }
    return true;
  }

  
}

