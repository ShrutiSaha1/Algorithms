
public class FindFirstLast {

	int findFirst(int[] arr, int x, boolean searchFirst)
	{
		int start=0;
		int end=arr.length-1;
		int res=-1;
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(x==arr[mid])
			{
				res=mid;
				if(searchFirst)
					end=mid-1;
				else
					start=mid+1;
			}
			else if(x<arr[mid])
			{
				end=mid-1;
			}
			else if(x>arr[mid])
			{
				start=mid+1;
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		int[] arr= {2,6,13,13,13,13,21,36,56,67,98};
		FindFirstLast obj = new FindFirstLast();
		 int res= obj.findFirst(arr, 13, true);
		 if(res==-1) {System.out.println("not found");}
		 else
		 System.out.println("found first at="+res+" index");
		 int resu=obj.findFirst(arr, 13,false);
		 if(resu==-1) {System.out.println("not found");}
		 else
		 System.out.println("found last at="+resu+" index");
		
	}
}
