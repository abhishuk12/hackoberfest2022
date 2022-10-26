class Solution

{

    //Function to count number of nodes in BST that lie in the given range.

    int getCount(Node root,int l, int h)

    {

        ArrayList<Integer> arli = new ArrayList<>();

        preorder(root,arli);

        // System.out.println(arli);

        int count=0;

        for(int i=0;i<arli.size();i++) {

            if((arli.get(i)>=l) && (arli.get(i)<=h)) count++;

        }

        return count;

        //Your code here

    }

    public void preorder(Node root,ArrayList<Integer> arli) {

        if(root == null) return;

        preorder(root.left,arli);

        arli.add(root.data);

        preorder(root.right,arli);

    }

}
