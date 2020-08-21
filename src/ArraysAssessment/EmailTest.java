package ArraysAssessment;
/**
 * There are 4 parts to this test. See the description of each method below.
 *
 * Do not use any libraries (e.g. Apache Commons). You may however use any standard Java classes you like.
 */
public class EmailTest
{
	/**
	 * This method converts an array of ints {1, 2, 3, 4, 5} into a comma-separated String "1, 2, 3, 4, 5".
	 *
	 * You will notice that the output is incorrect, since it ends up with an extra comma at the end.
	 *
	 * Fix this method.
	 */
	private static String arrayToString1( int[] numbers )
	{
		String result = "";
		for (int i = 0; i < numbers.length; i++)
		{
			result += numbers[ i ] + ", ";
		}
		return result;
	}

	/**
	 * This method does the same as the previous method.
	 *
	 * Fix it using a completely different technique to the previous one.
	 */
	private static String arrayToString2( int[] numbers )
	{
		String result = "";
		for (int i = 0; i < numbers.length; i++)
		{
			result += numbers[ i ] + ", ";
		}
		return result;
	}

	/**
	 * Make this method return a new array that is the reverse of the input array.
	 *
	 * The input array must be unchanged.
	 *
	 * i.e. input {1, 2, 3, 4, 5} output {5, 4, 3, 2, 1}
	 */
	private static int[] reverseArray1( int[] numbers )
	{
		int[] result = new int[ numbers.length ];
		return result;
	}

	/**
	 * Make this method reverse the input array.
	 *
	 * This time, instead of returning a new array, you must change the contents of the input array.
	 */
	private static void reverseArray2( int[] numbers )
	{
	}

	/**
	 * The main method is provided for testing purposes. You do not have to change anything.
	 */
	public static void main( String[] args )
	{
		int[] numbers = {1, 2, 3, 4, 5};

		String arrayToString1 = arrayToString1( numbers );
		System.out.println( "arrayToString1 = " + arrayToString1 );
		if (arrayToString1.equals( "1, 2, 3, 4, 5" ))
			System.out.println( "Correct!" );
		else
			System.out.println( "Incorrect" );
		System.out.println();

		String arrayToString2 = arrayToString2( numbers );
		System.out.println( "arrayToString2 = " + arrayToString2 );
		if (arrayToString2.equals( "1, 2, 3, 4, 5" ))
			System.out.println( "Correct!" );
		else
			System.out.println( "Incorrect" );
		System.out.println();

		String reverseArray1 = arrayToString1( reverseArray1( numbers ) );
		System.out.println( "reverseArray1 = " + reverseArray1 );
		if (reverseArray1.equals( "5, 4, 3, 2, 1" ))
			System.out.println( "Correct!" );
		else
			System.out.println( "Incorrect" );
		System.out.println();

		reverseArray2( numbers );
		String reverseArray2 = arrayToString1( numbers );
		System.out.println( "reverseArray2 = " + reverseArray2 );
		if (reverseArray2.equals( "5, 4, 3, 2, 1" ))
			System.out.println( "Correct!" );
		else
			System.out.println( "Incorrect" );
		System.out.println();
	}
}
