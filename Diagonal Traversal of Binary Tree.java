class Tree {
    public ArrayList<Integer> diagonal(Node root){
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        
        LinkedList<Node> q = new LinkedList<>();
        q.addLast(root);
        
        while(q.size() != 0) {
            int size = q.size();
            
            while(size-- > 0) {
                Node rn = q.removeFirst();
                
                while(rn != null) {
                    if(rn.left != null) q.addLast(rn.left);
                    ans.add(rn.data);
                    rn = rn.right;
                }
            }
        }
        
        return ans;
    }
}
