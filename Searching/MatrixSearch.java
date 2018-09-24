import java.util.ArrayList;
import java.util.Arrays;

public class MatrixSearch {
	public int searchMatrix(ArrayList<ArrayList<Integer>> a, int b) {

		int rw = a.size();
		int col = a.get(0).size();
		int[][] matrix = new int[a.size()][];
		for (int i = 0; i < a.size(); i++) {
			ArrayList<Integer> row = a.get(i);
			matrix[i] = row.stream().mapToInt(q -> q).toArray();
		}
		int n= rw*col;
		int[] arr= new int[n];
		int k=0;
		for(int i=0; i<rw;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[k++]=matrix[i][j];
			}
		}
		
		int res=Arrays.binarySearch(arr, b);
		System.out.println("resu="+res);
		if(res<0)
			return 0;
		else
			return 1;
	}

	public static void main(String[] args) {
		MatrixSearch obj = new MatrixSearch();
		int m[][] = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 50 } };
		ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
		for (int i = 0; i < m.length; i++) {
			arr.add(new ArrayList<Integer>());
			for (int j = 0; j < m[0].length; j++) {
				arr.get(i).add(m[i][j]);
			}
		}
		int res = obj.searchMatrix(arr, 2);
		System.out.println(res);
	}
}


/* interiewBits Solution
 * 
 * 
 * 
 * public int searchMatrix(ArrayList<ArrayList<Integer>> a, int b) {
	    //do binary search in arraylist of arraylist to select in which arraylist you want to search
	    int first = 0,last = a.size()-1;
	    while(first<=last){
	        int mid = (first+last)/2;
	        ArrayList<Integer> x = a.get(mid);
	        if(x.get(x.size()-1)>=b && x.get(0)<=b)
	          return binarySearch(x,b);
	        else if(x.get(x.size()-1)<b)
	          first = mid+1;
	        else if(x.get(0)>b)
	          last = mid-1;
	    }
	    return 0;
	}
	public int binarySearch(ArrayList<Integer> a,int b){
	    //do binary search in the selected arraylist
	    int first = 0,last = a.size()-1;
	    while(first<=last){
	        int mid = (last+first)/2;
	        if(a.get(mid)==b)
	          return 1;
	        else if(a.get(mid)>b)
	          last = mid-1;
	        else
	         first = mid+1;
	    }
	    return 0;
	}
 */
