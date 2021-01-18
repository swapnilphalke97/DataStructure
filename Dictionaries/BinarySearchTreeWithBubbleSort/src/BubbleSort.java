
public class BubbleSort {
	public int[] sorting(int[] array)
	{ int swap;
		for(int i=0;i<=6;i++)
		{
			for(int j=0;j<=6;j++)
			{
				
				if(array[j]<array[j+1])
				{
					continue;
				}
				else
				{
					swap=array[j+1];
					array[j+1]=array[j];
					array[j]=swap;
				}
			}
		}
		return array;
	}

	
	
	
}
