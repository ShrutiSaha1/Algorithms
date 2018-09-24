import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LargestNumber {

	public String largestNumber(final List<Integer> a) {
	    List<String> arr= new ArrayList<>();
		for(int i: a)
		{
			arr.add(String.valueOf(i));
		}
		Collections.sort(arr, new Comparator<String>() {
			public int compare(String a, String b)
			{
				return (b+a).compareTo(a+b);
			}
		});
		StringBuilder sb = new StringBuilder();
	    for(String s: arr){
	        sb.append(s);
	    }
	 
	    while(sb.charAt(0)=='0'&&sb.length()>1)
	        sb.deleteCharAt(0);
	 
	    return sb.toString();
	}
	
	public static void main(String[] args) {
		LargestNumber obj = new LargestNumber();
		List<Integer> arr= new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(5);
		arr.add(7);
		arr.add(2);
		arr.add(3);
		String res= obj.largestNumber(arr);
		System.out.println(res);
	}
}
