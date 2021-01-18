package Queue;

import java.util.Arrays;

public class QueueImplementation {
	int[] queue=new int[8];
	int f=0;
	int r=0;
	int N=8;
    public int size()
    {
    	return (N-f+r)% N;
    }
    public boolean IsEmpty(){
    	if(f==r)
    	{
    		return true;
    	}
    	else
    		return false;
    }
    public int front() {
    	return queue[f];
    }
    public void dequeue()
    {
    	queue[f]=0;
    	f++;
    	f=f%8;
    }
    public void enqueue(int i) {
    	if(((N-f+r)% N)==7)
    	{
    		System.out.print("Queue is Full");
    	}
    	else
    	{
    		queue[r]=i;
    		r=(r+1)%N;
    	}
    }
    public void printqueue() {
    	System.out.print(Arrays.toString(queue));
    }

}
