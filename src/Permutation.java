import java.util.ArrayList;


public class Permutation {
	public ArrayList<ArrayList<Integer>> permute(int[] num) {  
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();  
        if (num == null) {  
            return null;  
        }  
        if (num.length == 0) {  
            return result;  
        }  
        ArrayList<Integer> ArrayList = new ArrayList<Integer>();  
        result = recursion(num, result, ArrayList, 0);  
        return result;  
    }  
  
    public ArrayList<ArrayList<Integer>> recursion(int[] num, ArrayList<ArrayList<Integer>> result,  
            ArrayList<Integer> list, int cur) {  
        if (cur == num.length) {  
            ArrayList<Integer> addArrayList = new ArrayList<Integer>(list);  
            result.add(addArrayList);  
        }  
        for (int i = cur; i < num.length; i++) {  
        	display(list);
        	System.out.println("i= " + i + " num[i]=" + num[i] +" \t cur= " + cur + "  num[cur] = " + num[cur]);
            int temp = num[cur];  
            num[cur] = num[i];  
            num[i] = temp;  
            System.out.println("after change:");
            System.out.println("i= " + i + " num[i]=" + num[i] +" \t cur= " + cur + "  num[cur] = " + num[cur]);
            list.add(num[cur]);  
            display(list);
            System.out.println();
            result = recursion(num,result,list,cur+1);  
            System.out.println("jump out!");
            list.remove(list.size()-1);  
            display(list);
            System.out.println("i= " + i + " num[i]=" + num[i] +" \t cur= " + cur + "  num[cur] = " + num[cur]);
            temp = num[cur];  
            num[cur] = num[i];  
            num[i] = temp;  
            System.out.println("after jump out change:");
            System.out.println("i= " + i + " num[i]=" + num[i] +" \t cur= " + cur + "  num[cur] = " + num[cur]);
            System.out.println();
            System.out.println();
        }  
        return result;  
    }  
    
    public static void show(ArrayList<ArrayList<Integer>> result) {
		int size = result.size();
		
		for (int i=0; i<size; i++) {
			String s = "";
			for (int j=0; j<result.get(i).size(); j++) {
				s += result.get(i).get(j);
				s += " ";
			}
			System.out.println(s);
		}
	}
    
    public static void display(ArrayList<Integer> result) {
    	int size = result.size();
    	
    	String s = "";
    	for (int i=0; i<size; i++) {
    		s += result.get(i);
			s += " ";
		}
		System.out.println(s);
    }
    
    public static void main(String[] args) {
    	int[] num = {1, 2, 3};
    	Permutation p = new Permutation();
    	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>(); 
    	result = p.permute(num);
    	show(result);
    	
    }
}
