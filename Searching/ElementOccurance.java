import java.util.ArrayList;
import java.util.List;

public class ElementOccurance {
	public int findCount(final List<Integer> a, int b) {
		int[] arr=a.stream().mapToInt(i->i).toArray();
		FindFirstLast obj= new FindFirstLast();
		int first=obj.findFirst(arr, b, true);
		if(first==-1)
			return 0;
		int last=obj.findFirst(arr, b, false);
		if(last==-1)
			return 0;
		int count=(last-first)+1;
		return count;
	}
	public static void main(String[] args) {
		ElementOccurance obj= new ElementOccurance();
		
		int[] a= { 4, 7, 7, 7, 8, 10, 10};
		ArrayList<Integer> arr= new ArrayList<>();
		for(int i=0;i<a.length;i++)
		{
			arr.add(i, a[i]);
		}
		int res=obj.findCount(arr, 7);
		System.out.println(res);
	}
}
