/**
 * A generic class that is responsible for converting an Integer to any other base representation.
 * @author Muhammed Mahrous
 * */
package integer_representations;
public class IntegerConverter {
	private int base;
	private String prefix;

	/*
	 * @param base Int value representing base to convert numbers to
	 * @param prefix String that acts as a prefix before the conveted number, for example "0x", "0b" or "0" ... etc 
	 * */
	public IntegerConverter(int base, String prefix) {
		this.base = base;
		this.prefix = prefix;

	}

	/* the function that is responsible for converting an int number to the object base. 
	 * @param num the Int number to be converted
	 * @return the String of converted value that consists of the prefix string then the converted number 
	 * */
	public String toBase(int num) {
		String returnValue;
		if (num == 0)
			returnValue = prefix;
		else {
			int divResult, divReminder;
			divResult = num / base;
			divReminder = num % base;
			returnValue = toBase(divResult) + Integer.toString(divReminder);
		}
		return returnValue;
	}
}
