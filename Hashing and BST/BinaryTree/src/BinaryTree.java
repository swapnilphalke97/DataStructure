
public class BinaryTree {
	
	
	Node root =null;
	
	
public Node insert(int key)
	{
		 root = insert(key,root);
		 System.out.print(root.key);
		 return root;
	}
	
	
 public Node insert(int key, Node root)
 {		 if(root==null)
	 {
		 System.out.print(77);
		 root=new Node();
		 root.key=key;
         return root;
	 }
        else if(key>root.key)
	 {    System.out.print(99);
	 root.right=insert(key,root.right);
	 
	}
	else if(key<root.key)
	 {    System.out.print(88);

	 root.left=insert(key,root.left);
		

	  }
	 return root;
 }


}
