import java.lang.StringBuilder;

public class AllPermute {
	public StringBuilder[] getAllPermute(StringBuilder input) {
		if(input.length() == 1) {
			StringBuilder[] result = new StringBuilder[1];
			result[0] = input;
			return result;
		}

		char firstChar = input.charAt(0);
		input.deleteCharAt(0);
		StringBuilder[] sb = getAllPermute(input);
		StringBuilder[] result = new StringBuilder[(sb[0].length() + 1) * sb.length];

		for(int i = 0; i < result.length; i++) {
			int specific = i/(sb[0].length() + 1);
			int remainder = i % (sb[0].length() + 1);
			result[i] = new StringBuilder(sb[specific].insert(remainder, firstChar).toString());
			sb[specific].deleteCharAt(remainder);
		}

		return result;
	}

	public void printAllPermute(StringBuilder[] result) {
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i].toString());
		}
	}

	public static void main(String[] args) {
		AllPermute ap = new AllPermute();
		StringBuilder input = new StringBuilder(args[0]);
		StringBuilder[] result = ap.getAllPermute(input);
		ap.printAllPermute(result);
	}
}