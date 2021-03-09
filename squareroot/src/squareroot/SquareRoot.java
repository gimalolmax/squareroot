package squareroot;

public class SquareRoot {

	/**
	 * @pre The argument is nonnegative
	 * 		| 0 <= x
	 * @post The square of the result is not greater then the given number.
	 * 		| result * result <= x
	 * @post The square of one more than the result is greater then the given number.
	 * 		| x < (result+1) * (result+1)
	 */
	public static int squareRoot(int x) {
		int result = 0;
		while (result * result <= x) {
			result++;
		}
		return result - 1;
	}


}
