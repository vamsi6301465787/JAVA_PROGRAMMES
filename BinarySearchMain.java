class BinarySearch
{
	void binarySearch(int array[],int key)
	{
		int l=0,r=array.length-1,flag=0;
		while(l<=r)
		{
			int m=(l+r)/2;
			if(array[m]==key)
			{
				flag=1;
				System.out.println("Search element "+key+" is found at position : "+m);
				break;
			}
			if(array[m]<key)
			{
				l=m+1;
			}
			else
			{
				r=m-1;
			}
		}
			if(flag==0)
			{
				System.out.println("Search element "+key+" is not found");
			}
	}
}

public class BinarySearchMain{
		public static void main(String[] args){
		int[] array = new int[args.length];
		int n = args.length-1;
		
			for (int i = 0; i < n; i++)
			{
		      array[i] = Integer.parseInt(args[i]);
			}
			int key = Integer.parseInt(args[n]);
			BinarySearch biSearch = new BinarySearch();
			biSearch.binarySearch(array, key);
	}
}
