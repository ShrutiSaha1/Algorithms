import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NonNegativeSubArray {

	public List<Integer> maxset(List<Integer> a) {
	    
		 long currentSum = 0;
			long maxSum = 0;
			List<Integer> maxArray = new ArrayList<Integer>();
			List<Integer> newArray = new ArrayList<Integer>();

			for (int i = 0; i < a.size(); i++) {
				if (a.get(i) >= 0) {
					currentSum = currentSum + a.get(i);
					newArray.add(a.get(i));
					 if((maxSum == currentSum && maxArray.size() < newArray.size()) || 
			                   maxSum < currentSum)  {
			                    maxSum = currentSum;
			                    maxArray = new ArrayList<>(newArray);
			                }    
				} else {
					currentSum = 0;
					newArray = new ArrayList<Integer>();
				}
			}
		
		return maxArray;
		}
	
	public static void main(String[] args) {
		NonNegativeSubArray obj = new NonNegativeSubArray();
		List<Integer> arr= new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(5);
		arr.add(-7);
		arr.add(2);
		arr.add(3);
		List<Integer> res=obj.maxset(arr);
		System.out.println(Arrays.toString(res.toArray()));
	}
}
