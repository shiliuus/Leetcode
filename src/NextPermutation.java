import java.util.Arrays;


public class NextPermutation {
	public static void nextPermutation(int[] num) {
        int i = num.length-1;
        
        if (i == 0) {
            return;
        }
        
        for (; i>0; i--) {
            if (num[i] > num[i-1]) {
                int minTemp = i;
                for (int j=i; j<num.length; j++) {
                    if (num[j] < num[minTemp] && num[j] > num[i-1]) {
                        minTemp = j;
                    }
                }
                
                swap(num, i-1, minTemp);
                break;
            }
        }
        
        show(num);
        if (i < num.length-2  && num[num.length-1] < num[num.length-2]) {
        	reverse(num, i, num.length-1);
        }
        
    }

	public static void swap(int[] num, int i, int j) {
		int temp = num[i];
		num[i] = num[j];
		num[j] = temp;
	}

	public static void reverse(int[] num, int i, int j) {
		int times = (j-i+1)/2;
		for (int p=0; p<times; p++) {
			swap(num, i, j);
			System.out.println("time " + p);
			show(num);
			i++;
			j--;
		}
		
	}
	
	public static void show(int[] num) {
		StringBuffer sb = new StringBuffer();
		for (int i=0; i<num.length; i++) {
			sb.append(num[i] + " ");
		}
		System.out.println(sb);
	}
	
	
    
	public static void main(String[] args) {
		int[] num = {1, 3, 2};
		nextPermutation(num);
		show(num);
	}

}
