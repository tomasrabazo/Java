package lesson5.PrefixSums;

public class NumArray {

	/**
	 * 
	 * @param mushrooms
	 *            number of mushrooms in each spot.
	 * @param currentSpot
	 *            - index of current post.
	 * @param noOfMovesAllowed
	 *            - no of moves allowed to collect maximum nunber of possible
	 *            mushrooms.
	 * @return maximum number of mushrooms collected.
	 */
	public int getMaxMushrooms(int[] mushrooms, int currentSpot, int noOfMovesAllowed) {
		int n = mushrooms.length;
		int result = 0;
		int[] pref = prefixSum(mushrooms);
		
		// We start doing one movement to the Left, we need to know how many movements to the left we can do, to iterate to the left that number of times.
		// To know that, we have to take account of "currentSpot" and "noOfMovesAllowed". We have to take the min number between "currentSpot" and "noOfMovesAllowed",
		// That number is going to be the number of iterations to the left allowed.
		// As minimun there is one iteration, for intance, if noOfMovesAllowed=0 we have to iterate at least one time, that is because we have "... + 1"
		int upper = Math.min(currentSpot, noOfMovesAllowed) + 1;
		
		// We move one to the left and the rest to the right.
		for (int index = 0; index < upper; index++) {
			// One step to the left, starting on position 0, index = 0;
			int leftPos = currentSpot - index;
			// How many steps to the right? Now we have to know how many positions to the right we can jump. 
			// We start from "currentSpot" and we can jump to the right starting from that position jumping to the right "noOfMovesAllowed" (substracting jumps to the left done).
			// But the limit is the lengh of the array - 1, that is, we calculate the min between the above calculation and array.leng - 1
			// Substract 2 because it starts moving one to the left and come back another step to the right, in total 2 movements less to the right.
			int rightPos = Math.min(n - 1, Math.max(currentSpot, currentSpot + noOfMovesAllowed - 2 * index));
			result = Math.max(result,countSum(pref, leftPos, rightPos));
		}
		System.out.println("");

		// We start doing one movement to the Right, we need to know how many movements to the Right we can do, to iterate to the right that number of times.
		// To know that, we have to take account of "currentSpot" and "noOfMovesAllowed". We have the limit on "n - currentSpot", that is going to be the total jumps 
		// to the right. But we have to know how many moves are allowed. Then we calculate the minimun between the movements allowed and the distance to the end of the array.
		// That number is going to be the total jumps to the right.
		upper = Math.min(noOfMovesAllowed + 1, n - currentSpot);
		
		// We move one to the right and the rest to the left.
		for (int index = 0; index < upper; index++) {
			// On step to the right every loop.
			int rightPos = currentSpot + index;
			// How many steps to the left? Now we have to know how many positions to the left we can jump.
			// We start from "currentSpot" and we can jump to the left starting from that position jumping to the left minus "noOfMovesAllowed" (substracting jumps to the right done).
			// But the minimun is 0, that is, we calculate the max between the above calculation and 0.
			// Substract 2 because it starts moving one to the right and come back another one to the left, in total 2 movements less to the left.
			int leftPos = Math.max(0, Math.min(currentSpot, currentSpot - (noOfMovesAllowed - 2  * index)));
			result = Math.max(result,countSum(pref, leftPos, rightPos));
		}
		
		return result;
	}

	/*
	 * 
	 */
	public int countSum(int[] p, int startIndex, int endIndex) {
		
		int result = p[endIndex + 1] - p[startIndex];
		System.out.println("i,j:" + startIndex + "," + endIndex + "->" + result); 
		return result;
	}

	/*
	 * Calculate prefix sum for the array.
	 */
	public int[] prefixSum(int[] a) {
		int len = a.length;
		int[] sum = new int[len + 1];

		for (int index = 1; index < len + 1; index++) {
			sum[index] = sum[index - 1] + a[index - 1];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = { 2,3,7,5,1,3,9 }; 

		NumArray numArray = new NumArray();
		/*
		System.out.println(numArray.getMaxMushrooms(number,4,6)); // 25 OK	
		
		for (int i=0;i<number.length;i++)
			System.out.println("pos:" + i + "-" + numArray.getMaxMushrooms(number, i, 0));
		*/
		
		System.out.println("Max:" + numArray.getMaxMushrooms(number,4,6)); 
	}

}
