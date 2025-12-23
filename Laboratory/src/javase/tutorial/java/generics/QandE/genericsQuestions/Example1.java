package javase.tutorial.java.generics.QandE.genericsQuestions;

import java.util.Arrays;
import java.util.List;

public class Example1 {
	
	public static <T> int[] countElements(List<T> list){
		int count = 0, result[] = {0,0,0};
		boolean prime = true;
		String reverse = "";
		
		for (T element : list){
			if (element instanceof Integer){
				if ((Integer)element % 2 > 0) 
					result[0]++;
				if ((Integer)element % 2 > 0){
					for (int i=2;i<(Integer)element;i++)
						if ((Integer)element%i==0)
							prime = false;
					if (prime)
						result[1]++;
				}
			}	
			if (element instanceof String){
				for (int i = ((String)element).length() - 1; i >= 0; i--)
					reverse = reverse + ((String)element).charAt(i);
				if (((String)element).equals(reverse))
					result[2]++;
				reverse = "";
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> listInt = Arrays.asList(1,2,3,4,5);
		System.out.println(Arrays.toString(Example1.countElements(listInt)));
		List<String> listStr = Arrays.asList("Hola", "olo");
		System.out.println(Arrays.toString(Example1.countElements(listStr)));
		
	}

}
