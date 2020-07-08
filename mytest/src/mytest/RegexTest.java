package mytest;

//引入正则表达式包
import java.util.regex.*;

public class RegexTest {
	public static void main(String[] args)
	{
		//正则表达式
		//. 点号匹配任意字符,* 星号零次或多次匹配前面的字符或子表达式。
		String str = "test string";
		//.*test.* 表示：无论 test 前（前一个.*）后（后一个.*）是什么字符，只要出现 test，则表示正则匹配成功。
		String pattern = ".*test.*";
		boolean isMatch = Pattern.matches(pattern,str);
		System.out.println("字符串是否含有子字符串'test'：" + isMatch);
		String pat = "test";//当字符串是 "test"，且没有空白和其他字符时，正则才能匹配成功。
		boolean m = Pattern.matches(pat,str);
		System.out.println("字符串是否为'test'：" + m);
		
	}
}