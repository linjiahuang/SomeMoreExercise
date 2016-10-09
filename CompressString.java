import java.lang.StringBuffer;

public class CompressString {
	public static String compressString(String original) {
		StringBuffer strBuf = new StringBuffer();
		int length = original.length();
		for (int i = 0; i < length; i++) {
			char item = original.charAt(i);
			int j = i+1;
			while (j < length && original.charAt(j) == item)
				j++;
			if (j-i > 1) {
				String strItem = item + Integer.toString(j-i);
				strBuf.append(strItem);
			}
			else {
				strBuf.append(Character.toString(item));
			}
			i = j-1;
		}
		if (length > strBuf.length())
			return strBuf.toString();
		else
			return original;
	} 

	public static void main(String[] args) {
		System.out.println(compressString(args[0]));

	}
}