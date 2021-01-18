package Stack;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StackMain  implements StackInterface {
  int[] Stack= new int[4]; 
  int top=-1;
	\\Return size of Stack.
	public int size() {
		return top;
	}
        \\Print Stack
	public void getStack()
	{
		System.out.println(Arrays.toString(Stack));
	}
	\\Retrun true if stack is empty
       public boolean isEmpty() {	
		if(top==-1)
		{return true;}
		else
		{return false;}
	}
        \\Return top element of stack
	public int top() {
		if(top==-1)
		  {
		System.out.println("Stack is Empty");
		return 0;
		  }
		else
		  {
		    return Stack[top];
		  }
	}
        \\Insert element in Stack
	public void push(int i) {
		try{top++;
		Stack[top]=i;}
		catch(Exception e)
		{
			System.out.print("Size has exceeded");
		}
		
	}
       \\delete top element of stack
	public void pop() {
		if(top==-1)
		  {
			System.out.println("Stack is Empty");
                   }
		else
		  { 
			int[] Copy= new int[4];
			for(int i=0;i<=top-1;i++)
			    {
				   Copy[i]=Stack[i];
			    }
			Stack=Copy;
                     }
}