import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class RotatedArray {
	
	public int findMin(int[] input) {
		int lo = 0; 
		int hi = input.length - 1;
		int mid = lo + (hi - lo)/2;
		while (mid != lo) {
			if (input[mid] > input[hi])
				lo = mid;
			else 
				hi = mid;
			mid = lo + (hi - lo)/2;
		}
		if (input[lo] < input[hi])
			return lo;
		else
			return hi;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> ls = new ArrayList<Integer>();
		while (sc.hasNext())
			ls.add(sc.nextInt());
		Integer[] input = ls.toArray(new Integer[0]);
		int[] intInput = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			intInput[i] = input[i];
		}

		RotatedArray ra = new RotatedArray();
		System.out.println(ra.findMin(intInput));

	}
}