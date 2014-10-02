import java.util.ArrayList;


public class PermutationSequence {
	public static void main(String[] args) {
		PermutationSequence p = new PermutationSequence();
		System.out.println(p.getPermutation(2, 2));
	}
	
	public int factorial(int n) {
		int result = 1;
		if (n < 0) {
			return -1;
		} else if (n==0) {
			return result;
		} else {
			for (int i=1; i<=n; i++) {
				result *= i;
			}
			return result;
		}
	}
	
	public String getPermutation(int n, int k) {
		if (n<0 || k<0 || k>factorial(n)) {
			System.out.println("here is wrong");
			return new String();
		}
		StringBuilder sb = new StringBuilder();
		ArrayList<Integer> num = new ArrayList<Integer>();
		int[] factor = new int[n];
		
		for (int i=1; i<=n; i++) {
			num.add(i);
		}
		
		for (int i=0; i<n; i++) {
			factor[i] = factorial(n);
		}
		
		
		for (int i=0; i<n; i++) {
			int f = factor[n-i-1];
			int j = 0;
			if (f*j < k) {
				j++;
			}
			j--;
			k -= j*f;
			sb.append(String.valueOf(num.get(j)));
			num.remove(j);
		}
		
		return sb.toString();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
