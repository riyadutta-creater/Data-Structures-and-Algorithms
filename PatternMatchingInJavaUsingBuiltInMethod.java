/**
 * 
 */
package interviewquestion;

/**
 * @author indian
 *
 */
public class PatternMatchingInJavaUsingBuiltInMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ActualText = "riyadutta";
		String Pattern = "iya";
		
		boolean result = ActualText.contains(Pattern);
		
		if(result)
		{
			System.out.println("Pattern Matched");
		}
		else
		{
			System.out.println("Pattern Not Matched");
		}

	}

}
