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
		
		//{n} n 是非负整数。表示{n} 之前的字符正好匹配 n 次。
		String f = "food";
		String g = "group";
		String p1 = ".*o{2}.*";//字符 o 出现两次 
		boolean mf = Pattern.matches(p1,f);
		System.out.println("字符串'" + f + "'是否含有两个'o'：" + mf);
		System.out.println("字符串'" + g + "'是否含有两个'o'：" + Pattern.matches(p1,g));
		//{n,} n 是非负整数。表示{n,} 之前的字符至少匹配 n 次。
		String s = "start";
		String p2 = ".*o{1}.*";
		System.out.println("字符串'" + f + "'是否至少含有一个'o'：" + Pattern.matches(p2,f));
		System.out.println("字符串'" + g + "'是否至少含有一个'o'：" + Pattern.matches(p2,g));
		System.out.println("字符串'" + s + "'是否至少含有一个'o'：" + Pattern.matches(p2,s));
		//{n,m} n 和 m 是非负整数,n <= m,匹配之前的字符至少 n 次，至多 m 次
		String p3 = ".*o{2,4}.*";
		System.out.println("字符串'" + f + "'是否含有两个到四个'o'：" + Pattern.matches(p3,f));
		System.out.println("字符串'" + g + "'是否含有两个到四个'o'：" + Pattern.matches(p3,g));
		System.out.println("字符串'" + s + "'是否含有两个到四个'o'：" + Pattern.matches(p3,s));
		String p4 = ".*o{0,1}.*";
		System.out.println("字符串'" + f + "'是否不含有或者只含有一个'o'：" + Pattern.matches(p4,f));//匹配了第一个o
		System.out.println("字符串'" + g + "'是否不含有或者只含有一个'o'：" + Pattern.matches(p4,g));
		System.out.println("字符串'" + s + "'是否不含有或者只含有一个'o'：" + Pattern.matches(p4,s));
	}
}