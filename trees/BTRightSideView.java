//Since we want to right side view of the binary tree, perform the preorder traversal but move on right side of tree first instead of traversing ont the left
// Ex: root -> right -> left
//Maintain a curr level so that if we've reached where curr level == res.size() it means that's going to be out right view


class BTRightSideView{
List<Integer> res = new ArrayList<>();
public List<Integer> binaryTreeRightSideView(TreeNode node){

  if(node == null)return res;
  dfs(node, 0);
  return res;
}

  public void dfs(TreeNode node, int curr){
  if(node == null)return;

    if(curr == res.size())res.add(root.val);

    dfs(root.right, curr + 1);
    dfs(root.left, curr + 1);
    
  }
  
}

