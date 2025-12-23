package lesson4.CountingElements.MaxCounters;

public class Solution {

	/*/
	public int[] solution(int N, int[] A) {
		int[] counters = new int[N];
		int max = 0;
		int prevMax = 0;

		for (int elem : A) {
			if (elem == N + 1) {
				prevMax = max;
			} else {
				refresh(counters, elem - 1, prevMax);
				counters[elem - 1]++;
				max = Math.max(max, counters[elem - 1]);
			}
		}

		for (int i = 0; i < counters.length; i++) {
			refresh(counters, i, prevMax);
		}

		return counters;
	}

	void refresh(int[] counters, int index, int prevMax) {
		counters[index] = Math.max(counters[index], prevMax);
	}
	*/
	/**/
	
	/* 88%, 5.21 /
	public int[] solution(int N, int[] A) {

		int maxcounter = 0, priorMax = 0, num = 0;
		int[] counters = new int[N];
				
		for (int i=0;i<A.length;i++){
			if (1<=A[i] && A[i]<=N){
				counters[A[i]-1]++;
				if (maxcounter < counters[A[i]-1])
					maxcounter = counters[A[i]-1];
			}
			else if (priorMax != maxcounter){
				for (int x=0;x<counters.length;x++)
					counters[x] = maxcounter;
				priorMax = maxcounter;
			}
		}
		
		return counters;
	}
	/*/

	public int[] solution(int N, int[] A) {

		int maxcounter = 0, prevMax = 0, num = 0;
		int[] counters = new int[N];
				
		for (int i=0;i<A.length;i++){
			if (A[i]==N+1)
				prevMax = maxcounter;
			else
			if (1<=A[i] && A[i]<=N){
				counters[A[i]-1] = Math.max(counters[A[i]-1], prevMax);
				counters[A[i]-1]++;
				maxcounter = Math.max(counters[A[i]-1], maxcounter);
			}
		}
		
		for (int x=0;x<counters.length;x++)
			counters[x] = Math.max(counters[x], prevMax);
		
		return counters;
	}
	
	public static void main(String arry[]) {
		//int[] number = { 3,4,4,6,1,4,4 };// , 6 , 7, 8, 1}; 
		int[] number = { 3,4,4,6,1,4,4 };// , 6 , 7, 8, 1}; 
		
		Solution sol = new Solution();
		
		int[] countersol = sol.solution(5, number);
		
		for (int i=0;i<countersol.length;i++){
			System.out.println(countersol[i]);
		}
	}
}
