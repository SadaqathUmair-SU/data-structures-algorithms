//Approach:
// Think of traversing from root to leafs using recursive until root.left && root.right == null, because we want root to leaf all nodes
// Do the simple preorder traversal, because we want all the paths which are from root to all the leafs
// while at root i.e, before the call for left and right, calculate the sum using the technique givien below. Ex if we have 12 then the forumula is for each digit => 1 * 10 + digit = 12
// Make a recursive calls for left and right updating the appropriate sum to each recusive calls


class SumRootToLeafDigits{

  public int sumRootToLeaf(TreeNode root){

    return dfs(root, 0);

    
  }

  public int dfs(TreeNode root, int sum){

  if(root == null)return 0;

    sum = sum * 10 + root.val; //This technique is used to do the sum of value in digit by digit Ex: 123 => 12 + 13      1
       //                                                                                                              /   \
       //                                                                                                            2       3
    if(root.left == null && root.right == null){
    return sum;
    }

    return dfs(root.left, sum) + dfs(root.right, sum);
    
  }


  
}
