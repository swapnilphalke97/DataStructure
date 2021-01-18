import java.util.Scanner;

public class searchtree {

	public static void main(String args[])
	{
		int[] i= {4,8,5,6,7,9,10,3};
		BubbleSort sort=new BubbleSort();
		int[] j=new int[8];
		j=sort.sorting(i);
		  System.out.println("Enter value"
		  		+ "");
		Scanner input= new Scanner(System.in);
		int k=input.nextInt();
		serching s=new serching();
	    int position=s.search(k,j,0,7);

	    System.out.println(position);
		
}
	
}