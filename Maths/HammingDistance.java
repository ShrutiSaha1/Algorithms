
/* HammingDistance(2, 7) = 2, as only the first and the third bit differs in the binary representation of 2 (010) and 7 (111).
 * 
 * Let f(x, y) be the hamming distance defined above.

A=[2, 4, 6]

We return,
f(2, 2) + f(2, 4) + f(2, 6) + 
f(4, 2) + f(4, 4) + f(4, 6) +
f(6, 2) + f(6, 4) + f(6, 6) = 

0 + 2 + 1
2 + 0 + 1
1 + 1 + 0 = 8
 * 
 * */

import java.util.ArrayList;
import java.util.List;

public class HammingDistance {
	public int hammingDistance(final List<Integer> A) {
		int total=0;
		int xor=0;
		for(int i=0;i<A.size();i++)
		{
			for(int j=0;j<A.size();j++)
			{
				xor=(A.get(i)|A.get(j))-(A.get(i)&A.get(j));
				total=total+Integer.bitCount(xor);
			}
		}
		return total;
	}
	public static void main(String[] args) {
		HammingDistance obj = new HammingDistance();
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(5);
		arr.add(4);
		arr.add(6);
		int sum=obj.hammingDistance(arr);
		System.out.println(sum);
	}
}
