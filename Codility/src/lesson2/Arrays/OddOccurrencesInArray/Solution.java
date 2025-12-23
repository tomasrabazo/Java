package lesson2.Arrays.OddOccurrencesInArray;

/*
 * TreeSet   , TreeMap   : 77 %
 * LinkedList, ArrayList : 66 %
 */
public class Solution {
	/*
	 * public int solution(int[] number) {
	 * 
	 * int aux = 0, oldvalue = 0; ArrayList al = new ArrayList(); Integer intObj
	 * = null;
	 * 
	 * for(int i=0;i<number.length;i++){ aux = number[i];
	 * 
	 * intObj = new Integer(aux); if (al.contains(intObj)) al.remove(intObj);
	 * else al.add(intObj);
	 * 
	 * }
	 * 
	 * return ((Integer)al.get(0)).intValue(); }
	 */
	public int solution(int[] A) {
		int unpaired = 0;
		for (int number : A) {
			unpaired = unpaired ^ number;
		}
		return unpaired;
	}

	public static void main(String arry[]) {
		//int[] number = { 9, 3, 9, 3, 9, 7, 9 };
		//int[] number = { 5, 3, 9, 3, 0, 9, 0 };
		int[] number = { 3, 9, 3};

		Solution sol = new Solution();
		System.out.println(sol.solution(number));

	}
}
