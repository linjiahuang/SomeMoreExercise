public class Test {
	public static void main(String[] args) {
String str1 = "abcd";
String str2 = "abc";
System.out.println(str1 == (str2 + "d").intern());
	}
}