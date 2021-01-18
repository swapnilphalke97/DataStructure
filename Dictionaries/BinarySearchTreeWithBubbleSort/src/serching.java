
public class serching {
static int answer; static int mid=0;
	public static int search(int k,int[] j,int start,int stop)
	{ 
	
	
		int mid= ((int)(stop-start)/2)+((stop-start)%2) ;
		mid=start+mid;
		
		if(j[mid]==k)
		{
			
		   
			return mid;

		
		}
		else if(j[mid]<k)
		{   
		
			answer= search(k,j , mid+1, stop);	
		}
		else if(j[mid]>k)
			{
				answer=search(k,j , start, mid-1);	
			}
	
		return answer;
			
	}
	
}
