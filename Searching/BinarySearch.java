
public class BinarySearch {

	int search(int[] arr, int x)
	{
		int start=0;
		int end=arr.length-1;
		while(start<=end)
		{
			//int mid=(end+start)/2;
			int mid=start+(end-start)/2; //end+start may sometime result in value exceeding int..for bigger arrays..
			if(x==arr[mid])
				return mid;
			else if(x<arr[mid]) {
				end=mid-1;
			}
			else if(x>arr[mid])
			{
				start=mid+1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr= {2,6,13,21,36,56,67,98};
		int x=13;
		BinarySearch obj = new BinarySearch();
		int res= obj.search(arr, x);
		if(res==-1)
			System.out.println("not found");
		else
			System.out.println("found at="+res+" index");
	}
}
