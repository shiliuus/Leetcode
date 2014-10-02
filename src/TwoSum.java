import java.util.Arrays;


public class TwoSum {
	public int[] twoSum(int[] numbers, int target) {
        int[] temp = new int[2];
        int[] result = new int[2];
        
        int[] arr = new int[numbers.length];
        for (int i=0; i<numbers.length; i++) {
        	arr[i] = numbers[i];
        }
        Arrays.sort(arr);
        display(numbers);
        display(arr);
        
        int left = 0;
        int right = arr.length-1;
        
        while (left < right) {
            if (arr[left] + arr[right] < target) {
                left++;
            } else if (arr[left] + arr[right] > target){
                right--;
            } else {
                temp[0] = arr[left];
                temp[1] = arr[right];
                break;
            }
        }
        
        display(temp);
        
        for (int i=0; i<numbers.length; i++) {
        	System.out.println("numbers[" + i + "]=" + numbers[i]);
            if (temp[0] == numbers[i] || temp[1] == numbers[i]) {
                result[0] = i+1;
                System.out.println(result[0]);
                break;
            }
            System.out.println("next");
        }
        
        for (int i=0; i<numbers.length; i++) {
            if (result[0]-1 != i && (temp[1] == numbers[i] || temp[0] == numbers[i])) {
                
                    result[1] = i+1;
                    break;
        }
        }
        
        return result;
    }
	
	public void display(int[] array) {
		String s = "";
		for (int i=0; i<array.length; i++) {
			s += array[i] + " ";
		}
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		int[] numbers = {3, 2, 4};
		int target = 6;
		int[] result = new int[2];
		
		TwoSum t = new TwoSum();
		result = t.twoSum(numbers, target);
		System.out.println("index1 = " + result[0] + "\n index2 = " + result[1]);
		
		System.out.println(5/2);
	}
}
