import java.util.ArrayList;
import java.util.Arrays;

public class FindMedian {
	static int binaryMedian(ArrayList<ArrayList<Integer>> a) {
		int r = a.size();
		int c = a.get(0).size();

		int[][] m = new int[a.size()][];
		for (int i = 0; i < a.size(); i++) {
			ArrayList<Integer> row = a.get(i);
			m[i] = row.stream().mapToInt(q -> q).toArray();
		}
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < r; i++) {

			// Finding the minimum element
			if (m[i][0] < min)
				min = m[i][0];

			// Finding the maximum element
			if (m[i][c - 1] > max)
				max = m[i][c - 1];
		}

		int desired = (r * c + 1) / 2;
		while (min < max) {
			int mid = min + (max - min) / 2;
			int place = 0;
			int get = 0;

			// Find count of elements smaller than mid
			for (int i = 0; i < r; ++i) {

				get = Arrays.binarySearch(m[i], mid);

				// If element is not found in the array the
				// binarySearch() method returns
				// (-(insertion_point) - 1). So once we know
				// the insertion point we can find elements
				// Smaller than the searched element by the
				// following calculation
				if (get < 0)
					get = Math.abs(get) - 1;

				// If element is found in the array it returns
				// the index(any index in case of duplicate). So we go to last
				// index of element which will give the number of
				// elements smaller than the number including
				// the searched element.
				else {
					while (get < m[i].length && m[i][get] == mid)
						get += 1;
				}

				place = place + get;
			}

			if (place < desired)
				min = mid + 1;
			else
				max = mid;
		}
		return min;
	}

	public static void main(String[] args) {
		int m[][] = { { 1, 3, 5 }, { 2, 6, 9 }, { 3, 6, 9 } };
		ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
		for (int i = 0; i < m.length; i++) {
			arr.add(new ArrayList<Integer>());
			for (int j = 0; j < m[0].length; j++) {
				arr.get(i).add(m[i][j]);
			}
		}
		System.out.println("Median is " + binaryMedian(arr));
	}
}
