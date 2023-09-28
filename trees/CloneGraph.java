//Cloning a same exact graph
//Use a map to store the current node as a key and create a copy of this current node and put it in the place of value
//we can use either Recursive or Queue i.e, DFS or BFS 
//for each neighbor put it in map if not contains and then copy the current node neighbors to out copied node like below
// map.get(currNode).neighbors.add(map.get(neighborNode))
//Basically, map.values contains copied nodes which we have to return 



class Node{

  int val;
  List<Node> neighbors;
  
  public Node(int val){
    this.val = val;
     neighbors = new ArrayList<>();
  }

  public Node(int val, List<Node> neighbors){
    this.val = val;
    this.neighbors = neighbors;
  }

  
}

class CloneGraph{

  HashMap<Node, Node> map = new HashMap<>();
  public Node cloneGraph(Node node){
    if(node == null)return null;

    map.put(node, new Node(node.val));
    dfs(node);
    return map.get(node);
    
  }

  public void dfs(Node currNode){

    if(currNode == null)return;

    for(Node neighbor : currNode.neighbors){

      if(!map.containsKey()){
    map.put(neighbor, new Node(neighbor.val);
        dfs(neighbor);
        
      }

      map.get(currNode).neighbors.add(map.get(neighbor));
      
    }
    
  }

  
}
