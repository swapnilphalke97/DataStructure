import java.util.Scanner;

public class Main {

	public static void main(String args[])
	{
		BinaryTree tree= new BinaryTree();

		Scanner s=new Scanner(System.in);
		System.out.print("Enter a no.");
		int key=s.nextInt();
		

	    tree.insert(key);
        tree.insert(3);
        tree.insert(7);
	    tree.insert(1);
	

        
	}
	
}
