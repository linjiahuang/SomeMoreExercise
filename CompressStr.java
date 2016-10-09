public class CompressStr {
	public static int countStr(String str) {
		if(str == null || str.length() == 0)
			return 0;
		char current = str.charAt(0);
		int count = 1;
		int size = 0;
		for(int i = 1; i < str.length(); i++) {
			char next = str.charAt(i);
			if(next == current) {
				count++;
			}
			else {
				size += 1 + String.valueOf(count).length();
			}
		}
		size += 1 + String.valueOf(count).length();
		return size;
	}

	public static void main(String[] args) {
		System.out.println(countStr(args[0]));
	}
}