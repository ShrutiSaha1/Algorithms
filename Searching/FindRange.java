import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindRange {
	public ArrayList<Integer> searchRange(final List<Integer> a, int b) {
	    int[] arr=a.stream().mapToInt(i->i).toArray();
	    FindFirstLast obj= new FindFirstLast();
	    int first=obj.findFirst(arr, b, true);
	    int last=obj.findFirst(arr, b, false);
	    ArrayList<Integer> res= new ArrayList<Integer>();
	    res.add(first);
	    res.add(last);
	    return res;
	}
	public static void main(String[] args) {
		int[] a= { 5, 7, 7, 8, 8, 10};
		ArrayList<Integer> arr= new ArrayList<>();
		for(int i=0;i<a.length;i++)
		{
			arr.add(i, a[i]);
		}
		FindRange obj = new FindRange();
		ArrayList<Integer> res= new ArrayList<>();
		res=obj.searchRange(arr, 8);
		System.out.println(Arrays.toString(res.toArray()));
	}
}
