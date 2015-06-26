package tiles;

public class FibonacciChecker
{
	/**
	 * Tests whether the passed value is a valid Fibonacci number.
	 * Used when determining whether two tiles will combine to form
	 * a valid tile.
	 *  
	 * @param value The value to check if Fibonacci
	 * 
	 * @return True if a valid Fibonacci number, other wise False;
	 */
	public static boolean isFibonacci(int value) 
	{
		return (isPerfectSquare(5 * (value * value) + 4) || isPerfectSquare(5 * (value * value) - 4));
	}
	
	/**
	 * Tests whether passed value is a perfect square.
	 * Helper function for isFibonacci.
	 * 
	 * @param value The value to test for perfect-squaredness
	 * 
	 * @return True if a perfect square, otherwise False
	 */
	private static boolean isPerfectSquare(int value)
	{	
		int root = (int)Math.sqrt(value);
		
		return (root * root) == value;
	}

}
