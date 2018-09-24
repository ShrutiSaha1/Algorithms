import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class FirstMissingInt {

	public int firstMissingPositive(ArrayList<Integer> arr) {
		int[] A = new int[arr.size()];
		for (int i = 0; i <arr.size(); i++) {
			A[i]=arr.get(i);
		}
		int n=A.length;
        for(int i=0;i<n;i++){
            if(A[i]>0&&A[i]<=n){
                if(A[i]-1!=i&&A[A[i]-1]!=A[i]){
                    int temp=A[A[i]-1];
                    A[A[i]-1]=A[i];
                    A[i]=temp;
                    i--;
                }
            }
        }
        for(int i=0;i<n;i++)
            if(A[i]!=i+1)
                return i+1;
        return n+1;
	}

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(-1);
		arr.add(2);
		arr.add(1);
		
		//int[] arr= {-8,-7,-5};

		FirstMissingInt obj = new FirstMissingInt();
		int n = obj.firstMissingPositive(arr);
		System.out.println(n);
	}
}
