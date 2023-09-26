//Always think of starting with preorder traversal for root to leaf problems
//use compareTo to check for lexicographical less string
//use curr string as a parameter in recersive funtion to keep a track of curr string at each recursive call


class SmallestStringLeafToRoot{
String res = "";
 public String smallestStringLeaf(TreeNode root){
   if(root == null)return "";
  dfs(root, "");
   return res;
   
   
 }

  public void dfs(TreeNode root, String curr){
 if(root == null)return;

    curr = (char)('a' + root.val) + curr;
   
    if(root.left == null && root.right == null){
   if(res.isEmpty() || curr.compareTo(res) < 0){

     res = curr;
   }
      
    }

    dfs(root.left, curr);
    dfs(root.right, curr);
  }
  
}
